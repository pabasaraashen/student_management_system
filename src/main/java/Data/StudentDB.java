/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pabas
 */
public class StudentDB implements Istudent {
Student student;
    File file = new File("E:\\Github\\StudentDetails.txt");

    @Override
    public boolean insert(Student student) {

        try {
            FileWriter filewrite = new FileWriter(file, true);
            filewrite.write("First Name: " + student.getFirstName() + "\n"
                    + "Last Name: " + student.getLastName() + "\n"
                    + "Gender: " + student.getGender() + "\n"
                    + "Age: " + student.getAge() + "\n"
                    + "Grade: " + student.getGrade() + "\n\n");

            filewrite.close();
            return true;
        } catch (IOException ex) {
            System.getLogger(StudentDB.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return false;
    }

    @Override
    public ArrayList<Student> view() {
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String arr[] = line.split(":");
                String firstname = arr[0];
                String lastname = arr[1];
                String Gender = arr[2];
                int age=Integer.valueOf(arr[3]);
                int grade=Integer.valueOf(arr[4]);
                student=new Student(firstname, lastname, Gender, age, grade);
            }
        } catch (FileNotFoundException ex) {
            System.getLogger(StudentDB.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    @Override
    public void search() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
