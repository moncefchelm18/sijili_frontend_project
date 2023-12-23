package com.example.sijili.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sijili.R;
import com.example.sijili.users.serveractivities.ServerManageRequestsActivity;

public class ServerHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_home);
    }

    public void goToManageRequest(View view) {
        Intent intent = new Intent(ServerHomeActivity.this, ServerManageRequestsActivity.class);
        startActivity(intent);
    }
}