package wanandroid.zjy.com.singletonpattern.builder.javabuilder;

/**
 * 描述：
 * 作者：zjy on 2018/3/26 18:09
 */

public abstract class Builder {
    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public Product getResult() {
        return product;
    }
}
