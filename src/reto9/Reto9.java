
package reto9;

import java.util.Scanner;

public class Reto9 {

    public static void main(String[] args) {
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q",
        "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String nomMascota, alimento;
        int vidaInic, contador = 0;
        boolean comprobador = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bienvenido, ingresa el nuevo nombre de tu mascota virtual: ");
        nomMascota = sc.next();
        System.out.print("Ingresa el nivel de vida inicial de tu mascota: ");
        vidaInic = sc.nextInt();
        System.out.print("Ahora puedes darle de comer: ");
        alimento = sc.next();
        
        for(int i = 0; i<alimento.length(); i++){
            for (int j = 0; j < letras.length; j++) {
                if (String.valueOf(alimento.charAt(i)).equalsIgnoreCase(letras[j])) {
                    vidaInic ++;
                    contador ++;
                    break;
                }else if(j==(letras.length-1)){
                    vidaInic --;
                    contador --;
                    comprobador = true;
                }
            }
        }
        if (comprobador) {
            System.out.println("¡Eso no es comida!");
        }else{
            System.out.println("Gracias por darme de comer.");
        }
        
        if (contador==0) {
            System.out.println("Eres bueno, pero puedes mejorar");
        }else if(contador<0){
            System.out.println("¡Oye cuídame!");
        }else if(contador>0){
            System.out.println("Gracias por cuidarme");
        }
        
        System.out.println("Mi vida restante es de "+vidaInic);
    }
    
}