public class Child implements Charge {
    @Override
    public String label() {
        return "子供";
    }

    @Override
    public Yen amount() {
        return new Yen(1000);
    }

    @Override
    public String description()
    {
        return "半額";
    }


}
