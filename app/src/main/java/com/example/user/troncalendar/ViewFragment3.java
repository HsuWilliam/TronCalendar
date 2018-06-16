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

public class ViewFragment3 extends Fragment {
    private RecyclerView mActivity3;
    private DatabaseReference mDatabase;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        mDatabase = FirebaseDatabase.getInstance().getReference("社團");
        mDatabase.keepSynced(true);
        mActivity3 = (RecyclerView) rootView.findViewById(R.id.recyclerview3);
        mActivity3.setLayoutManager(new LinearLayoutManager(getContext()));
        mActivity3.setHasFixedSize(true);
        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<activitylist3, activityViewHolder3> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<activitylist3, activityViewHolder3>
                (activitylist3.class,R.layout.activity3_row,activityViewHolder3.class,mDatabase) {
            @Override
            protected void populateViewHolder(activityViewHolder3 viewHolder, activitylist3 model, int position) {
                viewHolder.setTitle(model.getTitle());
                viewHolder.setClub(model.getClub());
                viewHolder.setTime(model.getTime());
                viewHolder.setImage(getContext().getApplicationContext(),model.getImage());
            }
        };
        mActivity3.setAdapter(firebaseRecyclerAdapter);
    }
    public static class activityViewHolder3 extends RecyclerView.ViewHolder{
        View mView;
        public activityViewHolder3(View itemView){
            super(itemView);
            mView= itemView;
        }

        public void setTitle(String title){
            TextView post_activity3 = (TextView)mView.findViewById(R.id.post_activity3);
            post_activity3.setText(title);
        }

        public void setClub(String club){
            TextView post_activityclub = (TextView)mView.findViewById(R.id.post_activityclub);
            post_activityclub.setText(club);
        }
        public void setTime(String time){
            TextView post_activitytime = (TextView)mView.findViewById(R.id.post_activitytime);
            post_activitytime.setText(time);
        }
        public void setImage(Context ctx, String image){
            ImageView post_image3 = (ImageView)mView.findViewById(R.id.post_image3);
            Picasso.with(ctx).load(image).into(post_image3);
        }
    }
}