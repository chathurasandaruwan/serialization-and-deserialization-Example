package lk.ijse;

import java.awt.print.PrinterException;
import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        Student student = new Student("2","chathura","mathugama");
//        Serialization
            try {
                FileOutputStream fileOut = new FileOutputStream("student.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(student);
                System.out.println("Object has been Serialized");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}
