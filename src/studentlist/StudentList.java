package studentlist;

import java.util.Scanner;

/**
 * This class +++ Insert class description here +++
 *
 * @author MaryamKhatib
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student[] sList = new Student[3]; //creating an array of object

        Scanner input = new Scanner(System.in);
                
        for (int i = 0; i <= sList.length - 1; i++) {

            sList[i]= new Student();
            System.out.println("Enter student name: ");
            sList[i].setStud_Name(input.nextLine());
            System.out.println("Enter student address: ");
            sList[i].setStud_Address(input.nextLine());
            
        }
        
        for (int i = 0; i <= sList.length - 1; i++) {
                 
       System.out.println("Student Name: " + sList[i].getStud_Name());
            System.out.println("Student Address: " + sList[i].getStud_Address());
        }
        
        
    }

}
