package com.example.user.troncalendar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ViewFragment2 extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        TextView textView2 = (TextView) rootView.findViewById(R.id.txt_label2);
        TextView textView3 = (TextView) rootView.findViewById(R.id.txt_label3);
        TextView textView5 = (TextView) rootView.findViewById(R.id.txt_label5);

        textView2.setText("名稱：宿營工人");
        textView3.setText("人數：500");
        textView5.setText("時間：");

        TextView textView6 = (TextView) rootView.findViewById(R.id.txt_label6);
        TextView textView7 = (TextView) rootView.findViewById(R.id.txt_label7);
        TextView textView9 = (TextView) rootView.findViewById(R.id.txt_label9);

        textView6.setText("名稱：宿營工人");
        textView7.setText("人數：500");
        textView9.setText("時間：");

        TextView textView10 = (TextView) rootView.findViewById(R.id.txt_label10);
        TextView textView11 = (TextView) rootView.findViewById(R.id.txt_label11);
        TextView textView12 = (TextView) rootView.findViewById(R.id.txt_label12);

        textView10.setText("名稱：宿營工人");
        textView11.setText("人數：500");
        textView12.setText("時間：");

        TextView textView13 = (TextView) rootView.findViewById(R.id.txt_label13);
        TextView textView14 = (TextView) rootView.findViewById(R.id.txt_label14);
        TextView textView15 = (TextView) rootView.findViewById(R.id.txt_label15);

        textView13.setText("名稱：宿營工人");
        textView14.setText("人數：500");
        textView15.setText("時間：");
        return rootView;
    }
}
