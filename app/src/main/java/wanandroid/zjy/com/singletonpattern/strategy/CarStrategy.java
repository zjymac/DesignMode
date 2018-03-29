package wanandroid.zjy.com.singletonpattern.strategy;

/**
 * 描述：
 * 作者：zjy on 2018/3/27 15:44
 */

public class CarStrategy implements AbstractStrategy{
    @Override
    public int calculatePrice(int km) {
        return 600;
    }
}
