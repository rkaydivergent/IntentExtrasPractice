package com.example.pc.intentextraspractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView article = (TextView) findViewById(R.id.article);


        Intent intent	=	getIntent();
        String	option	= intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        switch (option) {
            case "1":
                article.setText(R.string.article1);
                break;
            case "2":
                article.setText(R.string.article2);
                break;
            case "3":
                article.setText(R.string.article3);
                break;
        }
    }


}
