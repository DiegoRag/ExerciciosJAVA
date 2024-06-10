package entities;

public class Funcionario {
	String name;
	double GrossSalary;
	double tax;
	
	
	
	
	public double NetSalary() {
		
		double SalaryAfterTax = this.GrossSalary - this.tax;
		return SalaryAfterTax;
	}
	
	public double increaseSalary(double percentage) {
		double increasedSalary = NetSalary() + (this.GrossSalary * (percentage  / 100));
		return increasedSalary;
	
  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return GrossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		GrossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
 }

