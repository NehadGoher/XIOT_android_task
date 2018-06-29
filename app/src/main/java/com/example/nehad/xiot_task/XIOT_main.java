package com.example.nehad.xiot_task;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class XIOT_main extends AppCompatActivity {

    private Button hello;
    private Button bye;
    private TextView label;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiot_main);

        hello = (Button) findViewById(R.id.hello_button);
        bye = (Button) findViewById(R.id.bye_button);
        label = (TextView) findViewById(R.id.label);

    }

    public void onHello(View view){

        label.setText("Hello");
    }

    public void onBye(View view){

        label.setText("Bye");
    }
    public void onBouns(View view){

        Intent intent = new Intent(this,BounsActivity.class);
        startActivity(intent);
    }

}
