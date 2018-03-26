package wanandroid.zjy.com.singletonpattern.builder.javabuilder;

/**
 * 描述：
 * 作者：58 on 2018/3/26 18:16
 */

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
