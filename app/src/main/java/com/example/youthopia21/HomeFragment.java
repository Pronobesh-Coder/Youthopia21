package com.example.youthopia21;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.example.youthopia21.api.GetRequest;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import org.json.JSONObject;


public class HomeFragment extends Fragment {


    private ConstraintLayout goToAboutSchool, goToAboutYouth, update;
    private TextView donaDrive, update_title;
    String desc;
    String imageurl;

    SliderView sliderView;
    int[] images = {R.drawable.so1,
    R.drawable.so2,
    R.drawable.so3,
    R.drawable.so4};


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home,container,false);


        goToAboutSchool = v.findViewById(R.id.school_click);
        goToAboutYouth = v.findViewById(R.id.youth_click);
        sliderView = v.findViewById(R.id.imageSlider);
        donaDrive = v.findViewById(R.id.don_click);
        update = v.findViewById(R.id.updates_click);
        update_title = v.findViewById(R.id.textView2);


        getDailyUpdate(getActivity());

        goToAboutSchool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),AboutSchool.class));
            }
        });

        goToAboutYouth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), AboutYouthopia.class));
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(getActivity(), updated_page.class));
                Intent intent = new Intent(getActivity(),updated_page.class);
                intent.putExtra("desc",desc);
                intent.putExtra("imgurl", imageurl);
                startActivity(intent);
            }
        });

        SliderAdapter sliderAdapter = new SliderAdapter(images);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();


        donaDrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), DonationDrive.class));
            }
        });

        return v;

    }

    private void getDailyUpdate(Context context) {
        GetRequest aTask = new GetRequest(context);
        aTask.setListener(new GetRequest.MyAsyncTaskkGetListener() {
            @Override
            public void onPreExecuteConcluded() {
                //Loader Will come here
            }

            @Override
            public void onPostExecuteConcluded(String result) {
                Log.d("Result______", "=" + result);
                try {

                    JSONObject jsonObject = new JSONObject(result);
                    String title = jsonObject.getString("title");
                    desc = jsonObject.getString("text_desc");
                    imageurl = jsonObject.getString("img_url");
                    Log.d("title______", "=" + title);
                    Log.d("text_desc______", "=" +desc);
                    Log.d("img_url______", "=" + imageurl);
                    update_title.setText(title);



                } catch (Exception e) {
                    e.printStackTrace();

                }

            }
        });
        aTask.execute("http://demo1485000.mockable.io/daily_update", "", "", "");
    }

}
