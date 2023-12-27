package decorator;

public abstract class FastFood {
    //价格
    private float price;
    //小炒的种类:炒面,炒米,炒河粉...
    private String desc;

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract float cost();  //获取价格
}
//在学习设计模式的过程中,我对类中的set和get又有了一种理解,构造函数是对象创建时来修改对象的状态
//而set呢是对象创建以后来修改对象的状态,两种方法执行的时期是不一样的.其实在以前,我总是会忽视set和get方法
//但我现在认为set方法是和构造方法并列的.
