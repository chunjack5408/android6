package com.example.hw6;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedIntanceState);
        setContentView(R.layout.main);
    }
    @Override
    protected void onStart() {
        super.onStart();
        // The activity is about to become visible.
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        // The activity is between stopped and started.
    }


    public void tiaowan(View view){
        Uri uri = Uri.parse("http://www.baidu.com");//要跳轉的網址
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}