public class Car {
    private String engine;
    private int seats;
    private String color;
    private boolean sunRoof;
    private boolean selfDriving;

    private Car(CarBuilder builder){
        this.engine = builder.engine;
        this.seats = builder.seats;
        this.color = builder.color;
        this.sunRoof = builder.sunRoof;
        this.selfDriving = builder.selfDriving;
    }

    public String getEngine(){
        return engine;
    }

    public int getSeats(){
        return seats;
    }

    public String getColor(){
        return color;
    }

    public boolean getSunRoof(){
        return sunRoof;
    }

    public boolean getSelfDriving(){
        return selfDriving;
    }

    public String getCarInfo(){
        return
        "Car : [engine : " + engine + 
        ", seats: " + seats +
        ", color: " + color +
        ", sun roof: " + sunRoof +
        ", self driving: " + selfDriving + "]";
    }


    public static class CarBuilder {
        private String engine;
        private int seats = 5;
        private String color = "Black";
        private boolean sunRoof = false;
        private boolean selfDriving = false;

        public CarBuilder setEngine(String engine){
            this.engine = engine;
            return this;
        }

        public CarBuilder setSeats(int seats){
            this.seats = seats;
            return this;
        }

        public CarBuilder setColor(String color){
            this.color = color;
            return this;
        }

        public CarBuilder setSunRoof(boolean sunRoof){
            this.sunRoof = sunRoof;
            return this;
        }

        public CarBuilder setSelfDriving(boolean selfDriving){
            this.selfDriving = selfDriving;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
