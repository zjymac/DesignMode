package wanandroid.zjy.com.singletonpattern.observerable;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 * 作者：58 on 2018/3/27 17:06
 */

public abstract class Subject {
    //保存观察者对象
    private List<Oberver> obervers = new ArrayList<>();

    public void attach(Oberver oberver) {
        obervers.add(oberver);

    }

    public void detach(Oberver oberver) {
        obervers.remove(oberver);
    }
    //通知所有注册观察者对象
    public void notifyObservers(String newState){
        for (Oberver observer:obervers){
            observer.update(newState);
        }

    }
}
