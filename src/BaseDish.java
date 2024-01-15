public abstract class BaseDish {
    private String name;
    private double price;

    BaseDish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
}
