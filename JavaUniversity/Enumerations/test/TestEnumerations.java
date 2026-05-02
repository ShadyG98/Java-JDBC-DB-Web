package enumerations;

public class TestEnumerations {
    public static void main(String[] args) {
        System.out.println("Continent no. 4: " + Continents.AMERICA);
        System.out.println("No. Countries in 4th continent: " + Continents.AMERICA.getCountries());

        System.out.println("Continent no. 1: " + Continents.AFRICA);
        System.out.println("No. Countries in 1st continent: " + Continents.AFRICA.getCountries());
    }
}