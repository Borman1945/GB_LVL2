package lesson_1;

public class Human implements RunblJumpbl {
    private String name;
    private int limitRun;
    private int limitJump;

    public int getLimitRun() {
        return limitRun;
    }

    public int getLimitJump() {
        return limitJump;
    }

    public String getName() {
        return name;
    }

    public Human(String name, int limitRun, int limitJump) {
        this.name = name;
        this.limitRun = limitRun;
        this.limitJump = limitJump;
    }

    @Override
    public void run(int length) {

        System.out.println("Human " + name + " бежит!");
    }

    @Override
    public void jump(int height) {

        System.out.println("Human " + name + " прыгает!");


    }
}
