package casting;

public class TestObjectConversion {
    public static void main(String[] args) {
        Employee employee;

        employee = new Writer("John", 5000, WritingType.CLASSIC);

        Writer writer = (Writer) employee;
        writer.getWritingType();

        Employee employee2 = writer;
        System.out.println(employee.getDetails());
    }
}