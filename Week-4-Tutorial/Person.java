/**
 * Write a description of class Person here.
 *
 * @author (Vinh Bui)
 * @version (22/02/2022)
 */
public class Person {
    //person properties declared as private    
    private String name;
    private int age;
    private double weight;
    private double height;

    /**
     * Constructor for objects of class Person
     */
    public Person(String name, int age, double weight, double height){
        // initialise person properties
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    /**
     * methods to access the properties
     */
    public int getAge() {
        return age;
    }
    
    public String getName() {
        return name;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public double getHeight() {
        return height;
    }
    
    /**
     * methods to manipulate the properties
     */
    public boolean setAge(int age) {
        //perform input validation
        if ((age > 0) && (age < 150)) {
            this.age = age;
        } else {
            return false;
        }
        return true;        
    }
    
    public boolean setName(String name) {
        //perform input validation
        if ((name.length() > 3) && (name.length() < 10)) {
            this.name = name;
        } else {
            return false;
        }
        return true;
    }
    
    public boolean setWeight(double weight) {
        //perform input validation
        if (weight > 0) {
            this.weight = weight;
        } else {
            return false;
        }
        return true;        
    }
    
    public boolean setHeight(double height) {
        //perform input validation
        if (height > 0) {
            this.height = height;
        } else {
            return false;
        }
        return true;        
    }

    /**
     * method to compute the person BMI from data
     */
    public double getBMI() {
        return weight / (height * height);  //BMI formula
    }        
    
    /**
     * method to export the person data as a string
     */
    public String toString() {
        double bmi = getBMI();
        return String.format(
            "person [name: %s, age:%d, weight:%.2f, height: %.2f, bmi: %.2f]",
            name, age, weight, height, bmi);  
    }   
    
    /**
     * the main method
     */
    public static void main (String[] args) {
        // Person person1 = new Person("Atie", 30, 50, 1.6);
        // Person person2 = new Person("Vinh", 45, 70, 1.7);
        // Person person3 = new Person("John", 20, 80, 1.8);
        // Person person4 = new Person("Mark", 40, 70, 1.75);
        // Person person5 = new Person("Zane", 50, 80, 1.7);
        
        // //print the person data on screen
        // System.out.println(person1.toString());
        // System.out.println(person2.toString());
        // System.out.println(person3.toString());
        // System.out.println(person4.toString());
        // System.out.println(person5.toString());

        //you can use an array of Persons
        Person[] personList = new Person[5];
        personList[0] = new Person("Atie", 30, 50, 1.6);
        personList[1] = new Person("Vinh", 45, 70, 1.7);
        personList[2] = new Person("John", 20, 80, 1.8);
        personList[3] = new Person("Mark", 40, 70, 1.75);
        personList[4] = new Person("Zane", 50, 80, 1.7);
        
        
        for (Person person: personList) {
            System.out.println(person.toString());            
        }
    }
}
