package org.launchcode.java.demos.lsn3classes1;

import java.util.Scanner;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa){
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Illegal argument");
        }
        else{
            this.name = name;
            this.studentId = studentId;
            this.numberOfCredits = numberOfCredits;
            this.gpa = gpa;
        }
    }

    public Student (String name, int studentId){
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Illegal argument");
        }
        else{
            this.name = name;
            this.studentId = studentId;
            this.numberOfCredits = 0;
            this.gpa = 0;
        }
    }

    public String toString(){
        return this.name + " (Credits: " + this.numberOfCredits + " GPA: " + this.gpa + ")";
    }

    public boolean equals(Object toBeCompared){
        if(toBeCompared == this){
            return true;
        }

        if(toBeCompared == null){
            return false;
        }

        if(toBeCompared.getClass() != getClass()){
            return false;
        }

        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == getStudentId();
    }

    public void setName(String name) {
        if(name != null || !name.isEmpty()){
            this.name = name;
        }
        else
            throw new IllegalArgumentException("illegal argument");
    }

    public void setStudentId(int studentId) {
            this.studentId = studentId;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public void setGpa(double newGpa){
        setGpaPriv(newGpa);
    }

    private void setGpaPriv(double setNewGpa){
        this.gpa = setNewGpa;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public String getGradeLevel(){
        int currentCredits = getNumberOfCredits();
        String gradeLevel = "";

        if(currentCredits < 30){
            gradeLevel = "Freshman";
        }
        else if(currentCredits < 60 ){
            gradeLevel = "Sophomore";
        }
        else if(currentCredits < 90){
            gradeLevel = "Junior";
        }
        else{
            gradeLevel = "Senior";
        }
        return gradeLevel;
    }

    public void addGrade(int courseCredits, double numericalGrade){
        double qualityScore = courseCredits * numericalGrade;
        double currentTotalQualityScore = getGpa() * getNumberOfCredits();
        int updatedCredits = getNumberOfCredits() + courseCredits;
        setNumberOfCredits(updatedCredits);

        double newGpa = (currentTotalQualityScore + qualityScore) / updatedCredits;

        setGpa(newGpa);
        return;
    }
}