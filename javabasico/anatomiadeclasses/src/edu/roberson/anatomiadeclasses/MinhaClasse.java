package edu.roberson.anatomiadeclasses;
/**
 * This is a silly class to wrap-up codes conventions examples
 */

public class MinhaClasse {
    public static void main(String[] args) {
        /* 
         * Naming conventions:
         * 1: variables, methods and classes follow CammelCase write convention.
         * 2: constants must be upper case words and if it's a compound noun 
         *    it's words must be separeted by "_".
         * 3: variables must contain just "_, $, letters and numbers 0 to 9".
         * 4: variables must start only with "_, $ and letters" (never with 
         *    numbers).
         * 5: methods must be inifnitive verbs.
         * 6: variables must be nouns.
         * 
         * More conventions: 
         * https://www.oracle.com/technetwork/java/codeconventions-150003.pdf
         */

        String firstName = "Roberson";
        String lastName = "Mendes";
        String name =  allName(firstName, lastName);

        System.out.print(name);
    }

    public static String allName(String first, String second) {
        return first.concat(" ").concat(second);
    }
}