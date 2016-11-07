package com.example.server.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.R.id.message;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.server.myapplication.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, Main3Activity.class);
        intent.putExtra(EXTRA_MESSAGE, "message");
        startActivity(intent);
    }

}
