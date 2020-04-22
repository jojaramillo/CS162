public class TechnicalWriter extends Employee{

    public TechnicalWriter(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany){
        super(name, baseSalary,yearsOfExperience, yearsAtCompany);
    }

    public void setWeeksOfVacation(){
        if (super.getYearsAtCompany ()<= 1){
            this.weeksOfVacation = 1;
        }else if(super.getYearsAtCompany() >= 2){
            this.weeksOfVacation = 2;
        }
    }

    /**
     * Returns a generic employee motto
     * @return A value of data type String
     */
    @Override
    public String motto(){
        return "You can always edit a bad page. You cant edit a blank page";
    }

    @Override
    public String toString(){
        return super.toString();

    }
}
