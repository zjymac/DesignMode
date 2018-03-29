package wanandroid.zjy.com.singletonpattern.template;

import android.util.Log;

/**
 * 描述：
 * 作者：zjy on 2018/3/27 16:35
 */

public class BossWork extends AbstractWork{
    @Override
    protected void goToWork() {
        Log.e("zjy", "开车上班");
    }

    @Override
    protected void work() {
        Log.e("zjy", "分配员工");
    }

    @Override
    protected void getOffWork() {
        Log.e("zjy", "开车下班");
    }
}
