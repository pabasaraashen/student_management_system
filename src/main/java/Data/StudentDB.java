/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author pabas
 */
public class StudentDB implements Istudent {

    @Override
    public void insert(Student student) {
        
        File file=new File("E:\\GithubStudentDetails.txt");
        try {
            FileWriter filewriter=new FileWriter(file);
        } catch (IOException ex) {
            System.getLogger(StudentDB.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    @Override
    public void view() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void search() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
