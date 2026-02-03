public class YellowState implements TrafficLightState {
    @Override
    public void next(TrafficLight context){
        System.out.println("Switching from YELLOW to RED");
        context.setState(new RedState());
    }

    @Override
    public String getColor(){
        return "YELLOW";
    }
}
