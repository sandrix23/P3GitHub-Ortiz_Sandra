
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class NuevaFuncionalidad {
 static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int opcion = 0;  
     while (opcion !=4){
        System.out.println("¿Que quieres hacer?");
        System.out.println(" 1.Calcular la hipotenusa de un triangulo\n 2.Calcular el área de un cilindro\n 3.Calcular el volumen de un cilindro\n 4.Salir");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                hipotenusa();
                break;
                
            case 2:
                area();
                break;
                
            case 3:
                volumen();
                break;
                
            case 4:
                
        }
     }
    }

    public static void hipotenusa() {
        System.out.println("Introduce un cateto");
        int cateto1 = entrada.nextInt();
        System.out.println("Introduce el otro ");
        int cateto2 = entrada.nextInt();
        double resultadohipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        System.out.println("La hipotenusa es: " + resultadohipotenusa);
    }

    public static void area() {
        System.out.println("Escribe el radio");
        int r = entrada.nextInt();
        System.out.println("Escribe la altura");
        int h = entrada.nextInt();
        double resultadoarea = (2 * Math.PI * r * (r + h));
        System.out.println("El area es: " + resultadoarea);
    }

    public static void volumen() {
        System.out.println("Escribe el radio");
        int r = entrada.nextInt();
        System.out.println("Escribe la altura");
        int h = entrada.nextInt();
        double resultadovolumen = (Math.PI * Math.pow(r, 2) * h);
        System.out.println("El volumen es: " + resultadovolumen);
    }

}

