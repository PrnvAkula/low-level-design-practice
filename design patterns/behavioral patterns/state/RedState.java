

public class RedState implements TrafficLightState{
    @Override
    public void next(TrafficLight context){
        System.out.println("Switching from RED to GREEN");
        context.setState(new GreenState());
    }

    @Override
    public String getColor(){
        return "RED";
    }
}
