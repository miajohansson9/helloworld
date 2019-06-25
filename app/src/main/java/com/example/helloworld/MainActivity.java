package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView3)).setTextColor(getResources().getColor(R.color.colorPrimary));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((View) findViewById(R.id.rootView)).setBackgroundColor(getResources().getColor(R.color.lightSalmon));
                ((EditText) findViewById(R.id.editText)).setBackgroundColor(getResources().getColor(R.color.lightSalmon));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();
                if (TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView3)).setText("Hi from Mia!");
                } else {
                    ((TextView) findViewById(R.id.textView3)).setText(newText);
                }
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((View) findViewById(R.id.rootView)).setBackgroundColor(getResources().getColor(R.color.colorAccent));
                ((TextView) findViewById(R.id.textView3)).setText("Hi from Mia!");
                ((TextView) findViewById(R.id.textView3)).setTextColor(getResources().getColor(R.color.black));
                ((EditText) findViewById(R.id.editText)).setBackgroundColor(getResources().getColor(R.color.colorAccent));
            }
        });
    }
}
