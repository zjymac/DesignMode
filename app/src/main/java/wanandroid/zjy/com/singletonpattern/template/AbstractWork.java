package wanandroid.zjy.com.singletonpattern.template;

import android.util.Log;

/**
 * 描述：
 * 作者：zjy on 2018/3/27 16:32
 */

public abstract class AbstractWork {
    protected void getUp() {
        Log.e("zjy", "起床");
    }

    protected abstract void goToWork();

    protected abstract void work();

    protected abstract void getOffWork();

    public final void newDay() {
        getUp();
        goToWork();
        work();
        getOffWork();
    }

}
