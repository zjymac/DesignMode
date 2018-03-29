package wanandroid.zjy.com.singletonpattern.factory;

/**
 * 描述：
 * 作者：zjy on 2018/3/28 11:18
 */

public class PhoneFactory {
    public AbstractProduct createPhoneProduct(String name) {
        AbstractProduct product = null;
        if ("android".equals(name)) {
            product = new AndroidPhone();
        } else if ("ios".equals(name)) {
            product = new IosPhone();
        }
        return product;
    }
}
