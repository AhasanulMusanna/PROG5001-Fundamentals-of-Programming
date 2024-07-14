/**
 * Assessment1
 *
 * Ahasanul
 * V4
 */

import java.util.Scanner ;
import java.lang.Math ;

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
        
        //Computing the Lowest Mark
        float LowestMark = marks[0];
        for(int i=1; i< NumberOfStudents; i++) {
            if (marks[i] < LowestMark) {
                LowestMark = marks[i];
            }
        }
        
        System.out.println("The Lowest Mark for " + AssignmentName + " is: " + LowestMark);
        
        //Computing the Mean
        float total = 0;
        
        for(int i=0; i< NumberOfStudents; i++) {
            total = total + marks[i];
        }
        
        float Mean = total / NumberOfStudents;
        
        System.out.println("The Average or Mean Mark for " + AssignmentName + " is: " + Mean);
        
        //Computing the Standard Deviation
        float SummedDifferences = 0;
        for(int i=0; i< NumberOfStudents; i++) {
            SummedDifferences = SummedDifferences + (marks[i] - Mean)*(marks[i] - Mean);
        }
        
        float Variance = SummedDifferences / NumberOfStudents;
        
        
        double exp = 0.5;
        
        double StandardDeviation = Math.pow(Variance, exp);
        
        
        System.out.println("The Standard Deviation for " + AssignmentName + " is: " + StandardDeviation);
        
    }
}
