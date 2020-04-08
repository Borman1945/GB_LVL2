public abstract class Obstacles {
    int obstaclesParam;
    public Obstacles(int obstaclesParam){
        this.obstaclesParam = obstaclesParam;
    }

    protected abstract boolean isOut(RunblJumpbl rnJmbpl);
}
