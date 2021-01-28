package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;
import java.util.Map;

public class Course {
    private String name;
    private int number;
    private HashMap<Student, Double> roster;

    public Course(String name, int number, HashMap<Student, Double> roster){
        if(name == null || name.equals("") || Integer.toString(number).equals("")){
            throw new IllegalArgumentException("Illegal argument");
        }else if(roster == null) {
            this.name = name;
            this.number = number;
            this.roster = new HashMap<>();
        }else{
            this.name = name;
            this.number = number;
            this.roster = roster;
        }
    }

    public Course(String name, int number) {
        if (name == null || name.equals("") || Integer.toString(number).equals("")) {
            throw new IllegalArgumentException("Illegal argument");
        } else {
            this.name = name;
            this.number = number;
            this.roster = new HashMap<>();
        }
    }

    public String toString(){
        return this.name + " " + this.number + "\n current class roster: " + roster.toString();
    }

    public boolean equals(Object toBeCompared){
        if(toBeCompared == this) {return false;}

        if(toBeCompared == null) {return false;}

        if(toBeCompared.getClass() != getClass()) {return false;}

        Course theCourse = (Course) toBeCompared;
        return theCourse.getName().equals(getName()) && theCourse.getNumber() == getNumber();
    }

    public void setName(String name){
        if(name != null || name.equals("")){
            this.name = name;
        }else{
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
    }

    public void setNumber(int number){
        if(!Integer.toString(number).equals("")){
            this.number = number;
        }else{
            throw new IllegalArgumentException("Number must have a value");
        }
    }

    public void setRoster(HashMap<Student, Double> roster){
        if(roster != null || !roster.isEmpty()){
            this.roster = roster;
        }else{
            throw new IllegalArgumentException("Roster cannot be null or empty");
        }
    }

    public void addToRoster(Student student, double curGrade){
        if(student == null){
            throw new IllegalArgumentException("Must provide a valid Student object");
        }

        if(Double.toString(curGrade).equals("")){
            double curGradeCorrection = 0.0;
            this.roster.put(student, curGradeCorrection);
        }else{
            this.roster.put(student, curGrade);
        }
    }

    public String getName(){
        return this.name;
    }

    public int getNumber(){
        return this.number;
    }

    public HashMap<Student, Double> getRoster() { return this.roster;}
}
