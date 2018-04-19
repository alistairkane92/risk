public enum Piece {
    INFANTRY(1),
    CAVALRY(5),
    ARTILLERY(10);

    private final int value;

    Piece(int value) {
        this.value = value;
    }
}
