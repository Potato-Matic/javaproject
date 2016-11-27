/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author m
 */
class Assignment {
    // OVERVIEW
    // the assignment class belongs to a student
    // and has an assignment name
    // as well as a grade (mark) associated with it
    
    // AF(s) = { s.getUserName() == this.userName && s.checkPassword == true }
    
    // rep invariant
    // s.getRole.equals("Professor") &&
    // s.getUserName() == this.userName &&
    // s.checkPassword == true
    
    private Student student;
    private String name;
    private Double mark;
    
    Assignment(Student student, String name, Double mark) {
        this.student = student;
        this.name = name;
        this.mark = mark;
    }
    
    /**
     * @return the student's name
     */
    public String getStudentName() {
        return student.getUserName();
    }
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the mark
     */
    public Double getMark() {
        return mark;
    }
    
        
    @Override
    public String toString(){
        return "Username: ";
    }
    
    public boolean repOk() {

        return true;
    }
}
