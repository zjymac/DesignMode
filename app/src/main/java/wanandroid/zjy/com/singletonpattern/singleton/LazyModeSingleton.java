package wanandroid.zjy.com.singletonpattern.singleton;

/**
 * 描述：懒汉模式(饿汉模式基础上的一种优化加入了懒加载机制)
 * 缺点：线程不安全，不可用
 * 作者：zjy on 2018/3/26 16:25
 */

public class LazyModeSingleton {
    private static LazyModeSingleton lazyModeSingleton;

    private LazyModeSingleton() {
    }

    public static LazyModeSingleton getInstance() {
        if (lazyModeSingleton == null) {
            lazyModeSingleton = new LazyModeSingleton();
        }
        return lazyModeSingleton;
    }
}
