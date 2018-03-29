package wanandroid.zjy.com.singletonpattern.adapter;

import android.util.Log;

/**
 * 描述：
 * 作者：58 on 2018/3/27 11:05
 */

public class AdapterObject implements Target{
    private Adaptee adaptee;
    public AdapterObject(Adaptee adaptee){
        this.adaptee=adaptee;
    }
    @Override
    public void sampleOperation1() {
        adaptee.sampleOperation1();
    }

    @Override
    public void sampleOperation2() {
        Log.e("zjy","sampleOperation2()");
    }
}
