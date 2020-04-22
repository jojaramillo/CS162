/**
 * Employee.java - Employee Benefits Management
 * @author Kimberly Bryant
 * @version 1
 */
public class Employee {
    private String name;
    protected double baseSalary;
    private int yearsOfExperience;
    private int yearsAtCompany;
    protected int weeksOfVacation;

    /**
     * Parameterless constructor
     */

    public Employee() {

    }
    /**
     * Parameterless constructor
        *@param name A variable of type TODO
        *@param baseSalary A variable of type TODO
          *@param yearsOfExperience A variable of type TODO
          *@param yearsAtCompany A variable of type TODO
        */

    public Employee(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany){
        this.name=name;
        this.baseSalary=baseSalary;
        this.yearsOfExperience=yearsOfExperience;
        this.yearsAtCompany=yearsAtCompany;
    }

//
    //TODO Add needed getters and setters
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setBaseSalary(double baseSalary ){
        this.baseSalary=baseSalary;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience=yearsOfExperience;
    }
    public int getYearsOfExperience(){
        return yearsOfExperience;
    }
    public void setYearsAtCompany(){
        this.yearsAtCompany=yearsAtCompany;
    }
    public int getYearsAtCompany() {
        return yearsAtCompany;
    }
    public void setWeeksOfVacation( int weeksOfVacation){
        this.weeksOfVacation=weeksOfVacation;
    }
    public int getWeeksOfVacation(){
        return weeksOfVacation;
    }
    /**
     * Returns a generic employee motto
     * @return A value of data type String
     */
    public String motto(){
        return "We value our employees";
    }

    /**
     * Returns the employees name, salary and motto
     * @return A value of data type String
     */
    public String toString(){
        return "Name: "+ name + " Base Salary: "+ String.valueOf(baseSalary) +"Years of Experience: "+ yearsOfExperience+ "Years at this Company: "+ yearsAtCompany+ motto();

    }

}