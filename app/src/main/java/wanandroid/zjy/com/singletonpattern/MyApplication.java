package wanandroid.zjy.com.singletonpattern;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * 描述：
 * 作者：zjy on 2018/3/26 17:03
 */

public class MyApplication extends Application {
    private static MyApplication myApplication;
    private RefWatcher refWatcher;
    public static MyApplication getIntstance() {
        return myApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;

        refWatcher=setUpLeakCanary();
    }

    private RefWatcher setUpLeakCanary() {
        if(LeakCanary.isInAnalyzerProcess(this)){
            return RefWatcher.DISABLED;
        }
        return   LeakCanary.install(this);
    }
    public static RefWatcher getRefWatcher(Context context) {
        MyApplication leakApplication = (MyApplication) context.getApplicationContext();
        return leakApplication.refWatcher;
    }
}
