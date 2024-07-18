package lk.ijse;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) {
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
