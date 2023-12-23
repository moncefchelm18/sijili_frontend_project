package com.example.sijili.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sijili.R;
import com.example.sijili.requests.CommerceRequest;

import java.util.List;

public class CommerceRequestAdapter extends RecyclerView.Adapter<CommerceRequestAdapter.ViewHolder> {

    private List<CommerceRequest> commerceRequests;

    public CommerceRequestAdapter(List<CommerceRequest> commerceRequests) {
        this.commerceRequests = commerceRequests;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_commerce_request, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CommerceRequest request = commerceRequests.get(position);

        holder.nameTextView.setText("Name: " + request.getName());
        holder.activityTypeTextView.setText("Activity Type: " + request.getActivityType());
        holder.companyTextView.setText("Company: " + request.getCompanyName());

        holder.rqInfosLayout.setOnClickListener(v -> {
            // Handle refuse button click
            // You can perform the necessary action here
        });

        // Set click listeners for accept and refuse buttons
        holder.acceptButton.setOnClickListener(v -> {
            // Handle accept button click
            // You can perform the necessary action here
        });

        holder.refuseButton.setOnClickListener(v -> {
            // Handle refuse button click
            // You can perform the necessary action here
        });
        holder.rqInfosLayout.setOnClickListener(v -> {
            // Handle refuse button click
            // You can perform the necessary action here
        });
    }

    @Override
    public int getItemCount() {
        return commerceRequests.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView activityTypeTextView;
        TextView companyTextView;
        ImageButton acceptButton;
        ImageButton refuseButton;

        LinearLayout rqInfosLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.requestName);
            activityTypeTextView = itemView.findViewById(R.id.requestActivityType);
            companyTextView = itemView.findViewById(R.id.requestCompanyName);
            acceptButton = itemView.findViewById(R.id.acceptButton);
            refuseButton = itemView.findViewById(R.id.refuseButton);
            rqInfosLayout = itemView.findViewById(R.id.layout_infos_rq);
        }
    }
}