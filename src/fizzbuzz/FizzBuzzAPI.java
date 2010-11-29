package fizzbuzz;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pfraca
 */
public class FizzBuzzAPI {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = FizzBuzzAPI.FIZZ + " " + FizzBuzzAPI.BUZZ;;

    public static final int DOWN_LIMIT = 1;
    public static final int UP_LIMIT = 100;

    public static final int DIVISOR_1 = 3;
    public static final int DIVISOR_2 = 5;

    public FizzBuzzAPI() {
    }

    public static String getResult(int number) {
        String returnValue = String.valueOf(number);
        if(number<FizzBuzzAPI.DOWN_LIMIT || number>FizzBuzzAPI.UP_LIMIT) {
            return null;
        } else {
            if( number % FizzBuzzAPI.DIVISOR_1 == 0) {
                returnValue = FizzBuzzAPI.FIZZ;
            }
            if(number % FizzBuzzAPI.DIVISOR_2 ==0) {
                if(returnValue.contentEquals(FizzBuzzAPI.FIZZ)) {
                    return FizzBuzzAPI.FIZZ_BUZZ;
                } else {
                    return FizzBuzzAPI.BUZZ;
                }
            }
        }
        return returnValue;
    }
}
