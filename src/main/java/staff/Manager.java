package staff;

public class Manager extends Employee{

    private String deptName;

    public Manager(String name, String natInsurance, Double salary, String deptName){
        super(name, natInsurance, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
