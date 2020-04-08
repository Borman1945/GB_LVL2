public class Wall extends Obstacles{
    private int height;

    public Wall(int height) {
        super(height);
        this.height = height;
    }

    protected boolean isOut(RunblJumpbl rnJmbpl){
        if (height > rnJmbpl.getLimitJump()) {
            return true;
        } else return false;
    }

    public int getHeight() {
        return height;
    }
}
