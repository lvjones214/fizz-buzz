package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;



public class FizzBuzzTest {

    @Test
    public void shouldBeAbleToCreateFizzBuzzObject() {
        //arrange and action
        FizzBuzz underTest = new FizzBuzz();
        //assertion
        assertTrue(underTest != null);
    }

    @Test
    public void givenOneShouldReturnOne(){
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.interpret(1);
        //assertion
        assertEquals("1", result);
    }
    @Test
    public void givenTwoShouldReturnTwo(){
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.interpret(2);
        //assertion
        assertEquals("2", result);
    }
    @Test
    public void givenThreeShouldReturnFizz(){
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.interpret(3);
        //assertion
        assertEquals("Fizz", result);
    }
    @Test
    public void givenFiveShouldReturnBuzz(){
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.interpret(5);
        //assertion
        assertEquals("Buzz", result);
    }
    @Test
    public void givenSixShouldReturnFizz(){
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.interpret(6);
        //assertion
        assertEquals("Fizz", result);
    }
    @Test
    public void givenNineShouldReturnFizz(){
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.interpret(9);
        //assertion
        assertEquals("Fizz", result);
    }
    @Test
    public void givenTenShouldReturnBuzz(){
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.interpret(10);
        //assertion
        assertEquals("Buzz", result);
    }
    @Test
    public void given15ShouldReturnFizzBuzz(){
         //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.interpret(15);
        //assertion
        assertEquals("FizzBuzz", result);
    }
}
