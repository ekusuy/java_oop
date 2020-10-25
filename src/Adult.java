public class Adult implements Charge{
    @Override
    public String label() {
        return "大人";
    }

    @Override
    public Yen amount() {
        return new Yen(2000);
    }

    @Override
    public String description()
    {
        return "通常料金";
    }
}
