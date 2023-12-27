package decorator3;

// 快餐接口
interface FastFood {
    double getPrice();
}

// 具体快餐类 - 炒面
class Noodle implements FastFood {
    public double getPrice() {
        return 10.0;
    }
}

// 具体快餐类 - 炒饭
class FriedRice implements FastFood {
    public double getPrice() {
        return 12.0;
    }
}

// 配菜接口
interface Topping extends FastFood {
    // 配菜名称
    String getName();
}

// 具体配菜类 - 鸡蛋
class Egg implements Topping {
    private FastFood fastFood;

    public Egg(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public double getPrice() {
        return fastFood.getPrice() + 2.0; // 鸡蛋价格为2.0
    }

    public String getName() {
        return "鸡蛋";
    }
}

// 具体配菜类 - 火腿
class Ham implements Topping {
    private FastFood fastFood;

    public Ham(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public double getPrice() {
        return fastFood.getPrice() + 3.0; // 火腿价格为3.0
    }

    public String getName() {
        return "火腿";
    }
}

// 具体配菜类 - 培根
class Bacon implements Topping {
    private FastFood fastFood;

    public Bacon(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public double getPrice() {
        return fastFood.getPrice() + 4.0; // 培根价格为4.0
    }

    public String getName() {
        return "培根";
    }
}

public class DecoratorPatternExample {
    public static void main(String[] args) {
        // 创建炒面
        FastFood noodle = new Noodle();

        // 添加鸡蛋和火腿
        FastFood noodleWithEggAndHam = new Ham(new Egg(noodle));

        System.out.println("炒面价格: " + noodle.getPrice());
        System.out.println("炒面加鸡蛋和火腿的价格: " + noodleWithEggAndHam.getPrice());

        // 创建炒饭
        FastFood friedRice = new FriedRice();

        // 添加鸡蛋、火腿和培根
        FastFood friedRiceWithToppings = new Bacon(new Ham(new Egg(friedRice)));

        System.out.println("炒饭价格: " + friedRice.getPrice());
        System.out.println("炒饭加鸡蛋、火腿和培根的价格: " + friedRiceWithToppings.getPrice());

        FastFood friedRiceWithToppings1=new Egg(new Bacon(new Ham(new Egg(friedRice))));
        System.out.println("炒饭加2个鸡蛋、火腿和培根的价格: " + friedRiceWithToppings1.getPrice());
    }
}

