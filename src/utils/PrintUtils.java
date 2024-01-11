package utils;

import static utils.PrintUtils.CommonPrintMethods.print;
import static utils.PrintUtils.CommonPrintMethods.println;

public class PrintUtils {
    private final static String LINE = "_______________________________________________";
    private final static String MAIN_DISHES_TITLE = "Our best Main Dishes";
    private final static String SIDES_NAME = "Our Healthy Sides";
    private final static String DRINKS_NAME = "Drinks";

    public static class CommonPrintMethods {
        public final static void print(String text) {
            System.out.print(text);
        }
        public static void printLine() {
            println();
            print(LINE);
        }
        public final static void println() {
            System.out.println();
        }

    }
    public static class PrintTitle {
        public static void printMenuTitle() {
            println();
            println();
            print("__________Take Out Menu__________");
            println();
            println();
        }

        public static void printMainDishesTitle() {
            print(MAIN_DISHES_TITLE);
            println();
            println();
        }

        public static void printSidesTitle() {
            print(SIDES_NAME);
            println();
            println();
        }

        public static void printDrinksTitle() {
            print(DRINKS_NAME);
            println();
            println();
        }
    }
        public static void printPrice(double price) {
            if (price < 10) {
                print("$ " + price);

            } else {
                print("$" + price);
            }
        }

        public static void printLine() {
            println();
            print(LINE);
        }

    }

