import java.util.ArrayList;


public class TestMyHomeTask {

    public static void main(String... args) {
        //create massive
        Obstacles[] obstacles = new Obstacles[3];
        obstacles[0] = new Wall(2);
        obstacles[1] = new Track(500);
        obstacles[2] = new Track(50000);
        ArrayList<RunblJumpbl> rubJumpbl = new ArrayList<>();
        rubJumpbl.add(new Cat("Барсик", 100, 3));
        rubJumpbl.add(new Human("Мошка", 5000, 2));
        rubJumpbl.add(new Robot("II", 1000000, 10));
        rubJumpbl.add(new Cat("Сик", 500, 5));
        rubJumpbl.add(new Human("Мышка", 1000, 1));
        rubJumpbl.add(new Robot("II1", 10, 1));
        rubJumpbl.add(new Robot("II2", 1000, 2));


        for (Obstacles obs : obstacles) {
            System.out.println("Начало препятствия" + System.lineSeparator());
            for (int i = 0; i < rubJumpbl.size(); i++) {
                if (obs.isOut(rubJumpbl.get(i))) {
                    rubJumpbl.remove(rubJumpbl.get(i));
                    --i;
                } else {
                    System.out.println(rubJumpbl.get(i).getName() + " прошел препятствие");
                }
            }
        }


    }

}
