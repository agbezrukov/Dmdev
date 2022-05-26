package space.object;

public final class RingPlanet extends Planet{

    private String nameObject;

    public RingPlanet(String name, int speed, String nameObject) {
        super(name, speed);
        this.nameObject = nameObject;
    }

    public String getNameObject() {
        return nameObject;
    }

    public void setNameObject(String nameObject) {
        this.nameObject = nameObject;
    }

    @Override
    public String toString() {
        return "RingPlanet{" +
                "name='" + getName() + '\'' +
                ", speed=" + getSpeed() +
                ", namePlanet='" + nameObject + '\'' +
                '}';
    }
}
