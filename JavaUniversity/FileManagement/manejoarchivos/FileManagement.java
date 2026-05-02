package fileManagement;

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
}