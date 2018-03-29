package wanandroid.zjy.com.singletonpattern.chain;

import android.util.Log;

/**
 * 描述：
 * 作者：58 on 2018/3/27 18:11
 */

public class ProjectManager extends ChainHandler {
    public ProjectManager(int maxDay) {
        super(maxDay);
    }

    @Override
    protected void reply(int day) {
        Log.e("zjy", "审批了");
    }
}
