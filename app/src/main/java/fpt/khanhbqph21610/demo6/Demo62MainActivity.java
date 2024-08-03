package fpt.khanhbqph21610.demo6;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Demo62MainActivity extends AppCompatActivity {
    Button btnStart, btnStop, btnBackgroundService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_demo62_main);
        btnStart = findViewById(R.id.demo62BtnStart);
        btnStop = findViewById(R.id.demo62BtnStop);
        btnStart.setOnClickListener(view -> {
            startService(new Intent(Demo62MainActivity.this, ForcegroundService.class));
        });
        btnStop.setOnClickListener(view -> {
            startService(new Intent(Demo62MainActivity.this, ForcegroundService.class));
        });
        btnBackgroundService = findViewById(R.id.demo62BtnBackgroundService);
        btnBackgroundService.setOnClickListener(view -> {
            startService(new Intent(Demo62MainActivity.this,BackgroundService.class));
        });
    }
}