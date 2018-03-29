package wanandroid.zjy.com.singletonpattern.composite;

/**
 * 描述：
 * 作者：58 on 2018/3/27 14:58
 */

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void doSomeThing() {

    }

    @Override
    public void addChild(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeChild(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Component getChild(int position) {
        throw new UnsupportedOperationException();
    }

}
