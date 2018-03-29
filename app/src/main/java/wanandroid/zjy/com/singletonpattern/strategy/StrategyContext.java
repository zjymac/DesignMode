package wanandroid.zjy.com.singletonpattern.strategy;

/**
 * 描述：
 * 作者：zjy on 2018/3/27 15:42
 */

public class StrategyContext {
    private AbstractStrategy abstractStrategy;

    public void setAbstractStrategy(AbstractStrategy abstractStrategy) {
        this.abstractStrategy = abstractStrategy;
    }
    public int calclatePrice(int km){
        return abstractStrategy.calculatePrice(km);
    }
}
