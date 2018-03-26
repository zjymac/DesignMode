package wanandroid.zjy.com.singletonpattern.singleton;

/**
 * 描述：
 * 作者：zjy on 2018/3/26 16:39
 */

public class DCLSingleton {
    private static volatile DCLSingleton dclSingleton;//禁止指令jvm重排序

    private DCLSingleton() {

    }

    private DCLSingleton getInstance() {
        if (dclSingleton == null) {
            synchronized (DCLSingleton.class) {
                if (dclSingleton == null) {
                    //JVM的及时编译器中存在指令重排序优化会导致线程不安全，解决办法 关键字valatile
                    dclSingleton = new DCLSingleton();}
            }
        }
        return dclSingleton;
    }
}
