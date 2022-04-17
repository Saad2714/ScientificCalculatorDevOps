import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;

import org.junit.*;
//import sun.awt.SunToolkit;
//
//import static jdk.nashorn.internal.objects.Global.Infinity;
//import static jdk.nashorn.internal.objects.Global.NaN;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;


import org.junit.Assert;

import org.junit.*;
//import sun.awt.SunToolkit;
//
//import static jdk.nashorn.internal.objects.Global.Infinity;
//import static jdk.nashorn.internal.objects.Global.NaN;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;


public class MyScientificCalcTest {
    MyScientificCalc calculator = new MyScientificCalc();

    @Test
    public void squareRootTest(){
        assertEquals("Testing for Square Root", 16.0, calculator.squareRoot(256.0), 0.0f);
    }
    
    @Test
    public void factorialTest(){
        assertEquals("Testing for Factorial", 120, calculator.factorial(5), 0.0f);
    }

    @Test
    public void naturalLogTest(){
        assertEquals("Testing for Natural Log", 1.0, calculator.naturalLog(2.718), 0.2f);
    }

    @Test
    public void powerTest(){
        assertEquals("Testing for Power", 125.0, calculator.power(5.0, 3), 0.0f);
    }
}
