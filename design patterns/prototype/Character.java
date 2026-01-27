public class Character implements Cloneable {
    private String name;
    private int health;
    private int level;
    private int power;

    public Character(String name, int health, int level, int power){
        this.name = name;
        this.health = health;
        this.level = level;
        this.power = power;
    }

    @Override
    public Character clone() throws CloneNotSupportedException{
        return (Character) super.clone();
    }

    public void showCharacterInfo(){
        System.out.println("Name: " + name + ", health: " + health + ", level: " + level + ", power: " + power);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public void setPower(int power){
        this.power = power;
    }
    
    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public int getLevel(){
        return level;
    }

    public int getPower(){
        return power;
    }
}
