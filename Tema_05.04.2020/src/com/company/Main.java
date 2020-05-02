package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int a = 23;
        int b = 30;
        int c = 35;
        String info = (" Java is a general purpose...");
        String info2 = ("The syntax of Java is similar...");
	// Aici fac adunarea.

        int suma = suma(a,b,c);
        System.out.println("Rezultatul este " + suma);

        //Scaderea
        int scadere = scadere(a,b,c);
        System.out.println("Rezultatul este " + scadere);

        //Inmultirea
        int inmultire = inmultire(a,b,c);
        System.out.println("Rezultatul este " + inmultire);

        //Diviziunea
        System.out.println("Aici vom afisa diviziunea");
        int diviziune = a/b/c;
        System.out.println("Rezultatul este " + diviziune);

        //Incrementarea
        incrementare(a,b,c);
        System.out.println("Noile valori sunt "+ a + " " + b + " " + c);

        //Decrementarea
        System.out.println("Aici vom afisa decrementarea");
        a--;
        b--;
        c--;
        System.out.println("Noile valori sunt "+ a + " " + b + " " + c);

        //Incrementarea din 2 in 2
        System.out.println("Aici vom afisa incrementarea din 2 in 2");
        a+=2;
        b+=2;
        c+=2;
        System.out.println("Rezultatul este " + a + " " + b + " " + c);

        //Decrementarea din 3 in 3
        System.out.println("Aici vom afisa decrementarea din 3 in 3");
        a-=3;
        b-=3;
        c-=3;
        System.out.println("Rezultatul este " + a + " " + b + " " + c);

        //Teorema lui Pitagora
        System.out.println("Aici calculam teorema ");
        int pitagora = a*a + b*b;
        System.out.println("Rezultatul este " + pitagora);

        //Suma lungimii a 2 Stringuri
        int length = length(info);
        int length2 = length(info2);
        System.out.println("Lungimea este " + length + " " + length2);
        int suma2 = suma2(length, length2);
        System.out.println("Suma este " + suma2);

        //Pozitia unui anumit caracter
        char caracterCautat = 'c';
        char caracterCautat2 = 'm';
        int pozitie = pozitie(caracterCautat,info);
        int pozitie2 = pozitie(caracterCautat2, info2);
        System.out.println("Pozitia este " + pozitie);
        System.out.println("Pozitia este " + pozitie2);

        // Caracterul de la o anumita pozitie
        System.out.println("Aici vom afisa caracterul de la pozitia -1");
        char caracterGasit = caracterPozitie(20, info);
        char caracterGasit2 = caracterPozitie(a 15, info2);
        System.out.println("Caracterul gasit este " + caracterGasit + " " + caracterGasit2);

    }
    public static int suma(int a, int b, int c  ){
        System.out.println("Aici vom afisa suma ");
        int suma = a+b+c;
        return suma;
    }
    public static int scadere(int a, int b, int c  ) {
        System.out.println("Aici vom afisa scaderea ");
        int scadere = a - b - c;
        return scadere;
    }
        public static int inmultire(int a, int b, int c  ) {
            System.out.println("Aici vom afisa inmultirea ");
            int inmultire = a * b * c;
            return inmultire;
        }
    public static void incrementare(int a, int b, int c  ) {
        System.out.println("Aici vom afisa noile valori ");
        a++;
        b++;
        c++;
    }
    static int length (String info) {
        System.out.println("Lungimea ");
        int length = info.length();
        return length;
    }
    static int suma2(int a, int b) {
        System.out.println("Suma lungimii a doua stringuri");
        int suma2= a+b;
        return suma2;
    }
    static int pozitie(char caracter, String info){
        int pozitie= info.indexOf(caracter);
        return pozitie;
    }
    static char caracterPozitie(int a, String info){
        char caracterPozitie = info.charAt(a);
        return caracterPozitie;
    }
}
