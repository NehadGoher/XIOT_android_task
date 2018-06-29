package com.example.nehad.xiot_task;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BounsActivity extends AppCompatActivity {

    private Button press;
    private TextView textView;
    private EditText editText;
    private String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bouns);
        press = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);

    }

    public void onPress(View view){

        text = editText.getText().toString();
        textView.setText(text);
    }
}
