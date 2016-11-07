package com.example.server.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.server.myapplication.MainActivity.EXTRA_MESSAGE;


public class Main2Activity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.server.myapplication.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String message = intent.getStringExtra(EXTRA_MESSAGE);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setTextSize(40);
        textView.setText(message);
    }
public void sendMessage(View view){
    Intent intent = new Intent(this, Main3Activity.class);
    TextView textView = (TextView) findViewById(R.id.textView);
    String message = textView.getText().toString();
    intent.putExtra(EXTRA_MESSAGE,message);
    startActivity(intent);
}
}

