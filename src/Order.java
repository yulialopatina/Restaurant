import static takeout.utils.PrintUtils.*;
import static takeout.utils.PrintUtils.CommonPrintMethods.*;
import static takeout.utils.PrintUtils.CommonPrintMethods.printLine;

public class Order {
    private String clientName;
    private int orderNumber;

    private MainDish mainDishChoice;
    private Side sideChoice;
    private Drink drinkChoice;
    private double tips;
    private double totalPrice;

    private static int staticCount = 0;
    private int dynamicCount = 0;
    private static int operations = 0;

    public Order (String clientName) {
        this.clientName = clientName;
        this.orderNumber = ++staticCount;
        operations++;
        dynamicCount++;
    }
    public void cancelOrder () {
        dynamicCount--;
       // operations++;
    }
    public void setStatusActive() {
        if (dynamicCount==0) {
            dynamicCount++;
        } else if (dynamicCount == 2) {
            dynamicCount--;
        }
       // operations++;
    }
    public void setStatusDone () {
        if (dynamicCount == 1) {
            dynamicCount++;
        }
        //operations++;
    }
    public void printOrder(){
        //operations++;
        printLine();
        println();
        print("Order# " + orderNumber);
        print("            Client Name: " + clientName + "        ");
        print("Order Status: " + dynamicCount);
        print("              Operations: " + operations);
        printLine();

    }


}
