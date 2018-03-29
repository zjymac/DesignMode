package wanandroid.zjy.com.singletonpattern.adapter;

import android.util.Log;

/**
 * 描述：
 * 作者：58 on 2018/3/27 11:03
 */

public class Adapter extends Adaptee implements Target {
    @Override
    public void sampleOperation2() {
        Log.e("zjy", "sampleOperation2");
    }
}
