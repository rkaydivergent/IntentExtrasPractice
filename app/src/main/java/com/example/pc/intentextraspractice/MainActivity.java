package com.example.pc.intentextraspractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public	static	final	String	EXTRA_MESSAGE	= "com.example.pc.intentextraspractice.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void news1Clicked(View view)
    {
        Intent intent	=	new	Intent(this, Main2Activity.class);
        intent.putExtra(EXTRA_MESSAGE,	"1");
        startActivity(intent);
    }
    public void news2Clicked(View view)
    {
        Intent intent	=	new	Intent(this, Main2Activity.class);
        intent.putExtra(EXTRA_MESSAGE,	"2");
        startActivity(intent);
    }
    public void news3Clicked(View view)
    {
        Intent intent	=	new	Intent(this, Main2Activity.class);
        intent.putExtra(EXTRA_MESSAGE,	"3");
        startActivity(intent);
    }
}
