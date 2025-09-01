package com.project.namdharifoods;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    CardView starterscard;
    CardView mainscard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this); // Enables edge-to-edge layout for modern UI
        setContentView(R.layout.activity_main);

        // Adjusts padding so content doesn’t overlap system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        starterscard=findViewById(R.id.card_view_starters);
        mainscard=findViewById(R.id.card_view_main);

        // Opens StartersActivity when starters card is clicked
        starterscard.setOnClickListener(v -> {
            Intent startersActivityIntent=new Intent(MainActivity.this,StartersActivity.class);
            startActivity(startersActivityIntent);
        });

        // Opens MainCoursesActivity when mains card is clicked
        mainscard.setOnClickListener(v -> {
            Intent mainCoursesActivityIntent=new Intent(MainActivity.this,MainCoursesActivity.class);
            startActivity(mainCoursesActivityIntent);
        });

        TextView emailTextView = findViewById(R.id.text_view_email_adresss);

        // Launches email client with predefined email address when clicked
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailAppIntent.setData(Uri.parse("mailto:Namdaddy@gmail.com"));
                startActivity(launchEmailAppIntent);
            }
        });
    }
}
