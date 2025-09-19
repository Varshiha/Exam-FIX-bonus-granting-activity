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
    private String setFullname(String fullname)
    {
        this.fullname = fullname;
    }
    //Question 11 (the getter method)
    private String getFullname()
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
        }
        else{
            System.out.println("You have to wait " + 16 - (currentYear - yearOfBirth) + " to drive");
        }
        return age;
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
    //Question 13
    public void paySalary(){
        System.out.println("John Deere has received a wire transfer of " + calculatePay + " CAD");
        unpaidHours = 0.0;// to be completed
    }
}