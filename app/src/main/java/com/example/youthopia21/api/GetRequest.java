package com.example.youthopia21.api;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.os.AsyncTask;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import org.json.JSONObject;

public class GetRequest extends AsyncTask<String, Void, String> {
    JSONObject jsonObject = new JSONObject();

    private MyAsyncTaskkGetListener mListener;
    Context context;
    public GetRequest(Context context) {
        this.context=context;
    }

    final public void setListener(MyAsyncTaskkGetListener listener) {
        mListener = listener;
    }

    @Override
    final protected void onPreExecute() {
        // common stuff
        if (mListener != null)
            mListener.onPreExecuteConcluded();
    }

    @Override
    final protected String doInBackground(String... params) {
        // do stuff, common to both activities in here

        Response response = null;
        String result = null;
        try {
            MediaType JSON
                    = MediaType.parse("application/json; charset=utf-8");
            OkHttpClient client = new OkHttpClient();
            String token;

            if (params[3] != null) {
                token = params[3];
            }
            RequestBody body = RequestBody.create(JSON, params[1]);
            Request request = new Request.Builder()
                    .url(params[0])
                    .addHeader("email", params[2])
                    .addHeader("content-type", "application/json")
                    .addHeader("x-auth-token", params[3])
                    .build();
            Log.d("x-auth-token","="+params[3]);
            response = client.newCall(request).execute();
            if (response.code() == 403) {
                result = "fail";
            }else {
                result = response.body().string();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;

    }

    @Override
    final protected void onPostExecute(String result) {
        // common stuff

        if (mListener != null)
            mListener.onPostExecuteConcluded(result);
    }


    public interface MyAsyncTaskkGetListener {
        void onPreExecuteConcluded();

        void onPostExecuteConcluded(String result);
    }
}