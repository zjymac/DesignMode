package wanandroid.zjy.com.singletonpattern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import wanandroid.zjy.com.singletonpattern.adapter.Adaptee;
import wanandroid.zjy.com.singletonpattern.adapter.Adapter;
import wanandroid.zjy.com.singletonpattern.adapter.AdapterObject;
import wanandroid.zjy.com.singletonpattern.builder.androidbuilder.AndroidProduct;
import wanandroid.zjy.com.singletonpattern.builder.javabuilder.Builder;
import wanandroid.zjy.com.singletonpattern.builder.javabuilder.ConcreateBuilder;
import wanandroid.zjy.com.singletonpattern.builder.javabuilder.Director;
import wanandroid.zjy.com.singletonpattern.builder.javabuilder.Product;
import wanandroid.zjy.com.singletonpattern.callback.CallBack;
import wanandroid.zjy.com.singletonpattern.callback.Employee;
import wanandroid.zjy.com.singletonpattern.chain.ProjectCEO;
import wanandroid.zjy.com.singletonpattern.chain.ProjectManager;
import wanandroid.zjy.com.singletonpattern.composite.Composite;
import wanandroid.zjy.com.singletonpattern.composite.Leaf;
import wanandroid.zjy.com.singletonpattern.decorator.Component;
import wanandroid.zjy.com.singletonpattern.decorator.ConcreteComponent;
import wanandroid.zjy.com.singletonpattern.decorator.ConcreteDecorator;
import wanandroid.zjy.com.singletonpattern.facade.Facede;
import wanandroid.zjy.com.singletonpattern.factory.AbstractProduct;
import wanandroid.zjy.com.singletonpattern.factory.AndroidPhone;
import wanandroid.zjy.com.singletonpattern.factory.PhoneFactory;
import wanandroid.zjy.com.singletonpattern.observerable.ConcreteObserver;
import wanandroid.zjy.com.singletonpattern.observerable.ConcreteSubject;
import wanandroid.zjy.com.singletonpattern.observerable.Oberver;
import wanandroid.zjy.com.singletonpattern.observerable.javaobserver.TargetObservable;
import wanandroid.zjy.com.singletonpattern.observerable.javaobserver.TargetObserver;
import wanandroid.zjy.com.singletonpattern.singletonleak.MainLeakActivity;
import wanandroid.zjy.com.singletonpattern.strategy.BusStrategy;
import wanandroid.zjy.com.singletonpattern.strategy.StrategyContext;
import wanandroid.zjy.com.singletonpattern.template.BossWork;
import wanandroid.zjy.com.singletonpattern.template.StaffWork;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, MainLeakActivity.class);
        startActivity(intent);
        //构建者模式
        Builder builder = new ConcreateBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        AndroidProduct androidProduct = new AndroidProduct.Builder().setPartA("a").setPartB("b").setPartC("c").build();
        /**
         * adapter
         */
        Adapter adapter = new Adapter();
        adapter.sampleOperation1();
        adapter.sampleOperation2();
        Adaptee adaptee = new Adaptee();
        AdapterObject adapterObject = new AdapterObject(adaptee);
        adapterObject.sampleOperation2();
        adapterObject.sampleOperation1();
        /***
         * decorator装饰模式
         */
        Component component = new ConcreteComponent();
        ConcreteDecorator concreateDecorator = new ConcreteDecorator(component);
        concreateDecorator.operation();
        /***
         * facede 外观模式
         */
        Facede.getInstance().testOperation();
        /***
         * 组合模式
         */
        Composite root = new Composite("root");
        Composite branch1 = new Composite("branch1");
        Composite branch2 = new Composite("branch2");
        Composite branch3 = new Composite("branch3");

        Leaf leaf1 = new Leaf("leaf1");
        Leaf leaf2 = new Leaf("leaf2");
        Leaf leaf3 = new Leaf("leaf3");

        branch1.addChild(leaf1);
        branch3.addChild(leaf2);
        branch3.addChild(leaf3);

        root.addChild(branch1);
        root.addChild(branch2);
        root.addChild(branch3);

        root.doSomeThing();
        /**
         * 策略模式
         */
        StrategyContext context = new StrategyContext();
        context.setAbstractStrategy(new BusStrategy());//传入需要用的算法功能
        context.calclatePrice(20);
        /**
         * 模板模式
         */
        BossWork bossWork = new BossWork();
        bossWork.newDay();
        StaffWork staffWork = new StaffWork();
        staffWork.newDay();
        /**
         * 观察者模式
         */
        ConcreteSubject concreteSubject = new ConcreteSubject();
        Oberver oberver = new ConcreteObserver();
        concreteSubject.attach(oberver);
        concreteSubject.change("I change");

        TargetObservable targetObservable = new TargetObservable();
        TargetObserver targetObserver = new TargetObserver();
        targetObservable.addObserver(targetObserver);
        targetObservable.setNewState("hello");
        /**
         * 回调模式
         */
        new Employee().setCallBack(new CallBack() {
            @Override
            public void work() {

            }
        });
        /**
         * 责任链
         *
         */
        ProjectManager projectManager = new ProjectManager(100);
        projectManager.setNextHandler(new ProjectCEO(200));
        projectManager.handlerRequest(20);
        /**
         * 简单 工厂模式
         */
        PhoneFactory factory = new PhoneFactory();
        AbstractProduct product1 = (AndroidPhone) factory.createPhoneProduct("android");
        product1.usePhone();
        /***
         *
         */
    }
}
