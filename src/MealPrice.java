public class MealPrice {

    // public static void calculateTotalMealPrice (double listedMealPrice, double tipRate , double taxRate) {
    public static double calculateTotalMealPrice (double listedMealPrice, double tipRate , double taxRate) {

        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total mail price is: " + result);
        return result;
    }


    public static void main(String[] args) {
        //calculateTotalMealPrice(100, 0.20, 0.08);
        double groupTotalMealPrice = calculateTotalMealPrice(100, .2, .08);
        System.out.println(groupTotalMealPrice);

        double individualMealPrice = groupTotalMealPrice / 5;
        System.out.println(individualMealPrice);
    }
}
