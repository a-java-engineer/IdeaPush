package decorator;

public class FriedRice extends FastFood{
    public FriedRice() {
        super(8,"炒饭");
    }
    @Override
    public float cost() {
        return getPrice();
    }
}
