import IntroduçaoClasse.Rectangle;

import java.util.Scanner;
void main() {
    Scanner ler = new Scanner ( System . in );

    Rectangle r = new Rectangle();
    System.out.print (" Largura : ");
    r.setWidth( ler.nextDouble());

    System.out.print (" Altura : ");
    r.setHeight(ler.nextDouble());

    System.out.println (" AREA = " + r.area());
    System.out.println (" PERIMETRO = " + r.perimeter());
    System.out.println (" DIAGONAL = " + r.diagonal());

    ler.close ();
}