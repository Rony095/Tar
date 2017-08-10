package tarea.pkg3;

import java.util.Scanner;

public class Palindromo {

    public static boolean Palindromo(String Palabra) {
        for (int i = 0; i < Palabra.length(); i++) {
            if (Palabra.charAt(i) != Palabra.charAt(Palabra.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public void Correr() {
        String Palabra;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Escriba La Frase A Verificar: ");
        Palabra = Teclado.next();

        if (Palindromo(Palabra) == true) {
            System.out.printf("La Frase \"%s\" Es Un Palíndromo%n", Palabra);
        } else {
            System.out.printf("La Frase \"%s\" No Es Un Palíndromo%n", Palabra);
        }
    }
}
