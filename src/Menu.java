import static takeout.utils.PrintUtils.*;
import static takeout.utils.PrintUtils.CommonPrintMethods.*;
import static takeout.utils.PrintUtils.CommonPrintMethods.printLine;
import static takeout.utils.PrintUtils.PrintTitle.*;

public class Menu {
    final MainDish beef = new MainDish("Beef Wellington", 13.00);
    final MainDish fish = new MainDish("Miso Salmon", 12.00);
    final MainDish chicken = new MainDish("Chicken Teriaki", 7.00);
    final MainDish pork = new MainDish("Honey Garlic Pork Chops", 10.00);

    Side rice = new Side("Brown Rice", 2.99);
    Side asparagus = new Side("Oven-Roased Asparagus", 4.50);
    Side beans = new Side("Green Beans Amandine", 5.00);
    Side potato = new Side("Creamy Mashed Potatoes", 4.00);

    Drink water = new Drink("Carbonad mineral water", 3);
    Drink wineWhite = new Drink("Chardonay", 20.50);
    Drink wineRed = new Drink("Grand Cru", 20.50);
    Drink juiceApple = new Drink("Apple Juice", 20.50);

    MainDish[] mainDishes = new MainDish[]{beef, fish, chicken, pork};
    Side[] sides = new Side[]{rice, asparagus, beans, potato};
    Drink[] drinks = new Drink[]{water, wineRed, wineWhite, juiceApple};

    public final String[] getMainDishesNames() {
        String[] mainDishesName = new String[mainDishes.length];
        for (int i = 0; i < mainDishesName.length; i++) {
            mainDishesName[i] = mainDishes[i].getMainDishName();
        }
        return mainDishesName;
    }
    public MainDish getBeef() {
        return beef;
    }

    public double[] getMainDishesPrices() {
        double[] mainDishesPrices = new double[mainDishes.length];
        for (int i = 0; i < mainDishesPrices.length; i++) {
            mainDishesPrices[i] = mainDishes[i].getMainDishPrice();
        }
        return mainDishesPrices;
    }

    public String[] getSidesNames() {
        String [] sidesNames = new String[sides.length];
        for (int i = 0; i<sidesNames.length;i++) {
            sidesNames[i] = sides[i].getSideName();
        }
        return sidesNames;
    }
    public double[] getSidesPrices() {
        double[] sidesPrices = new double[sides.length];
        for (int i = 0; i < sidesPrices.length; i++) {
            sidesPrices[i] = sides[i].getSidePrice();
        }
        return sidesPrices;
    }
    public String[] getDrinksNames() {
        String [] drinksNames = new String[drinks.length];
        for (int i = 0; i<drinksNames.length;i++) {
            drinksNames[i] = drinks[i].getDrinkName();
        }
        return drinksNames;
    }
    public double[] getDrinksPrices() {
        double[] drinksPrices = new double[drinks.length];
        for (int i = 0; i < drinksPrices.length; i++) {
            drinksPrices[i] = drinks[i].getDrinkPrice();
        }
        return drinksPrices;
    }
    String [] mainDishesNames = getMainDishesNames();
    double [] mainDishesPrices = getMainDishesPrices();
    private void printMainDishes (){
        printMainDishesTitle();
        for (int i = 0; i<mainDishes.length; i++) {
            print(getMainDishesNames()[i] + " " + "$" + getMainDishesPrices()[i]);
            println();
        }
        println();
    }
     private void printSides () {
        printSidesTitle();
        for (int i = 0; i< sides.length; i++) {
            print(getSidesNames()[i] + " " + "$" + getSidesPrices()[i]);
            println();
        }
        println();
    }
    private void printDrinks () {
        printDrinksTitle();
        for (int i = 0; i< drinks.length; i++) {
            print(getDrinksNames()[i] + " " + "$" + getDrinksPrices()[i]);
            println();
        }
        println();
    }
    public void printMenu() {
        printMenuTitle();
        printMainDishes();
        printSides();
        printDrinks();
        println();
        printLine();
    }
}
