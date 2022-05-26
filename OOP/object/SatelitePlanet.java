package space.object;

public final class SatelitePlanet extends Planet{

    private String nameObject;

    public SatelitePlanet(String name, int speed, String nameObject) {
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
        return "SatelitePlanet{" +
                "name='" + getName() + '\'' +
                ", speed=" + getSpeed() +
                ", namePlanet='" + nameObject + '\'' +
                '}';
    }
}
