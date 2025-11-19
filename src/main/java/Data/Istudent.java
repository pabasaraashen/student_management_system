/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Data;

import java.util.ArrayList;

/**
 *
 * @author pabas
 */
public interface Istudent {

    public abstract boolean insert(Student student);

    public abstract ArrayList<Student> view();

    public abstract ArrayList<Student> search(int grade);
    
    public abstract boolean delete(String firstname);
    
    public abstract boolean update(Student student);
}
