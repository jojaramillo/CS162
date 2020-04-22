public class Main {

    public static void main(String[] args) {
        double baseSal = 36000.0D;
        Employee emp = new Employee("Maren", 36000.0D, 0, 0);
        System.out.println(emp);
        TechnicalWriter tW = new TechnicalWriter("Emily", 36000.0D, 1, 0);
        System.out.println(tW);
        Engineer eng = new Engineer("Reagan", 36000.0D, 6, 1);
        System.out.println(eng);
        ProjectManager pM = new ProjectManager("Ariana", 36000.0D, 7, 7);
        System.out.println(pM);
    }
}
