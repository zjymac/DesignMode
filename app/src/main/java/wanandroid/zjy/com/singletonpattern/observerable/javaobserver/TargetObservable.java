package wanandroid.zjy.com.singletonpattern.observerable.javaobserver;

import java.util.Observable;

/**
 * 描述：
 * 作者：zjy on 2018/3/27 17:22
 */

public class TargetObservable extends Observable {
    private String newState;

    public String getNewState() {
        return newState;
    }

    public void setNewState(String newState) {
        this.newState = newState;
        this.setChanged();
        this.notifyObservers(newState);
    }
}
