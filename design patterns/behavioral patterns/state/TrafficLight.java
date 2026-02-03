public class TrafficLight {
    private TrafficLightState currentState;

    public TrafficLight(){
        currentState = new RedState();
    }

    public void setState(TrafficLightState state){
        this.currentState = state;
    }

    public String getColor(){
        return currentState.getColor();
    }

    public void next(){
        currentState.next(this);
    }
}
