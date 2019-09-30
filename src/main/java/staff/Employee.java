package staff;

public abstract class Employee {

    private String name;
    private String natInsurance;
    private Double salary;

    public Employee(String name, String natInsurance, Double salary){
        this.name = name;
        this.natInsurance = natInsurance;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNatInsurance() {
        return natInsurance;
    }

    public Double getSalary() {
        return salary;
    }

    public Double raiseSalary(Double raise) {
        return this.salary + raise;
    }

    public double payBonus(double bonus) {
        return this.salary * bonus;
    }
}
