package wanandroid.zjy.com.singletonpattern.decorator;

/**
 * 描述：
 * 作者：zjy on 2018/3/27 11:27
 */

public class Decorator implements Component{
    private Component component;
    public Decorator(Component component){
        this.component=component;
    }
    @Override
    public void operation() {
        component.operation();
    }
}
