package wanandroid.zjy.com.singletonpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 * 作者：zjy on 2018/3/27 14:57
 */

public class Composite extends Component {
    private List<Component> mFileList;

    public Composite(String name) {
        super(name);
        mFileList = new ArrayList<>();
    }

    @Override
    public void doSomeThing() {
        if (null != mFileList) {
            for (Component c : mFileList) {
                c.doSomeThing();
            }
        }
    }

    @Override
    public void addChild(Component component) {
        mFileList.add(component);
    }

    @Override
    public void removeChild(Component component) {
        mFileList.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return mFileList.get(index);
    }
}
