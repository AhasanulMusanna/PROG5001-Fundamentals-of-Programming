/**
 * Assessment1
 *
 * Ahasanul
 * V4
 */

import java.util.Scanner ;

public class Assessment1
{
    public static void main(String[] args) {
        int NumberOfStudents = 30;
        float[] marks = new float[NumberOfStudents];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the Assignment Name: ");
        String AssignmentName = scanner.nextLine();
        
        System.out.println("Input Marks of the Students: ");
        
        for(int i=0; i< NumberOfStudents; i++) {
            float temp = scanner.nextFloat();
            
            while (temp < 0 || temp > 30) {
                System.out.println("Invalid Mark! Please Enter the Mark Again");
                temp = scanner.nextFloat();
            }
            
            marks[i] = temp;
        }
        
        System.out.println("Marks of the Students for " + AssignmentName + ":");
        for(int j=0; j<NumberOfStudents; j++){
            System.out.println(marks[j]);
        }
        
        //Computing the Highest Mark
        float HighestMark = marks[0];
        for(int i=1; i< NumberOfStudents; i++) {
            if (marks[i] > HighestMark) {
                HighestMark = marks[i];
            }
        }
        
        System.out.println("The Highest Mark for " + AssignmentName + " is: " + HighestMark);
        
        
    }
}
