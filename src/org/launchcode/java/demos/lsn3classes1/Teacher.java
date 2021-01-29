package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String lastName;
    private String firstName;
//    private String subject;
    private int yearsTeaching;

    public Teacher(String lastName, String firstName, int yearsTeaching){
        setLastName(lastName);
        setFirstName(firstName);
        this.yearsTeaching = yearsTeaching;
    }

    public Teacher(String lastName, String firstName){ //in the case of a new teacher
        setLastName(lastName);
        setFirstName(firstName);
        this.yearsTeaching = 0;
    }

    public void setLastName(String lastName) {
        if(lastName != null || !lastName.isEmpty()){
            this.lastName = lastName;
        }else
            throw new IllegalArgumentException("Illegal name");
    }

    public void setFirstName(String firstName) {
        if(firstName != null || !firstName.isEmpty()){
            this.firstName = firstName;
        }else
            throw new IllegalArgumentException("Illegal name");
    }

//    public void setSubject(String subject) {
//        if(subject != null || !subject.isEmpty()){
//            this.subject = subject;
//        }else
//            throw new IllegalArgumentException("Illegal subject");
//    }

    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
//
//    public String getSubject() {
//        return subject;
//    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }
}
