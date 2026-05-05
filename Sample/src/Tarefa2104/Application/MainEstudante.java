package Tarefa2104.Application;

import Tarefa2104.entities.Estudante;
import java.util.Scanner;

public class MainEstudante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante s = new Estudante();

        s.name = sc.nextLine();
        for (int i = 0; i < 3; i++) {
            s.points[i] = sc.nextDouble();
        }

        System.out.printf("\nFINAL GRADE = %.2f\n", s.finalGrade());
        if (s.result()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS\n", s.missingPoints());
        }
        sc.close();
    }
}
