package cn.studyjams.s1.sj35.timmy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onNext(View v){
        Intent intent = new Intent(this,NextActivity.class);
        startActivity(intent);
    }
}
