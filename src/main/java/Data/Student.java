/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author pabas
 */
public class Student {
    private String FirstName;
    private String LastName;
    private String Gender;
    private int age;
    private int grade;

    public Student(String FirstName, String LastName, String Gender, int age, int grade) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
        this.age = age;
        this.grade = grade;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getGender() {
        return Gender;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }
      
}
