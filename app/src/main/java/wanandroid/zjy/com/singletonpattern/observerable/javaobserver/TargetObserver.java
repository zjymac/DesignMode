package wanandroid.zjy.com.singletonpattern.observerable.javaobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * 描述：
 * 作者：58 on 2018/3/27 17:22
 */

public class TargetObserver implements Observer {
    private String name;//观察者名称

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        ((TargetObservable) o).getNewState();
    }
}
