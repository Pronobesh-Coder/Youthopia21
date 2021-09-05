package com.ths.youthopia21;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class EventsFragment extends Fragment {


    ImageView le1,le2,le3,le4,le5,le6,le7,le8,le9,ge1,ge2,ge3,bs1,bs2,bs3,bs4,vs1,vs2,vs3,vs4,vs5,vs6,vs7,vs8,vs9,vs10,vs11,vs12,vs13,vs14,vs15,vs16,vs17;

    Button day1y,day2y,day3y;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_events,container,false);

        le1 = v.findViewById(R.id.le_1);
        le2 = v.findViewById(R.id.le_2);
        le3 = v.findViewById(R.id.le_3);
        le4 = v.findViewById(R.id.le_4);
        le5 = v.findViewById(R.id.le_5);
        le6 = v.findViewById(R.id.le_6);
        le7 = v.findViewById(R.id.le_7);
        le8 = v.findViewById(R.id.le_8);
        le9 = v.findViewById(R.id.le_9);
        ge1 = v.findViewById(R.id.ge1);
        ge2 = v.findViewById(R.id.ge2);
        ge3 = v.findViewById(R.id.ge3);
        bs1 = v.findViewById(R.id.bs1);
        bs2 = v.findViewById(R.id.bs2);
        bs3 = v.findViewById(R.id.bs3);
        bs4 = v.findViewById(R.id.bs4);
        vs1 = v.findViewById(R.id.vs1);
        vs2 = v.findViewById(R.id.vs2);
        vs3 = v.findViewById(R.id.vs3);
        vs4 = v.findViewById(R.id.vs4);
        vs5 = v.findViewById(R.id.vs5);
        vs6 = v.findViewById(R.id.vs6);
        vs7 = v.findViewById(R.id.vs7);
        vs8 = v.findViewById(R.id.vs8);
        vs9 = v.findViewById(R.id.vs9);
        vs10 = v.findViewById(R.id.vs10);
        vs11 = v.findViewById(R.id.vs11);
        vs12 = v.findViewById(R.id.vs12);
        vs13 = v.findViewById(R.id.vs13);
        vs14 = v.findViewById(R.id.vs14);
        vs15 = v.findViewById(R.id.vs15);
        vs16 = v.findViewById(R.id.vs16);
        vs17 = v.findViewById(R.id.vs17);
        day1y = v.findViewById(R.id.d1);
        day2y = v.findViewById(R.id.d2);
        day3y = v.findViewById(R.id.d3);



        day1y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),day1.class));
            }
        });
        day2y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Day2.class));
            }
        });
        day3y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),day3.class));
            }
        });


        le1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),e1.class));

            }
        });
        le2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),e2.class));

            }
        });
        le3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),e3.class));

            }
        });
        le4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),e4.class));

            }
        });
        le5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),e5.class));

            }
        });
        le6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),e6.class));

            }
        });
        le7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),e7.class));

            }
        });
        le8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),e8.class));

            }
        });
        le9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),e9.class));

            }
        });

        ge1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),g1.class));

            }
        });
        ge2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),g2.class));

            }
        });
        ge3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),g3.class));

            }
        });

        bs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),b1.class));
            }
        });
        bs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),b2.class));
            }
        });

        bs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),b3.class));
            }
        });

        bs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),b4.class));
            }
        });

        vs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),v1.class));

            }
        });
        vs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),v2.class));

            }
        });
        vs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),v3.class));

            }
        });
        vs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),v4.class));

            }
        });
        vs5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),v5.class));

            }
        });
        vs6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),v6.class));

            }
        });
        vs7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),v7.class));

            }
        });
        vs8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),v8.class));

            }
        });

        vs9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),v9.class));

            }
        });
        vs10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),v10.class));

            }
        });
        vs11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),v11.class));

            }
        });
        vs12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),v12.class));

            }
        });
        vs13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),v13.class));

            }
        });
        vs14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),v14.class));

            }
        });
        vs15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),v15.class));

            }
        });
        vs16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),v16.class));

            }
        });
        vs17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),v17.class));

            }
        });


        return v;
    }

    }
