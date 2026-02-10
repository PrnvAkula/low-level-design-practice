public abstract class Beverage {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) addCondiments();
    }

    private void boilWater(){
        System.out.println("Boiling water...");
    }

    private void pourInCup(){
        System.out.println("Pouring in cup...");
    }

    public abstract void brew();

    public abstract void addCondiments();

    public boolean customerWantsCondiments(){
        return true;
    }
}
