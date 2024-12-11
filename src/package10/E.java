package package10;

public final class E extends Letter {

    @Override
    protected String getRow(int num) throws IllegalArgumentException {

        return switch (num) {
            case 0 -> "       ";
            case 1, 4, 7 -> " ***** ";
            case 2, 3, 5, 6 -> " *     ";
            default -> throw new IllegalArgumentException("insert valid line");

        };
    }
}
