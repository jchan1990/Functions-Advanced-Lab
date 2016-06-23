import java.util.Random;

/**
 * Created by Jason on 6/22/2016.
 */
public class Main {

    public static void main(String[] args) {
        // 1
        isTrueOrFalse();
        // 2
        sameSpelling();
        // 3
        stopAtW("Konichiwa");
        // 4
        System.out.println(randomNumGenerator());
        // 5
        // 6
        System.out.println(omitLetters("\n\nAloha\n\n"));
        // 7
        except4(17);
        // 8
        // 9
        // 10

    }

    /*
    1. Write a function that takes in a number and returns true if the number is even or false if the number is odd.
    You may use control flow and multiple conditionals.
      */
    public static void isTrueOrFalse() {
        // This is a random number generator that prints out a number from 1-100
        Random rand = new Random();
        int x = rand.nextInt(100) + 1;

        // Displays the random number and asks if the number is even
        System.out.println("Is " + x + " even?");

        // This checks whether or not x is even or odd
        if ((x % 2) == 0) {
            System.out.println("True, this number is even");
        } else System.out.println("False, this number is odd");
    }

    /*
    2. Write a function that takes in two words and compares them. If the spelling is the same, the functions
    returns true, otherwise false.
    */
    public static void sameSpelling() {
        // This is a random letter generator that prints out two letters from a-z
        Random rand = new Random();
        char a = (char) (rand.nextInt(26) + 'a');
        System.out.println("\nThe first letter is " + a);
        char b = (char) (rand.nextInt(26) + 'b');
        System.out.println("The second letter is " + b);

        /* This takes the two letters and compares the spelling and if the letters are the same they will return
        true if not it will return false
        */
        if (a == b) {
            System.out.println("True, the letters match \n");
        } else System.out.println("False, the letters don't match \n");

    }

    /*
    3. Write a function that takes in a word and prints out its every letter on a new line before it sees the
    letter "w". If it encounters "w" the function should stop executing.
    */
    public static void stopAtW(String x) {
        // This is a null checker
        if (x != null) {
            // This declare i as 0, compare i to the length of x, if i is less than x continue iterating i
            for (int i = 0; i < x.length(); i++) {
                /* Check if the character value of w is at the character position i, if it is not print the letter
                until it reaches the position of i
                 */
                if (x.charAt(i) == 'w') {
                    break;
                } else {
                    System.out.println(x.charAt(i));
                }
            }
            // In case of null this will be printed
        } else {
            System.out.println("null detected");
        }
    }

    /*
    4. Write a function that generates a random number. Print it out. If the number is greater that 50,
    return it, otherwise return -1. You may use control flow and multiple conditionals.
    */
    public static int randomNumGenerator() {
        // This is a random number generator that generates a number from 0-100
        Random rand = new Random();
        int rng = rand.nextInt(100);
        System.out.println("\n" + rng);

        // This will check if rng is greater than 50 if so return the value of rng, if not return -1
        if (rng > 50) {
            return rng;
        } else {
            return -1;
        }

    }

    /*
    5. Write a function that takes in 3 integers: day, month, and year and computes day, month, and year of the next day.
    The function should return a string (e.g. day:12 month:11 year:1988)
    */


    /*
    6. Write a function that takes in a word, omits every other letter in that word and returns a new word.
    You can use control flow and multiple conditionals.
     */
    public static String omitLetters(String word) {
        String newWord = "";

        if (word == null) {
            newWord = "NULL WORD!";
        } else if (word.equals("")) {
            newWord = "EMPTY WORD!";
        } else {
            int wordLength = word.length();

            for (int x = 0; x < wordLength; x += 2) {
                newWord = newWord + word.charAt(x);
            }
        }
        return newWord;
    }

    /*
    7. Write a function that takes in a number greater than 5 and prints out all the numbers
    from 1 to that number except number 4. Please use a while statement.
    */
    public static void except4(int num) {
        int i = 1;

        while (i <= num) {
            if (i != 4) {
                System.out.println(i);
            } else {

            }
            i++;
        }
    }

    /*
    8.
    */
}
