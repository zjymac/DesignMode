package wanandroid.zjy.com.singletonpattern.observerable;

/**
 * 描述：
 * 作者：58 on 2018/3/27 17:10
 */

public class ConcreteSubject extends Subject{
    private String state;
    public String getState(){
        return state;
    }
    public void change(String newState){
        state=newState;
        notifyObservers(state);
    }

}
