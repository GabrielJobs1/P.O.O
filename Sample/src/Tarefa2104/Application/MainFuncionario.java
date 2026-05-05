package Tarefa2104.Application;

import Tarefa2104.entities.Funcionario;

import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario emp = new Funcionario();

        System.out.print("Name: ");
        emp.name = sc.nextLine();

        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.printf("\nEmployee: %s, $ %.2f\n", emp.name, emp.netSalary());

        System.out.print("Which percentage to increase salary? ");
        emp.increaseSalary(sc.nextDouble());

        System.out.printf("\nUpdated data: %s, $ %.2f\n", emp.name, emp.netSalary());
        sc.close();
    }
}
