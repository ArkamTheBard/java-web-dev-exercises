package exercises;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        HashMap<Integer, String> students = new HashMap<>();
        String newStudentID;

        System.out.println("Enter your students (or ENTER to finish):");
        do{
            System.out.print("Enter student's ID: ");
            newStudentID = input.nextLine();

            if(!newStudentID.equals("")){
                System.out.print("Name: ");
                String studentName = input.nextLine();
                int studentID = Integer.parseInt(newStudentID);
                students.put(studentID, studentName);

                input.nextLine();
            }

        }while(!newStudentID.equals(""));

        System.out.println("\nClass roster:");

        for(Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}
