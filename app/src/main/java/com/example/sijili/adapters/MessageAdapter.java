package com.example.sijili.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sijili.R;  // Change this to your actual package name
import com.example.sijili.RetrofitInterface;
import com.example.sijili.requests.CommerceRequest;
import com.example.sijili.requests.MessageRequest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {

    private List<MessageRequest> messageRequests;
    private RetrofitInterface retrofitInterface;

    public MessageAdapter(List<MessageRequest> messageRequests) {
        this.messageRequests = messageRequests;
    }

    public MessageAdapter(List<MessageRequest> messageRequests, RetrofitInterface retrofitInterface) {
        this.messageRequests = messageRequests;
        this.retrofitInterface = retrofitInterface;
    }
    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_message, parent, false);
        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        MessageRequest message = messageRequests.get(position);

        // Bind your data to the views
        holder.textViewUserName.setText(message.getLast_name());
        holder.textViewUserEmail.setText(message.getEmail());
        holder.textViewMessage.setText(message.getMessage());
        holder.textViewTimestamp.setText(message.getTimestamp());
        holder.constraintLayoutConversation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //######################
                //here impliment opening conversation
                //######################
            }
        });


        // You may need to load an image into the ImageView (imageView2) based on the user's data
        // For example, you can use a library like Picasso or Glide for image loading
        // Picasso.get().load(message.getUserImageUrl()).into(holder.imageView2);
    }

    @Override
    public int getItemCount() {
        return messageRequests.size();
    }

    public static class MessageViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView2;
        TextView textViewUserName;
        TextView textViewUserEmail;
        TextView textViewMessage;
        TextView textViewTimestamp;
        ConstraintLayout constraintLayoutConversation;


        public MessageViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView2 = itemView.findViewById(R.id.imageView2);
            textViewUserName = itemView.findViewById(R.id.textViewUserName);
            textViewUserEmail = itemView.findViewById(R.id.textViewUserEmail);
            textViewMessage = itemView.findViewById(R.id.textViewMessage);
            textViewTimestamp = itemView.findViewById(R.id.textViewTimestamp);
            constraintLayoutConversation = itemView.findViewById(R.id.message_conversation);
        }
    }
}
