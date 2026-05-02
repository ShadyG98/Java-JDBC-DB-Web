package enumerations;

public class MainEnumerations {

    public static void main(String[] args) {
        printExample();
    }

    public static void printExample() {
        for (CountriesContinents c : CountriesContinents.values()) {
            System.out.println("the continent is: " + c.name() + " contains " + c);
        }
    }
}