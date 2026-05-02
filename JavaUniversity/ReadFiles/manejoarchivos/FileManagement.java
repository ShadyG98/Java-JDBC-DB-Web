package readFiles;

import java.io.*;

public class FileManagement {

    public static void createFile(String fileName) {
        File file = new File(fileName);
        try {
            PrintWriter output = new PrintWriter(file);
            output.close();
            System.out.println("File created");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void writeFile(String fileName, String content) {
        File file = new File(fileName);
        try {
            PrintWriter output = new PrintWriter(file);
            output.println(content);
            output.close();
            System.out.println("Written to file");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void appendFile(String fileName, String content) {
        File file = new File(fileName);
        try {
            PrintWriter output = new PrintWriter(new FileWriter(file, true));
            output.println(content);
            output.close();
            System.out.println("Appended to file");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void readFile(String fileName) {
        var file = new File(fileName);
        try {
            var reader = new BufferedReader(new FileReader(file));
            var line = reader.readLine();
            while (line != null) {
                System.out.println("line = " + line);
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

}