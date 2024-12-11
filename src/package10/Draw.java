package package10;

public abstract class Draw {
    public abstract int getWidth();
    public abstract int getHeight();
    protected abstract String getRow(int num) throws IllegalArgumentException;


    @Override
    public final String toString(){
        StringBuilder result=new StringBuilder();

        for(int count=0;count<getHeight();count++) {
            result.append(getRow(count));
            result.append("\n");
        }

        return result.toString();

    }

}
