public class CofeeBeverage extends Beverage{
    @Override
    public void brew(){
        System.out.println("Brewing Coffee...");
    }

    @Override
    public void addCondiments(){
        System.out.println("Adding sugar and milk...");
    }

    @Override
    public boolean customerWantsCondiments(){
        return false;
    }
}
