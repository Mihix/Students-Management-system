package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    //Ask How many users we want to Add

    public static void main(String[] args){


        //Ask How many students to add
        System.out.println("Enter number of new students to enroll : ");
        Scanner in =new Scanner(System.in);
        int numofStudents = in.nextInt();
        Student[] students = new Student[numofStudents];


        for (int n = 0; n< numofStudents; n++){
            //Create and Number of students
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();

            System.out.println(students[n].toString());
        }
        for (int n = 0; n< numofStudents; n++){

            System.out.println(students[n].toString());
        }


    }

}
