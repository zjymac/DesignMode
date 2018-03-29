package wanandroid.zjy.com.singletonpattern.factory;

import android.util.Log;

/**
 * 描述：
 * 作者：zjy on 2018/3/28 11:20
 */

public class AndroidPhone extends AbstractProduct {
    @Override
    public void usePhone() {
        Log.e("zjy", "android手机");
    }
}
