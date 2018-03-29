package wanandroid.zjy.com.singletonpattern.callback;

/**
 * 描述：
 * 作者：58 on 2018/3/27 17:45
 */

public class Employee {
    private CallBack callBack;

    public void setCallBack(CallBack callBack) {
        this.callBack = callBack;
    }

    public void doWork() {
        callBack.work();
    }
}
