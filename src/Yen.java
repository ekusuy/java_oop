public class Yen {
    int value;

    Yen(int value)
    {
        this.value = value;
    }

    String asText() {
        if(value == 0) return "-";
        return String.format("%d円", value);
    }
}
