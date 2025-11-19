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
            filewrite.write(student.getFirstName() + ":"
                    + student.getLastName() + ":"
                    + student.getGender() + ":"
                    + student.getAge() + ":"
                    + student.getGrade() + "\n");

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
            ArrayList<Student> studentlist = new ArrayList<>();
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String arr[] = line.split(":");
                String firstname = arr[0];
                String lastname = arr[1];
                String Gender = arr[2];
                int age = Integer.valueOf(arr[3]);
                int grade = Integer.valueOf(arr[4]);
                student = new Student(firstname, lastname, Gender, age, grade);
                studentlist.add(student);
            }
            return studentlist;
        } catch (FileNotFoundException ex) {
            System.getLogger(StudentDB.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Student> search(int grade) {
        ArrayList<Student> studentlist = view();
        ArrayList<Student> categoryList = new ArrayList<>();
        for (int i = 0; i < studentlist.size(); i++) {
            Student student = studentlist.get(i);
            if (student.getGrade() == grade) {
                String firstname = student.getFirstName();
                String lastname = student.getLastName();
                String Gender = student.getGender();
                int age = student.getAge();
                int grade1 = student.getGrade();
                student = new Student(firstname, lastname, Gender, age, grade1);
                categoryList.add(student);
            }
        }
        return categoryList;
    }

    @Override
    public boolean delete(String firstname) {
        ArrayList<Student> studentList = view();
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getFirstName().equals(firstname)) {
                studentList.remove(i);
            }
        }

    }
