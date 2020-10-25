public class Silver implements Charge{
    @Override
    public String label() {
        return "高齢者";
    }

    @Override
    public Yen amount() {
        return new Yen(0);
    }

    @Override
    public String description()
    {
        return "無料";
    }
}
