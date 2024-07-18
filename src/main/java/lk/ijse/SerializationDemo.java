package lk.ijse;

import java.awt.print.PrinterException;
import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
//        Student student = new Student("1","chathura","mathugama");
//        Serialization
           /* try {
                FileOutputStream fileOut = new FileOutputStream("student.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(student);
                System.out.println("Object has been Serialized");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }*/

         Student student = null;
//         Deserialization
        try {
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            student = (Student) in.readObject();
            System.out.println("Object has been deserialized ");
            System.out.println("id : "+student.getId());
            System.out.println("name : "+student.getName());
            System.out.println("address : "+student.getAddress());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
