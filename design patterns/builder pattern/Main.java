public class Main {
    public static void main(String[] args){
        Car.CarBuilder builder = new Car.CarBuilder();
        Car car = builder.setEngine("V6")
                .setSeats(4)
                .setColor("Blue")
                .setSelfDriving(true)
                .build();
        System.out.println(car.getCarInfo());
    }
}
