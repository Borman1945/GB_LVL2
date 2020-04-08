

public class Track extends Obstacles{
    private int length;

    public Track(int length) {
        super(length);
        this.length = length;
    }

    protected boolean isOut(RunblJumpbl rnJmbpl){
       if (length > rnJmbpl.getLimitRun()) {
           return true;
       } else return false;
    }
    public int getLength() {
        return length;
    }
}
