package wanandroid.zjy.com.singletonpattern.template;

import android.util.Log;

/**
 * 描述：
 * 作者：zjy on 2018/3/27 16:35
 */

public class StaffWork extends AbstractWork{
    @Override
    protected void goToWork() {
        Log.e("zjy", "公交上班");
    }

    @Override
    protected void work() {
        Log.e("zjy", "处理工作");
    }

    @Override
    protected void getOffWork() {
        Log.e("zjy", "公交下班");
    }
}
