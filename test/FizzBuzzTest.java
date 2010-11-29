/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import fizzbuzz.FizzBuzzAPI;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pfraca
 */
public class FizzBuzzTest {
    
    public FizzBuzzTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testLimits() {
        assertEquals(null, FizzBuzzAPI.getResult(FizzBuzzAPI.DOWN_LIMIT -1));
        assertEquals(null, FizzBuzzAPI.getResult(FizzBuzzAPI.UP_LIMIT +1));
    }

    @Test
    public void testThree() {
        assertEquals(FizzBuzzAPI.FIZZ, FizzBuzzAPI.getResult(3));
    }
    @Test
    public void testFive() {
        assertEquals(FizzBuzzAPI.BUZZ, FizzBuzzAPI.getResult(5));
    }

    @Test
    public void testFiveTeen() {
        assertEquals(FizzBuzzAPI.FIZZ_BUZZ, FizzBuzzAPI.getResult(15));
    }
}