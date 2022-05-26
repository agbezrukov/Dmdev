package space.object;

public class SpaceObject implements WithDiameter, WithWeight{

    private String name;
    private int speed;
    private double radius;
    private double weight;

    public SpaceObject(String name, int speed, double radius, double weight) {
        this.name = name;
        this.speed = speed;
        this.radius = radius;
        this.weight = weight;
    }

    public SpaceObject(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public SpaceObject() {
    }

    @Override
    public void comparisonWeight(SpaceObject spaceObject1, SpaceObject spaceObject2) {
        if (spaceObject1.getWeight() == spaceObject2.getWeight()) {
            System.out.println("Они равны");
        }else if (spaceObject1.getWeight() > spaceObject2.getWeight()){
            System.out.println(spaceObject1.getName() + " больше " + spaceObject2.getName());
        }else {
            System.out.println(spaceObject2.getName() + " больше " + spaceObject1.getName());
        }
    }

    @Override
    public double getDiameter() {
        return getRadius() * 2.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "SpaceObject{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", radius=" + radius +
                ", weight=" + weight +
                '}';
    }

}
