package com.example.mywardrobe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mywardrobe.models.Clothes;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<Clothes> userList;

    public UserAdapter(List<Clothes> userList) {
        this.userList = userList;
    }

    static class UserViewHolder extends RecyclerView.ViewHolder {
        ImageView closeImageIV;
        TextView nameTV;
        TextView describeTV;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            closeImageIV = itemView.findViewById(R.id.closeImageIV);
            nameTV = itemView.findViewById(R.id.nameTV);
            describeTV = itemView.findViewById(R.id.describeTV);
        }
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        Clothes clothes = userList.get(position);
        holder.closeImageIV.setImageResource(clothes.getPhoto());
        holder.nameTV.setText(clothes.getName());
        holder.describeTV.setText(clothes.getDescribe());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}
