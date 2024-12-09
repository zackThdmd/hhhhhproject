package com.example.menu_project;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.standard:
                Toast.makeText(this, "you have clicked on Standard", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.scientific:
                Toast.makeText(this, "you have clicked on Scientific", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.graphing:
                Toast.makeText(this, "you have clicked on Graphing", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.programmer:
                Toast.makeText(this, "you have clicked on Programmer", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}