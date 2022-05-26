package space.object;

public final class Asteroid extends SpaceObject{

    public Asteroid(String name, int speed, double radius, double weight) {
        super(name, speed, radius, weight);
    }

    @Override
    public String toString() {
        return "Asteroid{" +
                " name='" + getName() + '\'' +
                ", speed=" + getSpeed() +
                ", radius=" + getRadius()+
                ", weight=" + getWeight() +
                '}';
    }
}
