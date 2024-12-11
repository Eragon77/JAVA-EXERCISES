package package10;

public final class Star extends Draw {

    @Override
    protected String getRow(int num) throws IllegalArgumentException {

        return switch (num) {
            case 0,4 -> "X   X";
            case 1, 3-> " X X ";
            case 2 -> "  X  ";
            default -> throw new IllegalArgumentException("insert valid line");
        };
    }


    @Override
    public int getHeight() {
        return 5;
    }

    public int getWidth(){
        return 5;
    }
}
