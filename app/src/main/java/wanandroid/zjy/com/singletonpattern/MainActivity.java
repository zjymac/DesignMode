package wanandroid.zjy.com.singletonpattern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import wanandroid.zjy.com.singletonpattern.builder.androidbuilder.AndroidProduct;
import wanandroid.zjy.com.singletonpattern.builder.javabuilder.Builder;
import wanandroid.zjy.com.singletonpattern.builder.javabuilder.ConcreateBuilder;
import wanandroid.zjy.com.singletonpattern.builder.javabuilder.Director;
import wanandroid.zjy.com.singletonpattern.builder.javabuilder.Product;
import wanandroid.zjy.com.singletonpattern.singletonleak.MainLeakActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, MainLeakActivity.class);
        startActivity(intent);
        //构建者模式
        Builder builder = new ConcreateBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        AndroidProduct androidProduct = new AndroidProduct.Builder().setPartA("a").setPartB("b").setPartC("c").build();
    }
}
