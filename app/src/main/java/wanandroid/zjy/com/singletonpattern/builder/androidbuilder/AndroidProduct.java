package wanandroid.zjy.com.singletonpattern.builder.androidbuilder;

/**
 * 描述：
 * 作者：58 on 2018/3/26 18:46
 */

public class AndroidProduct {
    private String partA;
    private String partB;
    private String partC;

    private AndroidProduct(String partA, String partB, String partC) {
        this.partA = partA;
        this.partB = partB;
        this.partC = partC;
    }

    public  static class Builder {
        private String partA;
        private String partB;
        private String partC;

        public Builder setPartA(String partA) {
            this.partA = partA;
            return this;
        }

        public Builder setPartB(String partB) {
            this.partB = partB;
            return this;
        }

        public Builder setPartC(String partC) {
            this.partC = partC;
            return this;
        }

        public AndroidProduct build() {
            return new AndroidProduct(partA, partB, partC);
        }
    }
}
