/*
Rick Howell
CSC 120
Exceptions Labs
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        int i;
        int argc;

        argc = args.length;

        // try and parse the integers
        for (i = 0; i < argc; ++i) {
            try {
                numbers.add(converter(args[i]));
            } catch (NumberFormatException e) {
                System.out.println("Catch block says the argument \"" + args[i] + "\" is ignored because " + args[i]);
            }
        }

        // print the array list
        System.out.println();
        System.out.println("Vector contents are: ");
        for (i = 0; i < numbers.size(); ++i) {
            System.out.print("Item " + i + " is ");
            System.out.println(numbers.get(i));
        }

    } // end main method

    private static Integer converter(String input) throws NumberFormatException {
        System.out.println("Converter method says integer OK - " + Integer.parseInt(input));
        return Integer.parseInt(input);
    }

}
