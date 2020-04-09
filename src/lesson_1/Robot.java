package lesson_1;

public class Robot implements RunblJumpbl {
    private String robotName;
    private int limitRun;
    private int limitJump;

    public int getLimitRun() {
        return limitRun;
    }

    public String getName() {
        return robotName;
    }

    public int getLimitJump() {
        return limitJump;
    }

    public Robot(String robotName, int limitRun, int limitJump) {
        this.robotName = robotName;
        this.limitRun = limitRun;
        this.limitJump = limitJump;
    }

    @Override
    public void run(int length) {

        System.out.println("Robot " + robotName + " бежит!");

    }

    @Override
    public void jump(int height) {

        System.out.println("Robot " + robotName + " прыгает!");


    }
}
