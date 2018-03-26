
package wanandroid.zjy.com.singletonpattern.singletonleak;

import android.content.Context;
import android.widget.Toast;

/**
 * 描述：
 * 作者：zjy on 2018/3/26 17:13
 */

public class Singletonleak {
    private static Context mContext;

    public static Singletonleak getInstance(Context context) {
//        mContext=context;//错误写法
        mContext = context.getApplicationContext();//正确写法
        return SingletonLeakHolder.singletonleak;
    }

    private static class SingletonLeakHolder {
        private static final Singletonleak singletonleak = new Singletonleak();
    }

    public void show() {
        Toast.makeText(mContext, "zjy", Toast.LENGTH_SHORT).show();
    }
}
