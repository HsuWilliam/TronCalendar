package com.example.user.troncalendar;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public class ViewFragment1 extends Fragment {
    private RecyclerView mActivity1;
    private DatabaseReference mDatabase;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        mDatabase = FirebaseDatabase.getInstance().getReference("公告");
        mDatabase.keepSynced(true);
        mActivity1 = (RecyclerView) rootView.findViewById(R.id.recyclerview3);
        mActivity1.setLayoutManager(new LinearLayoutManager(getContext()));
        mActivity1.setHasFixedSize(true);
        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<activity1list,activityViewHolder>firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<activity1list, activityViewHolder>
                (activity1list.class,R.layout.activity1_row,activityViewHolder.class,mDatabase) {
            @Override
            protected void populateViewHolder(activityViewHolder viewHolder, activity1list model, int position) {
                viewHolder.setName(model.getName());
                viewHolder.setOrganization(model.getOrganization());
                viewHolder.setType(model.getType());
            }
        };
        mActivity1.setAdapter(firebaseRecyclerAdapter);
    }

    public static class activityViewHolder extends RecyclerView.ViewHolder{
        View mView;
        public activityViewHolder(View itemView){
            super(itemView);
            mView= itemView;
        }
        public void setName(String name){
            TextView post_activity = (TextView)mView.findViewById(R.id.post_activity);
            post_activity.setText(name);
        }

        public void setOrganization(String organization){
            TextView post_activityorg = (TextView)mView.findViewById(R.id.post_activityorg);
            post_activityorg.setText(organization);
        }
        public void setType(String type){
            TextView post_activitytype = (TextView)mView.findViewById(R.id.post_activitytype);
            post_activitytype.setText(type);
        }
    }
}