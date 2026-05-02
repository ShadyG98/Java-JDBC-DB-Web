package enumerations;

public enum CountriesContinents {
    AFRICA("Morocco", "Senegal", "Tunisia"),
    EUROPE("Spain", "England", "Italy"),
    ASIA("China", "India", "Thailand"),
    AMERICA("Colombia", "Peru", "Mexico"),
    OCEANIA("New Zealand");

    private final String[] countries;

    CountriesContinents(String... countries) {
        this.countries = countries;
    }

    public String[] getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        StringBuilder countries = new StringBuilder();
        for (String country : this.countries) {
            countries.append(country).append(" ");
        }
        return "countries = " + countries.toString();
    }
}