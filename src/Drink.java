public final class Drink {
    private final String drinkName;
    private final double DrinkPrice;

    Drink (String name, double price) {
        this.drinkName = name;
        this.DrinkPrice = price;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public double getDrinkPrice() {
        return DrinkPrice;
    }
}
