package lesson_1;

public class Cat implements RunblJumpbl {
    private String catname;
    private int limitRun;
    private int limitJump;

    public Cat(String catname, int limitRun, int limitJump) {
        this.catname = catname;
        this.limitRun = limitRun;
        this.limitJump = limitJump;
    }

    public String getName() {
        return catname;
    }

    public int getLimitRun() {
        return limitRun;
    }

    public int getLimitJump() {
        return limitJump;
    }

    @Override
    public void run(int length) {
        System.out.printf("Cat %s бежит!",catname);

    }

    @Override
    public void jump(int height) {
        System.out.println("Cat " + catname + " прыгает!");


    }
}
