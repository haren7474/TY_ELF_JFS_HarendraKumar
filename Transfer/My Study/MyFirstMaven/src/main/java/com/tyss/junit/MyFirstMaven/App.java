package com.tyss.junit.MyFirstMaven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Calculator c= new Calculator();
        
        System.out.println("Sum is: "+ c.sum(10, 5));
        System.out.println("Diff is: "+ c.diff(10, 5));
        System.out.println("Mult is: "+ c.mult(10, 5));
        System.out.println("Div is: "+ c.div(10, 5));
    }
}
