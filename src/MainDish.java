public class MainDish {
    private String mainDishname;
    private double mainDishPrice;

    MainDish (String name, double price) {
        this.mainDishname = name;
        this.mainDishPrice = price;
    }

    public String getMainDishName () {
        return mainDishname;
    }
    public double getMainDishPrice () {
        return mainDishPrice;
    }
    public void setMainDishname (String name) {
        this.mainDishname = name;
    }
    public void setMainDishPrice (double price) {
        this.mainDishPrice = price;
    }
}
