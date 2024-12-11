package package10;

public final class O extends Letter {
    @Override
    protected String getRow(int num) throws IllegalArgumentException {

        return switch (num) {
            case 0 -> "       ";
            case 2, 3, 4, 5, 6 -> " *   * ";
            case 1, 7 -> " ***** ";
            default -> throw new IllegalArgumentException("insert valid line");

        };
    }
}
