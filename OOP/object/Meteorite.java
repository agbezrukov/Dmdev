package space.object;

public final class Meteorite extends SpaceObject{

    public Meteorite(String name, int speed, double radius, double weight) {
        super(name, speed, radius, weight);
    }

    @Override
    public String toString() {
        return "Meteorite{" +
                " name='" + getName() + '\'' +
                ", speed=" + getSpeed() +
                ", radius=" + getRadius()+
                ", weight=" + getWeight() +
                '}';
    }
}
