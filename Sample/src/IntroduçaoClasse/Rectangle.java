package IntroduçaoClasse;

public class Rectangle {
private double width , height ;

        /**
         * define a largura do retângulo.
         * @param w
         */
         public void setWidth ( double w ) {
                 width = w;
         }

        /**
         * define a altura do retângulo(encapsulamento).
         * @param h
         */
        public void setHeight ( double h ) {
                height = h;
        }

        /**
         * calcula a area do rentangulo.
         * @return area
         */

        public double area () {
                return width * height;
        }

        /**
         * calcula o perímetro do retângulo.
         * @return 2*h*w = perimeter.
         */
        public double perimeter () {
                return 2 * ( height + width );
        }

        /**
         * calcula a diagonal do retangulo.
         * @return diagonal.
         */

        public double diagonal () {
                return Math . sqrt ( width * width + height * height );
        }

        /**
         * printa a String para mostrar a altura e a largura.
         * @return string.
         */
        public String toString () {
                return String . format (" Width = %.2f, Height = %.2 f", width , height );
        }
}
