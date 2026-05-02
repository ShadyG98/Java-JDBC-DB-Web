package generics;

public class TestGenerics {
    public static void main(String[] args) {
        GenericClass<Integer> intObject = new GenericClass<>(15);
        intObject.getObjectType();

        GenericClass<String> stringObject = new GenericClass<>("John");
        stringObject.getObjectType();
    }
}