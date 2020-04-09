package lesson_1;

import java.util.ArrayList;


public class TestMyHomeTask {

    public static void main(String... args) {
        //create massive
        Obstacles[] obstacles = new Obstacles[3];
        obstacles[0] = new Wall(2);
        obstacles[1] = new Track(500);
        obstacles[2] = new Track(50000);
        ArrayList<RunblJumpbl> runJumpbl = new ArrayList<>();
        runJumpbl.add(new Cat("Барсик", 100, 3));
        runJumpbl.add(new Human("Мошка", 5000, 2));
        runJumpbl.add(new Robot("II", 1000000, 10));
        runJumpbl.add(new Cat("Сик", 500, 5));
        runJumpbl.add(new Human("Мышка", 1000, 1));
        runJumpbl.add(new Robot("II1", 10, 1));
        runJumpbl.add(new Robot("II2", 1000, 2));


        for (Obstacles obs : obstacles) {
            System.out.println("Начало препятствия" + System.lineSeparator());
            for (int i = 0; i < runJumpbl.size(); i++) {
                if (obs.isOut(runJumpbl.get(i))) {
                    runJumpbl.remove(runJumpbl.get(i));
                    --i;
                } else {
                    System.out.println(runJumpbl.get(i).getName() + " прошел препятствие");
                }
            }
        }


    }

}
