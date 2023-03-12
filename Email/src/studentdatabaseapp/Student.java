package studentdatabaseapp;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {
    //Constructor :prompt user to enter student's name and year
    //Generate an ID
    //Enroll in courses
    //View balance
    //pay the tution
    //show status
    private String firstName;
    private String lastName;
    private int  gradeYear;
    private String StudnetID;
    private String courses = null;
    private int tutionBalance = 0;
    private static  int costOfCourse = 600;
    private  static  int id = 1000;

    //Constructor :prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student fistName");
        this.firstName = in.nextLine();

        System.out.println("Enter Student lastName");
        this.lastName = in.nextLine();

        System.out.println(" 1 - Freshmen\n2 - for Sophmore\n3- Junior\n4 - for senior\n  Enter student class level");
        this.gradeYear = in.nextInt();

        setStudnetID();



    }
     private  void setStudnetID(){
         id++;
        this.StudnetID = gradeYear + " " + id;
       }
       public void enroll(){

        //Get Inside a loop,user hits
           do {


               Scanner in = new Scanner(System.in);
               System.out.print("Enter course  to entroll (Q to quit) :");
               String course = in.nextLine();
               if (!course.equals("Q")) {
                   courses = courses + " \n  " + course;
                   tutionBalance = tutionBalance + costOfCourse;

               }
               else { break; }
           }while (1 != 0);







       }
        public void viewBalance(){
            System.out.println("Your balance is : $" + tutionBalance);

        }
        public void payTuition(){
            viewBalance();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your payment" );
        int payment = in.nextInt();

        tutionBalance = tutionBalance - payment;
        System.out.println("Thank you for your payment of $ " + payment);
            viewBalance();

       }
       public String toString(){
        return "Name : " + firstName +  " " + lastName +
                "\n Grade level: " + gradeYear +
                "\n StudentID: " + StudnetID +
                "\nCourses Entrolled: " + courses +
                "\nBalance : $ " +tutionBalance;
       }
}
