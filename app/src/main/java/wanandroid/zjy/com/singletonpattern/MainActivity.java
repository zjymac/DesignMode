package wanandroid.zjy.com.singletonpattern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import wanandroid.zjy.com.singletonpattern.singletonleak.MainLeakActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=new Intent(this,MainLeakActivity.class);
        startActivity(intent);
    }
}
