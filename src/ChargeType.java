public enum ChargeType implements Charge {

    silver(new Silver()),
    adult(new Adult()),
    child(new Child());

    Charge charge;

    private ChargeType(Charge charge)
    {
        this.charge = charge;
    }

    @Override
    public String label() {
        return charge.label();
    }

    @Override
    public Yen amount() {
        return charge.amount();
    }

    @Override
    public String description()
    {
        return charge.description();
    }

    @Override
    public String toString()
    {
        return String.format("%s : %s(%s)",label(),amount().asText(),description());
    }
}
