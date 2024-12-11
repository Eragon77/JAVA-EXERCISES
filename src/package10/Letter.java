package package10;

public abstract class Letter extends Draw {
    private static final int WIDTH=7;
    private static final int HEIGHT=8;


    @Override
    public int getHeight() {
        return HEIGHT;
    }

    @Override
    public int getWidth(){
        return WIDTH;
    }


}
