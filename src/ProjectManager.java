public class ProjectManager extends Employee {
    private int shares;


    public ProjectManager(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany) {
        super(name, baseSalary, yearsOfExperience, yearsAtCompany);

    }
    public void setShares(int shares ){
            this.shares= super.getYearsAtCompany() *100;
        }


   @Override
   public void setBaseSalary(double baseSalary){
        this.baseSalary= super.getBaseSalary() *2;
      }

    public void setWeeksOfVacation() {
        if (super.getYearsAtCompany() <= 1) {
            this.weeksOfVacation = 3;
        } else if (super.getYearsAtCompany() >= 2) {
            this.weeksOfVacation = 4;
        }
    }
    public int getWeeksOfVacation(){
        return weeksOfVacation;
    }
}
