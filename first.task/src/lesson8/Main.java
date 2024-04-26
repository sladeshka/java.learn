package lesson8;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    static Logger logger = Logger.getLogger("Main");
    public static void main(String[] args) {
        throwCheckedException();
        try {
            throwCheckedException2();
        } catch (CheckedException e) {
            System.err.println(e.getMessage());
        }
        try {
            throwUncheckedException();
        } catch (UncheckedException e) {
            System.err.println(e.getMessage());
        }

        try {
            int array[] = new int[]{1, 2, 3};
            logger.log(Level.INFO, String.valueOf(array[1]));
            System.out.println(array[100]);
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.log(Level.SEVERE, e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void throwCheckedException() {
        try {
            throw new CheckedException("message");
        } catch (CheckedException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void throwCheckedException2() throws CheckedException {
        throw new CheckedException("message");
    }

    public static Integer parseNumber(String input) throws CheckedException {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e){
            throw new CheckedException("message");
        }
    }

    public static void throwUncheckedException() throws UncheckedException {
        throw new UncheckedException("message");
    }
}
