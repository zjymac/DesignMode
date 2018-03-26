package wanandroid.zjy.com.singletonpattern.singleton;

/**
 * 描述：静态内部类单例
 * 作者：zjy on 2018/3/26 16:47
 */

public class StaticInneClassesSingleton {
    private StaticInneClassesSingleton() {
    }

    public static StaticInneClassesSingleton getInstance() {
        return StaticInneClassesSingletonHolder.staticInneClassesSingleton;
    }

    private static class StaticInneClassesSingletonHolder {
        private final static StaticInneClassesSingleton staticInneClassesSingleton = new StaticInneClassesSingleton();
    }
}
