package com.example.user.troncalendar;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

public class ViewFragment2 extends Fragment
{
    private RecyclerView mActivity2;
    private DatabaseReference mDatabase;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        mDatabase = FirebaseDatabase.getInstance().getReference("系學會");
        mDatabase.keepSynced(true);
        mActivity2 = (RecyclerView) rootView.findViewById(R.id.recyclerview3);
        mActivity2.setLayoutManager(new LinearLayoutManager(getContext()));
        mActivity2.setHasFixedSize(true);
        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<activitylist2,activityViewHolder2>firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<activitylist2, activityViewHolder2>
                (activitylist2.class,R.layout.activity2_row,activityViewHolder2.class,mDatabase) {
            @Override
            protected void populateViewHolder(activityViewHolder2 viewHolder, activitylist2 model, int position) {
                viewHolder.setTitle(model.getTitle());
                viewHolder.setTime(model.getTime());
                viewHolder.setContent(model.getContent());

            }
        };
        mActivity2.setAdapter(firebaseRecyclerAdapter);
    }

    public static class activityViewHolder2 extends RecyclerView.ViewHolder{
        View mView;
        public activityViewHolder2(View itemView){
            super(itemView);
            mView= itemView;
        }
        public void setTitle(String title){
            TextView post_activity = (TextView)mView.findViewById(R.id.post_activity2);
            post_activity.setText(title);
        }

        public void setTime(String time){
            TextView post_activityorg = (TextView)mView.findViewById(R.id.post_activitytime);
            post_activityorg.setText(time);
        }
        public void setContent(String content){
            TextView post_content = (TextView)mView.findViewById(R.id.post_content);
            post_content.setText(content);
        }

    }
}
