package wanandroid.zjy.com.singletonpattern.singleton;

/**
 * 描述：饿汉模式
 * 优点：实现简单，由于在类装载的时候就实例化了，所以不存在线程同步问题
 * 缺点：由于不具有懒加载功能，所以如果该实例一直未使用会造成系统内存的浪费
 * 作者：zjy on 2018/3/26 16:17
 */

public class EagerSingleton {


    private static EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getEagerSingleton() {
        return eagerSingleton;
    }
}
