import java.util.*;
public class ejecucion {
    public static void main(String[] args) {
        int opcion;
        Scanner leer = new Scanner(System.in);
        rombo rom = new rombo();
        heptagono hep = new heptagono();
        trapecio tra = new trapecio();
        System.out.println("ingresa la figura que deseas consultar su area y permimetro: \n1. heptagono \n2. rombo \n3. trapecio ");
        opcion = leer.nextInt();
        switch(opcion)
        {
  
           case 1:
           System.out.println("ingresa el tamaño del lado: ");
           hep.setLado(leer.nextDouble());
           System.out.println("ingresa la longitud: ");
           hep.setLongitudLado(leer.nextDouble());
           hep.calcularArea();
           hep.calcularPerimetro();
           break;
           case 2:
           System.out.println("ingresa la diagonal mayor: ");
           rom.setDiagonalMayor(leer.nextDouble());
           System.out.println("ingresa la diagonal menor: ");
           rom.setDiagonalMenor(leer.nextDouble());
           System.out.println("ingresa la longitud: ");
           rom.setLongitud(leer.nextDouble());
  
           rom.calcularArea();
           rom.calcularPerimetro();
          break;
          case 3:
           System.out.println("ingresa la base: ");
           tra.setBase(leer.nextDouble());
           System.out.println("ingres la altura: ");
           tra.setAltura(leer.nextDouble());
           System.out.println("ingresa el primer lado: ");
           tra.setlA(leer.nextDouble());
           System.out.println("ingresa el segundo lado: ");
           tra.setlB(leer.nextDouble());
           System.out.println("ingresa el tercer lado: ");
           tra.setlC(leer.nextDouble());
           System.out.println("ingresa el cuarto lado: ");
           tra.setlD(leer.nextDouble());
  
           tra.calcularArea();
           tra.calcularPerimetro();
           break;
        }
    }
}
