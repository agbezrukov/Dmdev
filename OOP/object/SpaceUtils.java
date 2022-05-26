package space.object;

/**
 * Создать утилитный класс* SpaceUtils со следующими статическими методами:
 * - Принимающий 2 космический объекта и определяющий силу гравитации между ними
 * (можно придумать любую формула на основании расстоянии между объектами и т.д.)
 * - Принимающий космический объект и определяющий, является ли он звездой или нет
 */
public final class SpaceUtils {

    private SpaceUtils() {
    }

    public static boolean isStar(SpaceObject spaceObject) {
        return spaceObject instanceof Star;
    }

    public static double isGravity(SpaceObject spaceObject1, SpaceObject spaceObject2){
        return spaceObject1.getWeight() / spaceObject2.getWeight();
    }
}
