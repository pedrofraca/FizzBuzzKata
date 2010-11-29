/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fizzbuzz;


/**
 *
 * @author pfraca
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            System.out.println(FizzBuzzAPI.getResult(i));
        }   
    }
}
