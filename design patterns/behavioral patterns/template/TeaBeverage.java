public class TeaBeverage extends Beverage {
    @Override
    public void brew(){
        System.out.println("Steeping tea bag...");
    }

    @Override
    public void addCondiments(){
        System.out.println("Adding lemon...");
    }
}
