package lk.ijse;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        Student student = new Student("1","chathura","mathugama");

            try {
                FileOutputStream file = new FileOutputStream("student.ser");
                ObjectOutputStream out = new ObjectOutputStream(file);
                out.writeObject(student);
                System.out.println("Object has been Serialized");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}
