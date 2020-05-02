import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Main {

    public static void main(String[] args) {
        average();
        middleCharacter("The resurrection of Jesus, or anastasis is the Christian belief that God raised Jesus after his crucifixion as first of the dead, starting his exalted life as Christ and Lord.");
        String text2 = "Scholars have contended that in his presentation of the resurrection, Paul refers to an earlier authoritative tradition, transmitted in a rabbinic style, that he received and has passed on to the church at Corinth.";
        countAllWords(text2);
        String text3 = "Mary Magdalene found the tomb empty, and informed Peter.";
        printareCaractere(text3);
        parSauImpar(31);
        int[] arrayInts = {2000, 25, 20, 20, 55, 20, 35, 10, 10, 75, 20};
        identicElements(arrayInts);
        int highestResultOfArray = highestResult(arrayInts);
        System.out.println("The numbers greater than the average of the numbers of a given array are: " + highestResultOfArray);
        boolean resultWasFound = result3Times(arrayInts);
        System.out.println(resultWasFound);
        int p = 5412;
        positiveInt(p);
        int sum = positiveInt(p);
        System.out.println(sum);
        int nr = 324654745;
        boolean palindrInt = palindromInt(nr);
        System.out.println(palindrInt);
        String text4 = "recunosc ca mai mult m-am inspirat si-am copiat tema, decat s-o rezolv eu, personal; prin urmare, trebuie sa ma pun sa gandesc mult mai logic";
        boolean palindrString = palindromString(text4);
        System.out.println(palindrString);
        int nr = 200;
        primeNr(nr);
        middleWord(text3);
        multiplu5(text3);
        firstLastCharacter(text4);
        nrOfWords(text2);
        countSpaces(text4);
        replaceAllSpaces(text4);

        // Write a Java program to find the smallest number among three numbers.

        int x = 21;
        int y = 433;
        int z = 4;
        if (x < y && x < z) {
            System.out.println("Smallest number is :" + x);
        } else if (y < x && y < z) {
            System.out.println("Smallest number is :" + y);
        } else {
            System.out.println("Smallest number is :" + z);
        }
    }
    // Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

    public static void average() {
        int a;
        int b;
        double c;
        a = 88;
        b = 21;
        c = 11.5;
        System.out.println("The Average of three numbers is " + (a + b + c) / 3);
    }
    // Write a Java program to display the middle character of a string.

    public static void middleCharacter(String text1) {
        if (text1.length() - 1 % 2 == 0) {
            System.out.println("Se afiseaza caracterul din mijloc " + text1.length());
        } else {
            System.out.println();
        }
        char middleCharacter = text1.charAt(text1.length() / 2);
        System.out.println("Caracterul din mijloc este " + middleCharacter);
    }
    // Write a Java program to count all words in a string.

    public static void countAllWords(String text2) {
        int totalCuvinte = 1;
        String[] words = new String[text2.length()];
        for (int i = 0; i <= words.length - 1; i++) {
            char find = text2.charAt(i);
            if (find == ' ' || find == ',' || find == '.') {
                totalCuvinte++;
            }
        }
        System.out.println("The number of total words is: " + totalCuvinte);
    }
    // Write a Java program to print characters between two characters (i.e. A to P) from a text.

    public static void printareCaractere(String text3) {
        int charPosA = text3.indexOf('a') + 1;
        int charPosP = text3.indexOf('p');
        System.out.println("The characters between two characters A and P are: " + text3.substring(charPosA, charPosP));
    }
    // Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3 and add 1 if n is odd repeat the process until n=1.

    public static void parSauImpar(int n) {
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println("Valoarea pentru n par este: " + n);
            } else {
                n = n * 3 + 1;
                System.out.println("Valoarea pentru n impar este: " + n);
            }
        }
    }
    // Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20.

    public static void identicElements(int[] arrayInts) {
        for (int i = 0; i < arrayInts.length - 1; i++) {
            int j = i + 1;
            if (arrayInts[i] == 10 && arrayInts[j] == 10) {
                System.out.println("Afisam valorile elementului 10 pe pozitiile: " + i + "," + j);
            } else if (arrayInts[i] == 20 && arrayInts[j] == 20) {
                System.out.println("Afisam valorile elementului 20 pe pozitiile: " + i + "," + j);
            }
        }
    }
    // Write a Java program to find the numbers greater than the average of the numbers of a given array.

    public static int highestResult(int[] arrayInts) {
        int sum = 0;
        double average = sum / 2;
        for (int i = 0; i <= arrayInts.length; i++) {
            sum += arrayInts[i];
            if (arrayInts[i] > average) {
                return arrayInts[i];
            }
        }
        return highestResult(arrayInts);
    }
    // Write a Java program to check if the value 20 appears three times in an array.

    public static boolean result3Times(int[] arrayInts) {
        int resultFound = 0;
        for (int i = 0; i <= arrayInts.length - 1; i++) {
            if (arrayInts[i] == 20) {
                resultFound++;
            }
            if (resultFound == 3) {
                boolean resultFound1 = true;
                return resultFound1;
            }
        }
        return result3Times(arrayInts);
    }
    // Write a Java program to add all the digits of a given positive integer until the result has a single digit.

    public static int positiveInt(int p) {
        int sum = 0;
        while (p > 0 || sum > 9) {
            if (p == 0) {
                p = sum;
                sum = 0;
            }
            sum += p % 10;
            p /= 10;
        }
        return sum;
    }
    // Write a Java program to check if a positive number is a palindrome or not.

    private static boolean palindromInt(int nr) {
        int a = 0;
        int b = nr;
        while (nr != 0) {
            a = a * 10;
            a = a + nr % 10;
            nr = nr / 10;
            if (a == b) {
                return true;
            }
        }
        return false;
    }
    // Write a Java program to check if a string is a palindrome or not

    public static boolean palindromString(String text4) {
        int i = 0;
        int j = text4.length() - 1;
        while (i < j) {
            if (text4.charAt(i++) != text4.charAt(j--))
                return false;
        }
        return true;
    }
    // Write a Java program to compute the sum of first n given prime numbers.

    public static void primeNr(int nr) {
        int sumPrimeNr = 0;
        for (int i = 2; i <= nr; i++) {
            for (int j = 2; j <= i; j++) {
                if (j == i) ;
                sumPrimeNr = sumPrimeNr + i;
            }
            if (i % j == 0) {
                break;
            }
        }
    }
           System.out.println("Suma numerelor prime este : "+sumPrimeNr);

    // Write a Java program to find the word from the middle of a given string.

     public static void middleWord (String text3) {
         int j = 0;
         String[] arrayWords = text3.split(" ");
         for (int i = 0; i < arrayWords.length; i++) {
             j = arrayWords.length / 2;
         }
         System.out.println("Middle word is: " + arrayWords[j]);
     }
    // Write a Java program to print the characters on positions that are multiple of 5 BUT NOT multiple of 10

      public static void multiplu5 (String text3) {
         for (int i = 5; i <= text3.length(); i += 10) {
             System.out.println("Caracterul gasit este: " +text3.charAt(i) + "pe pozitia: "+ i + ".");
         }
      }
    // Write a Java program to read a string and if the first or last characters are 's' or 'e', return the string without the words from odd positions.

       public static void firstLastCharacter (String text4) {
         char a = ' ';
         if (text4.startsWith("s") || text4.startsWith("e") || text4.endsWith("s") || text4.endsWith("e")){
             for (int i = 1; i < text4.length() - 1; i += 2) {
                 a = text4.charAt(i);
             }
         }
           System.out.println(a);
       }
    // Write a Java program to count the number of words ending that have more than 2 vowels.

       public static void nrOfWords (String text2) {
         int numarareCuvinte = 0;
         String [] nrOfWords = text2.split(" ");
         for (int i = 0; i < nrOfWords.length; i++) {
             int numarareVocale = 0;
             String [] vocale = {"a", "e", "i", "o","u",};
             for (int j = 0; j < vocale.length; j++){
                 if (nrOfWords[i].contains(vocale[j])){
                     numarareVocale++;
                 }
                 if (numarareVocale > 2) {
                     numarareCuvinte++;
                     break;
                 }
             }
         }
           System.out.println("Numarul cuvintelor care au mai mult de doua vocale este: " +numarareCuvinte);
       }
    // Write a Java program to count all “,” and spaces in a text.

        public static void countSpaces (String text4){
         int numarare = 0;
         for (int i= 0; i <= text4.length() - 1; i++){
             if (text4.charAt(i) == ' ' || text4.charAt(i) == ','){
                 numarare++;
             }
         }
            System.out.println(numarare);
        }
    // Write a Java program to replace all spaces from a string with “;” if the space is on an even position and with “|” if the space is on an odd position from a given string.

         public static void replaceAllSpaces (String text4){
         for (int a = 0; a <= text4.length() - 1; a++) {
             if (text4.charAt(a) == ' ') {
                 if (text4.indexOf(text4.charAt(a)) % 2 == 0) {
                     text4 = text4.replace(text4.charAt(a), ';' );
                 } else {
                     text4 = text4.replace(text4.charAt(a), '|');
                 }
             }
         }
             System.out.println(text4);
         }


}
