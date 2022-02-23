public class MealPrice {

    public static void calculateTotalMealPrice (double listedMealPrice, double tipRate , double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meail price is: " + result);
    }


    public static void main(String[] args) {
        calculateTotalMealPrice(15, 0.20, 0.08);
        calculateTotalMealPrice(25, 0.18, 0.08);
    }
}
