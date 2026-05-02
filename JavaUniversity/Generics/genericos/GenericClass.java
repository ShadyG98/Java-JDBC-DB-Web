package generics;

public class GenericClass<T> {
    private T object;

    public GenericClass(T object) {
        this.object = object;
    }

    public void getObjectType() {
        System.out.println("Type T is: " + object.getClass().getSimpleName());
    }
}