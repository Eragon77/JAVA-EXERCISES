package package10;

public final class L extends Letter{

    @Override
    protected String getRow(int num) throws IllegalArgumentException {

        return switch (num) {
            case 0 -> "       ";
            case 1, 2, 3, 4, 5, 6 -> " *     ";
            case 7 -> " ***** ";
            default -> throw new IllegalArgumentException("insert valid line");

        };
    }
}
