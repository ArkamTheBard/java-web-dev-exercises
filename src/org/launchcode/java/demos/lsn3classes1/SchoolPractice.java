package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student myself = new Student("Yardley", 123456, 1, 4.0);
        Student yaBoi = new Student("Ya boi", 654321, 2, 1.2);

//        System.out.println(myself.getGradeLevel());
//        myself.addGrade(2, 1.0);
//        System.out.println(myself.getGpa());
//
//        System.out.println(myself.equals(yaBoi));

        Course algebra = new Course("algebra", 101);

        algebra.addToRoster(myself, 2.5);
        algebra.addToRoster(yaBoi, 4.0);

        System.out.println(algebra.toString());
    }
}
