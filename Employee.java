/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;// Question 11 (the field I chose)
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;
    
    

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
        
    }
    // Question 11 (the setter method)
    public void setFullname(String fullname)
    {
        this.fullname = fullname;
        
    }
    //Question 11 (the getter method)
    public String getFullname()
    {
     return fullname;
    }
    
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    //Question 12 
    public boolean canDrive(){
        int age = calculateAge(2025);
        
        if(age >= 16)
        {
            
            System.out.println("You can drive");
            return true; //I added this
        }
        else{
            
            System.out.println("You have to wait " + (16 - age) + " to drive");
            return false;// I added this and fixed the code to (16- age)
        }
        
    }
        // to be completed
    

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    // Question 13
    private double calculatePay(double unpaidHours, double hourlyWage){
        return(hourlyWage * unpaidHours - (hourlyWage * unpaidHours * 30/100));
        
        // to be completed
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    //Question 14
    public void paySalary(){ // I added fullname instead of John Deere so that it changes if the name changes or else it would always be John Deere
        System.out.println(fullname + " has received a wire transfer of " + calculatePay  + " CAD");
        unpaidHours = 0.0;// to be completed
    }
}