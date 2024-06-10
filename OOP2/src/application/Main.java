package application;

import java.util.Scanner;
import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Funcionario Funcionario = new Funcionario();

		System.out.println("Name : ");
		Funcionario.setName(input.nextLine());
		System.out.println("GrossSalary: ");
		Funcionario.setGrossSalary(input.nextDouble());
		System.out.println("Tax: ");
		Funcionario.setTax(input.nextDouble());
		System.out.println("Employee: " + Funcionario.getName() + ", $" + Funcionario.NetSalary());
		System.out.println("What is the salary increase percentage?");
		double percentage = input.nextDouble();

		System.out.println("Employee: " + Funcionario.getName() + ", $" + Funcionario.increaseSalary(percentage));
		Funcionario.increaseSalary(percentage);

		input.close();
	}

}
