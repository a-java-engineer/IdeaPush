package decorator;

public class FastNoodle extends FastFood {
    public FastNoodle() {
        super(8,"炒面");
    }
    @Override

    public float cost() {
        return super.getPrice();
    }
}
