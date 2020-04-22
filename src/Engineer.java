public class Engineer extends Employee {
    private int Bonus;

    public Engineer(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany) {
        super(name, baseSalary, yearsOfExperience, yearsAtCompany);

    }
   @Override
   public void setBaseSalary(double baseSalary){
       this.baseSalary= super.getBaseSalary() *1.5;

    }

    public void setWeeksOfVacation() {
        if (super.getYearsAtCompany() <= 1) {
            this.weeksOfVacation = 2;
        } else if (super.getYearsAtCompany() >= 2) {
            this.weeksOfVacation = 3;
        }
    }
     public int getWeeksOfVacation(){
        return weeksOfVacation;
     }


    public int setBonus() {
        if (super.getYearsOfExperience() < 5) {
            this.Bonus = 5000;
        } else if (super.getYearsOfExperience() >= 5) {
            this.Bonus = 10000;
        }return Bonus;
    }

    public String motto(){
        return "To the optimist, the glass is half full. to the pessimist, the glass is half empty. to the engineer the glass twice as big as it needs to be.";
   }

    @Override
    public String toString() {
        return super.toString() + "Bonus is: " + setBonus();
    }
}
