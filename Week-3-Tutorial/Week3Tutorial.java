
/**
 * Write a description of class Week3Tutorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week3Tutorial
{
    // instance variables - replace the example below with your own
    public static void main (String[] args) {
    String myString1 = "This is my first string";
    String myString2 = new String ("This is my second string");
    String myString4 = "ahasanul ";
    String myString5 = new String ("Chasanul ");
    String myString6 = "This is my first string";
    String myString7 = new String ("This is my first string");

    
    Boolean contains = myString6 == myString7;
    
    //System.out.println("compare string 6 with 7: " + compare);
    
    String[] myToken1 = myString1.split(" ");
    int len = myToken1.length;
    
    System.out.println("Length: " + len);
    


    
    String myString3 = myString5;
    //int len = myString3.length();
    
    //System.out.println(myString3);
    //System.out.println("Length: " + len);
    
    int res = myString4.compareTo(myString5);
    
    //System.out.println(res);
    }
}
