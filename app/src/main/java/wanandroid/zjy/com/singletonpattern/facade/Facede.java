package wanandroid.zjy.com.singletonpattern.facade;

/**
 * 描述：
 * 作者：zjy on 2018/3/27 14:28
 */

public class Facede {
    private ModuleA moduleA;
    private ModuleB moduleB;
    private ModuleC moduleC;

    private Facede() {
        moduleA = new ModuleA();
        moduleB = new ModuleB();
        moduleC = new ModuleC();
    }

    public static Facede getInstance() {
        return FacedeHolder.facede;
    }

    private static class FacedeHolder {
        private static final Facede facede = new Facede();
    }

    public void testOperation() {
        moduleA.testA();
        moduleB.testB();
        moduleC.testC();
    }
}
