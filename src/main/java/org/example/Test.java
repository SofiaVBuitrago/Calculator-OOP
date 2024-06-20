package org.example;
import junit.framework.TestCase;


public class Test extends TestCase {
    private Calculator calculadora;

    public void escenario (){

        calculadora = new Calculator();
    }

    public void testAddition (){
        assertTrue(Calculator.Addition(25,100)==(25+100));
    }

    public void testSubtraction (){
        assertEquals(3,Calculator.Subtraction(5,2));

    }

    public void testMultiplication (){
        assertTrue(Calculator.Multiplication(25,4)==(25*4));

    }

    public void testDivision (){/*leave this one to fail*/
        assertTrue(Calculator.Division(100,25)==(89));

    }

}
