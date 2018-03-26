package wanandroid.zjy.com.singletonpattern.singleton;

/**
 * 描述：懒汉模式(线程安全)
 * 优点：线程安全
 * 缺点：性能不高
 * 作者：zjy on 2018/3/26 16:25
 */

public class LazyModeSingletonSafe {
    private static LazyModeSingletonSafe lazyModeSingletonSafe;

    private LazyModeSingletonSafe() {
    }

    public static synchronized LazyModeSingletonSafe getInstance() {
        if (lazyModeSingletonSafe == null) {
            lazyModeSingletonSafe = new LazyModeSingletonSafe();
        }
        return lazyModeSingletonSafe;
    }

//    public static LazyModeSingletonSafe getInstance() {
//        synchronized (LazyModeSingleton.class) {
//            if (lazyModeSingletonSafe == null) {
//                lazyModeSingletonSafe = new LazyModeSingletonSafe();
//            }
//        }
//        return lazyModeSingletonSafe;
//    }
}
