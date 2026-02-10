public class Main {
    public static void main(String[] args) {
        Beverage coffee = new CofeeBeverage();
        Beverage tea = new TeaBeverage();

        System.out.println("Making coffee:");
        coffee.prepareRecipe();

        System.out.println("\nMaking Tea:");
        tea.prepareRecipe();
    }
}
