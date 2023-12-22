package com.example.sijili.users.clientactivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.sijili.R;
import com.example.sijili.TermsAndConditionsActivity;

public class ClientHomeSubmitRequestActivity extends AppCompatActivity {

    Button buttonCT;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_home_submit_request);


        drawerLayout = findViewById(R.id.drawer_layout);

        // Find the toolbar and menu button
        ImageButton menuButton = findViewById(R.id.menu_btn);

        // Set OnClickListener for the menu button
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the navigation menu
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

    }

    public void handleCn(View view) {
        Intent intent = new Intent(ClientHomeSubmitRequestActivity.this, TermsAndConditionsActivity.class);
        startActivity(intent);
    }
}
