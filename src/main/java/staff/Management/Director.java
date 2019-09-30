package staff.Management;

public class Director extends Manager{

    private Double budget;

    public Director(String name, String natInsurance, Double salary, String deptName, Double budget){
        super(name, natInsurance, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }
}
