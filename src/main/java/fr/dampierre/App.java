package fr.dampierre;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("entrez le premiers nom commun");
        String NOM1 = clavier.next();
        System.out.println("entrer le nombre : ");
        int NOMBRE = clavier.nextInt();
        System.out.println("entrez le deuxieme nom commun");
        String NOM2 = "test2";
        String ADJECTIF = "teste2";
        System.out.println(
                "il etait une fois" + NOM1 + " " + "qui avait" + " " + NOMBRE + " " + NOM2 + " " + "cela la reduit trés"
                        + ADJECTIF + ".");
    }

}
