
/**
 * Assessment1
 *
 * Ahasanul
 * V1
 */

import java.util.Scanner ;

public class Assessment1
{
    public static void main(String[] args) {
        int NumberOfStudents = 30;
        float[] marks = new float[NumberOfStudents];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input Marks of the Students: ");
        
        for(int i=0; i< NumberOfStudents; i++) {
            float temp = scanner.nextFloat();
            
            if (temp < 0 || temp > 30) {
                System.out.println("Invalid Mark! Please Enter the Mark Again");
            }
            
            marks[i] = temp;
        }
        
        System.out.println("Marks of the Students");
        for(int j=0; j<NumberOfStudents; j++){
            System.out.println(marks[j]);
        }
    }
}
