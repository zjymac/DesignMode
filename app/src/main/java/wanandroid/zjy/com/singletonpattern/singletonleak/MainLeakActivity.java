package wanandroid.zjy.com.singletonpattern.singletonleak;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import wanandroid.zjy.com.singletonpattern.R;

public class MainLeakActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_leak);
        Singletonleak.getInstance(this);
    }
}
