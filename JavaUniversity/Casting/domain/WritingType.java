package casting;

public enum WritingType {
    CLASSIC("Handwriting"),
    MODERN("Digital Writing");

    private final String description;

    private WritingType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}