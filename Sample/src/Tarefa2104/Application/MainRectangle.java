package Tarefa2104.Application;

import Tarefa2104.entities.Rectangle;

import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Rectangle r = new Rectangle();

        System.out.print("Largura: ");
        r.setWidth(ler.nextDouble());

        System.out.print("Altura: ");
        r.setHeight(ler.nextDouble());

        System.out.println("AREA = " + r.area());
        System.out.println("PERIMETRO = " + r.perimeter());
        System.out.println("DIAGONAL = " + r.diagonal());

        ler.close();
    }
}
