public abstract class BaseDish {
    private String name;
    private double price;

    BaseDish (String name, double price) {
      this.name = name;
      this.price = price;
    }
    public String getName () {
        return name;
    }
    public double getPrice () {
        return mainDishPrice;
    }
    public void setMainDishname (String name) {
        this.mainDishname = name;
    }
    public void setMainDishPrice (double price) {
        this.mainDishPrice = price;
    }
}
