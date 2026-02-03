public class GreenState implements TrafficLightState{
    @Override
    public void next(TrafficLight context){
        System.out.println("Switching from GREEN to YELLOW");
        context.setState(new YellowState());
    }

    @Override
    public String getColor(){
        return "GREEN";
    }
}
