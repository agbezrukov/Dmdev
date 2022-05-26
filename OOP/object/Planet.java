package space.object;

public class Planet extends SpaceObject{

    public Planet(String name, int speed, double radius, double weight) {
        super(name, speed, radius, weight);
    }

    public Planet(String name, int speed) {
        super(name, speed);
    }

    @Override
    public String toString() {
        return "Planet{"  +
                "name='" + getName() + '\'' +
                ", speed=" + getSpeed() +
                ", radius=" + getRadius() +
                ", weight=" + getWeight() +
                '}';
    }
}
