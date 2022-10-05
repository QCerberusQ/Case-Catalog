

public class Employee {
	@SuppressWarnings("unused")
	private String name;
    public double salary;
    private int workHours,hireYear;

    Employee(int hireYear,int workHours,double salary,String name){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if(this.salary >= 1000) {
            return salary * 0.03;
        }
        return 0.0;
    }

    public double bonus() {
    	int extraHours = workHours - 40;
    	if(extraHours > 0){		
    		return 30 * extraHours;
        }
    	return 0.0;
    }

    public double raisesalary() {
        int year  = 2021 - this.hireYear;
        if(year < 10) {
            return salary * 0.05;
        } else if(year >= 10 && year <20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }
    
    public void toString(Employee emp) {
    	System.out.println("Tax: " + emp.tax());
        System.out.println("Bonus: " + emp.bonus());
        System.out.println("raisesalary: " + emp.raisesalary());
        double totalSalary = emp.salary - emp.tax()+ emp.bonus();
        System.out.println("Total Salary with tax and bonus: " + totalSalary);
        System.out.println("Total Salary with the raise of salary: " + (emp.salary+emp.raisesalary()));
    }
}