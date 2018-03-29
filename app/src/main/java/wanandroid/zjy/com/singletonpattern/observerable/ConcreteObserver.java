package wanandroid.zjy.com.singletonpattern.observerable;

/**
 * 描述：
 * 作者：58 on 2018/3/27 17:10
 */

public class ConcreteObserver implements Oberver {
    private String observerState;
    @Override
    public void update(String newState) {
        observerState=newState;
    }
}
