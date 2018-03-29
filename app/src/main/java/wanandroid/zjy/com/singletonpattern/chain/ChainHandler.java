package wanandroid.zjy.com.singletonpattern.chain;

import android.util.Log;

/**
 * 描述：
 * 作者：zjy on 2018/3/27 18:06
 */

public abstract class ChainHandler {
    protected ChainHandler nextHandler;
    public int maxDay;
    protected ChainHandler(int maxDay){
        this.maxDay=maxDay;
    }

    public void setNextHandler(ChainHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public void handlerRequest(int day){
        if(day<=maxDay){
            reply(day);
        }else {
            if(nextHandler!=null){
                nextHandler.handlerRequest(day);
            }{
                Log.e("zjy","没有可以审批的人了");
            }
        }
    }
    protected abstract void reply(int day);
}
