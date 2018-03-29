package wanandroid.zjy.com.singletonpattern.composite;

/**
 * 描述：
 * 作者：58 on 2018/3/27 14:57
 */

public abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void doSomeThing();

    public abstract void addChild(Component component);

    public abstract void removeChild(Component component);

    public abstract Component getChild(int position);
}
