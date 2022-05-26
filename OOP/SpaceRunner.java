package space;

import space.object.*;

public class SpaceRunner {
    public static void main(String[] args) {
        Planet planet1 = new Planet("Earth",120,50,20);
        System.out.println(planet1.getDiameter());
        System.out.println(planet1);

        SpaceObject spaceObject = new SpaceObject();

        Planet planet2 = new Planet("Mars",100,35,30);

        Star star1 = new Star("Bear", 0,77.4,93,10000);

        SatelitePlanet satelitePlanet = new SatelitePlanet("Moon", 200, "Earth");
        System.out.println(satelitePlanet);

        System.out.println(SpaceUtils.isStar(star1));

        System.out.println("Гравитация " + planet1.getName() + " относительно " + star1.getName() + " равна " +
                SpaceUtils.isGravity(planet1,star1));

        spaceObject.comparisonWeight(planet1,planet2);
    }
}
