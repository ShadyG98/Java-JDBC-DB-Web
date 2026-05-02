package enumerations;

public enum Continents {
    AFRICA(53),
    EUROPE(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);

    private final int countries;

    Continents(int countries) {
        this.countries = countries;
    }

    public int getCountries() {
        return countries;
    }
}