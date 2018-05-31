package com.example.user.troncalendar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ViewFragment1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        TextView textView2 = (TextView) rootView.findViewById(R.id.txt_label2);
        TextView textView3 = (TextView) rootView.findViewById(R.id.txt_label3);
        TextView textView5 = (TextView) rootView.findViewById(R.id.txt_label5);

        textView2.setText("名稱：106學年度第2學期珍愛生命守門人培課課程");
        textView3.setText("類型：健康促進");
        textView5.setText("主辦單位：學生輔導中心");

        TextView textView6 = (TextView) rootView.findViewById(R.id.txt_label6);
        TextView textView7 = (TextView) rootView.findViewById(R.id.txt_label7);
        TextView textView9 = (TextView) rootView.findViewById(R.id.txt_label9);

        textView6.setText("名稱：像青鳥一樣──走出屬於自己的路");
        textView7.setText("類型：職涯發展");
        textView9.setText("主辦單位：(日) 應用中文學分學程");

        TextView textView10 = (TextView) rootView.findViewById(R.id.txt_label10);
        TextView textView11 = (TextView) rootView.findViewById(R.id.txt_label11);
        TextView textView12 = (TextView) rootView.findViewById(R.id.txt_label12);

        textView10.setText("名稱：1062學年度資管系期末程式語言機測");
        textView11.setText("類型：自我成長");
        textView12.setText("主辦單位：(日) 資訊管理學系");

        TextView textView13 = (TextView) rootView.findViewById(R.id.txt_label13);
        TextView textView14 = (TextView) rootView.findViewById(R.id.txt_label14);
        TextView textView15 = (TextView) rootView.findViewById(R.id.txt_label15);

        textView13.setText("名稱：管理學院企業參訪");
        textView14.setText("類型：職涯發展");
        textView15.setText("主辦單位：管理學院");

        return rootView;
    }
}