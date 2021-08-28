package com.ths.youthopia21;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.hbb20.CountryCodePicker;


public class ContactFragment extends Fragment {

    private EditText edtName, edtSchoolName, edtMail,  edtPhoneNumber, edtMessage;
    private Button btnSubmit, btnClear;
    private CountryCodePicker countryCodePicker;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_contact,container,false);

        edtName = v.findViewById(R.id.edtName);
        edtSchoolName = v.findViewById(R.id.edt_SchoolName);
        edtMail = v.findViewById(R.id.edt_Mail);

        edtPhoneNumber = v.findViewById(R.id.phone_number);
        edtMessage = v.findViewById(R.id.message);

        countryCodePicker = v.findViewById(R.id.ccp);
        btnSubmit = v.findViewById(R.id.submit);
        btnClear = v.findViewById(R.id.clear);




        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(edtName.getText().toString()) && TextUtils.isEmpty(edtSchoolName.getText().toString())
                        && TextUtils.isEmpty(edtMail.getText().toString()) && TextUtils.isEmpty(edtPhoneNumber.getText().toString())
                        && TextUtils.isEmpty(edtMessage.getText().toString())) {
                    edtName.setText("");
                    edtSchoolName.setText("");
                    edtMail.setText("");
                    edtPhoneNumber.setText("");
                    edtMessage.setText("");
                    Toast.makeText(getContext(), "All the fields are empty", Toast.LENGTH_LONG).show();
                } else {
                    edtName.setText("");
                    edtSchoolName.setText("");
                    edtMail.setText("");
                    edtPhoneNumber.setText("");
                    edtMessage.setText("");
                    Toast.makeText(getContext(), "Cleared", Toast.LENGTH_LONG).show();
                }
            }
        });



        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(edtName.getText().toString()) || TextUtils.isEmpty(edtSchoolName.getText().toString())
                        || TextUtils.isEmpty(edtMail.getText().toString()) || TextUtils.isEmpty(edtPhoneNumber.getText().toString())
                        || TextUtils.isEmpty(edtMessage.getText().toString())) {


                    new AlertDialog.Builder(getContext())
                            .setTitle("Incomplete")
                            .setMessage("Please fill up all the fields.")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                   //none
                                }
                            })

                            // A null listener allows the button to dismiss the dialog and take no further action.
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();


                }
                else {

                    String name = edtName.getText().toString();
                    String ccp = countryCodePicker.getSelectedCountryCode().toString();
                    String country = countryCodePicker.getSelectedCountryName().toString();
                    String message = "School Name : " + edtSchoolName.getText().toString()+"\n"+"Country : "+country+ "\n" + "Email : " + edtMail.getText().toString()
                            + "\n" + "Contact Number : " + ccp + " " + edtPhoneNumber.getText().toString() + "\n\n" + "Query/Issue :" + "\n" + edtMessage.getText().toString();

                   /*String username = edtMail.getText().toString();
                   String password = edtPassword.getText().toString();
                   String mail1 = "pronobesh.chatterjee@gmail.com";
                   String mail2 = "pronobesh.chatterjee@theheritageschool.net.in";

                   Properties props = new Properties();
                   props.put("mail.smtp.auth","true");
                    props.put("mail.smtp.starttls.enable","true");
                    props.put("mail.smtp.host","smtp.gmail.com");
                    props.put("mail.smtp.port","587");
                    Session session = Session.getInstance(props,
                            new javax.mail.Authenticator(){
                                @Override
                                protected PasswordAuthentication getPasswordAuthentication() {
                                    return new PasswordAuthentication(username,password);
                                }
                            });
                    try {
                        Message mess = new MimeMessage(session);
                        mess.setFrom(new InternetAddress(username));
                        mess.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mail1));
                        mess.setRecipients(Message.RecipientType.CC, InternetAddress.parse(mail2));
                        mess.setSubject(name);
                        mess.setText(message);
                        Transport.send(mess);
                        Toast.makeText(getContext(), "Mail Sent", Toast.LENGTH_LONG).show();
                    }catch (MessagingException e){
                        throw new RuntimeException(e);
                    }*/


                    Intent emailIntent = new Intent(Intent.ACTION_SEND);
                    emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"youthopia2021@theheritageschool.org","president.youthopia@theheritageschool.org"});
                    emailIntent.putExtra(Intent.EXTRA_CC, new String[]{"techhead.youthopia@theheritageschool.org","pronobesh.chatterjee@theheritageschool.net.in"});
                    emailIntent.putExtra(Intent.EXTRA_SUBJECT, name);
                    emailIntent.putExtra(Intent.EXTRA_TEXT, message);
                    emailIntent.setType("message/rfc822");
                    startActivity(Intent.createChooser(emailIntent, "Choose your email client!"));



                }

            }
        });

        /*StrictMode.ThreadPolicy threadPolicy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(threadPolicy);*/

        return v;
    }
}
