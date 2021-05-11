package com.example.customtoastalertapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button defaultToast = findViewById(R.id.defaultToast);
        Button customToast = findViewById(R.id.customToast);

        defaultToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This is DEFAULT Toast Alert", Toast.LENGTH_SHORT).show();
            }
        });

        customToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.custom_layout_toast, (ViewGroup) findViewById(R.id.root_view));

                // create a new Toast using context
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_LONG); // set the duration for the Toast
                toast.setView(layout); // set the inflated layout
                toast.show(); // display the custom Toast
            }
        });
    }
}