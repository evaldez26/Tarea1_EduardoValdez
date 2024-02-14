/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1_eduardovaldez;

import java.util.Scanner;

/**
 *
 * @author guali
 */
public class Tarea1_EduardoValdez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.print("**********Menu**********\n1. ¿Cuántos números pares e impares hay entre este rango?\n2. Triángulos y más Triángulos\n3. Anita lava la tina\n4. Codigos secretos\n5. Salir\nElija una Opcion: ");
            int opcion = leer.nextInt();
            System.out.println();
            switch (opcion) {
                case 1:
                    System.out.println("*****¿Cuántos números pares e impares hay entre este rango?*****\nIngrese un numero: ");
                    int numero = leer.nextInt();
                    int cont1 = 0;
                    int cont2 = 0;
                    String Cadena1 = "";
                    String Cadena2 = "";
                    for (int i = 0; i < numero + 1; i++) {
                        if (i % 2 == 0) {
                            if (i == numero || i == (numero - 1)) {
                                Cadena1 += i;
                            } else {
                                Cadena1 += i + ",";
                            }
                            cont1 = cont1 + 1;

                        } else if (i % 2 != 0) {
                            if (i == numero || i == (numero - 1)) {
                                Cadena2 += i;
                            } else {
                                Cadena2 += i + ",";
                            }
                            cont2 = cont2 + 1;
                        }
                    }
                    System.out.println("Entre 0 y " + numero + " existen " + cont1 + " numeros pares y estos son: " + Cadena1);
                    System.out.println("Entre 0 y " + numero + " existen " + cont2 + " numeros impares y estos son: " + Cadena2);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("*****Triángulos y más Triángulos*****\n1. Triangulo Equilatero\n2. Triangulo Recto\nElija una opcion: ");
                    int opcion2 = leer.nextInt();
                    switch (opcion2) {
                        case 1:
                            System.out.println("*****Triángulo Equilatero*****\nEscruba la altura que desea para el triangulo:");
                            int altura = leer.nextInt();
                            for (int i = 0; i < altura; i++) {
                                for (int j = altura - i - 1; j > 0; j--) {
                                    System.out.print(" ");
                                }

                                for (int k = 0; k <= i * 2; k++) {
                                    System.out.print("*");
                                }

                                System.out.println();
                            }
                            System.out.println();

                            break;
                        case 2:
                            System.out.println("*****Triángulo Recto*****\nEscruba la altura que desea para el triangulo: ");
                            int altura2 = leer.nextInt();
                            int num = 0;
                            for (int i = 0; i < altura2; i++) {
                                num = num + 1;
                                for (int j = 0; j < num; j++) {
                                    System.out.print("*");

                                }
                                System.out.println();
                            }
                            System.out.println("");
                            break;
                        default:
                            break;
                    }

                    break;
                case 3:
                    System.out.println("*****Anita lava la tina*****");
                    System.out.print("Ingrese una palabra/oracion: ");
                    leer.nextLine();
                    String cad1 = leer.nextLine();
                    String cad2 = "";
                   
                        for (int i = cad1.length()-1; i > -1; i--){
                           char caracter = cad1.charAt(i);
                            cad2 += caracter;           
                    }
                        if (cad2.equalsIgnoreCase(cad1)){
                            System.out.println("Es una palabra/oracion palindroma");
                        }else{
                            System.out.println("No es una palabra palindroma");
                        }
                        System.out.println();
                    break;
                case 4:
                    System.out.println("*****Codigos secretos*****");
                    System.out.println("Escriba un codigo[numero, letra, numero, letra][ejemplo:a2p1m3]: ");
                    String cadena = leer.next();
                    char c;
                    int num;
                    for (int i = 0; i < cadena.length();i++){
                        if(i%2!=0){
                            num = cadena.charAt(i)-48;
                            for(int j = 0; j <num;j++){
                                c = cadena.charAt(i-1);
                                System.out.print(c);
                            }
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Salio del programa");
                    resp = 'n';
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }

    }

}
