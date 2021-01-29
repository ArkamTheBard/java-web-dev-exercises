package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    public String toString(){
        return this.topic + "instructor: " + this.instructor.toString() + "\n currently enrolled students: " +
                enrolledStudents.toString();
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    public boolean equals(Object toBeCompared){
        if(toBeCompared == this) {return true;}

        if(toBeCompared == null) {return false;}

        if(toBeCompared.getClass() != getClass()) {return false;}

        Course theCourse = (Course) toBeCompared;
        return theCourse.topic.equals(this.topic) && theCourse.instructor.equals(this.instructor) &&
                theCourse.enrolledStudents.equals(this.enrolledStudents);
    }

}
