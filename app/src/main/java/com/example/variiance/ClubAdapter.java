package com.example.variiance;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ClubAdapter extends RecyclerView.Adapter<ClubAdapter.ViewHolder> {
    private MyListData[] listData;
    public ClubAdapter(MyListData[] listData){
        this.listData = listData;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ivClub;
        TextView tvClub;
        LinearLayout linearLayoutClubs;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.ivClub = (ImageView) itemView.findViewById(R.id.ivClubs);
            this.tvClub = (TextView) itemView.findViewById(R.id.tvClubs);
            linearLayoutClubs = (LinearLayout) itemView.findViewById(R.id.linearLayoutClubs);

        }
    }


    @NonNull
    @Override
    public ClubAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.clubs_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ClubAdapter.ViewHolder holder, int position) {
        final MyListData myListData = listData[position];
        holder.tvClub.setText(listData[position].getClubName()); // get text
        holder.ivClub.setImageResource(listData[position].getClubImage()); //get image
        holder.linearLayoutClubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "you clicked on"+myListData.getClubName(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return listData.length;
    }
}
