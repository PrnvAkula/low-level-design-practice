public class CharacterFactory {
    private Character prototypeCharacter;

    public CharacterFactory(){
        prototypeCharacter = new Character("Default", 100, 1, 20);
    }

    public Character createCharacterWithNewName(String name){
        try{
            Character clonedCharacter = prototypeCharacter.clone();
            clonedCharacter.setName(name);
            return clonedCharacter;
        }
        catch(CloneNotSupportedException e){
            throw new RuntimeException("Cloning not supported");
        }
    }

    public Character createCharacterWithNewLevel(int level){
        try{
            Character clonedCharacter = prototypeCharacter.clone();
            clonedCharacter.setLevel(level);
            return clonedCharacter;
        }
        catch(CloneNotSupportedException e){
            throw new RuntimeException("Clone not supported");
        }
    }

    public Character createCharacterWithNewPower(int power){
        try{
            Character clonedCharacter = prototypeCharacter.clone();
            clonedCharacter.setPower(power);
            return clonedCharacter;
        }
        catch(CloneNotSupportedException e){
            throw new RuntimeException("Clone not supported");
        }
    }
}
