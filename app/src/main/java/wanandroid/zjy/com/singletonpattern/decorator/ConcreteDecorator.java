package wanandroid.zjy.com.singletonpattern.decorator;


/**
 * 描述：
 * 作者：zjy on 2018/3/27 11:29
 */

public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        adddedBehavior();
    }

    private void adddedBehavior() {
        //TODO  新的业务逻辑
    }
}
