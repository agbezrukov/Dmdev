package space.object;

public class Star extends SpaceObject{

    int temperature;

    public Star(String name, int speed, double radius, double weight, int temperature) {
        super(name, speed, radius, weight);
        this.temperature = temperature;
    }

    public int beStar(){
        return 0;
    }

    @Override
    public String toString() {
        return "Star{" +
                " name='" + getName() + '\'' +
                ", speed=" + getSpeed() +
                ", radius=" + getRadius() +
                ", weight=" + getWeight() +
        ", temperature=" + temperature +
                '}';
    }
}
