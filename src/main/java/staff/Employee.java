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

    public void setName(String name) {
        if(name != null && name != "") {
            this.name = name;
        }
    }

    public String getNatInsurance() {
        return natInsurance;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(Double raise) {
        if (raise >= 0) {
           this.salary += raise;
        }
    }

//    public Double getRaiseSalary(){
//        return raiseSalary();
//    }

    public double payBonus() {
        return this.salary * 0.01;
    }
}
