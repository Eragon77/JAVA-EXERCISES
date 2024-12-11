package package10;

public final class H extends Letter {

    @Override
    protected String getRow(int num) throws IllegalArgumentException {

        return switch(num){
            case 0-> "       ";
            case 1, 2, 3, 5, 6, 7 ->" *   * ";
            case 4->" ***** ";
            default->throw new IllegalArgumentException("insert valid line");

        };
    }


}
