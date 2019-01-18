package com.company;

import java.util.Scanner;

/**
 * Create a program for the Hole in Ten Golf Company. It will prompt the user for a product code.
 * The program will then display the corresponding price and description from the table below.
 *
 * Use switches and number formats!
 *
 * Code	|   Description	                   |Price
 * -----|----------------------------------|------
 * BALL	    Golf Balls (1 dozen)	        $38.00
 * DRV01	Big Bertha Driver	            $449.95
 * DRV02	Vaporizer Driver	            $375.00
 * DRV03	Fly-Z Driver	                $179.00
 * SET01	Project Manager Gold Club Set	$179.00
 * SET02	Junior VP Golf Club Set	        $225.00
 * SET03	Executive Golf Club Set	        $299.95
 * SET04	CEO Golf Club Set	            $374.95
 * SET05	Chairman of the Board Club Set	$495.00
 *
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the product code ");
        String code = keyboard.next();

        switch (code.toUpperCase()){
            case "BALL":
                System.out.printf("Golf Balls (1 dozen) is $%.2f",38.0 );
                break;
            case "DRV01":
                System.out.printf("Big Bertha Driver $%.2f" ,449.95);
                break;
            case "DRV02":
                System.out.printf("Vaporizer Driver $%.2f",375.0);
                break;
            case "DRV03":
                System.out.printf("Fly-Z Driver	$%.2f",179.0);
                break;
            case "SET01":
                System.out.printf("Project Manager Gold Club Set $%.2f" ,179.0);
                break;
            case "SET02":
                System.out.printf("Junior VP Golf Club Set	$%.2f",225.0);
                break;
            case "SET03":
                System.out.printf("Executive Golf Club Set	$%.2f",299.95);
                break;
            case "SET04":
                System.out.printf("CEO Golf Club Set $%.2f",374.95);
                break;
            case "SET05":
                System.out.printf("Chairman of the Board Club Set $%.2f",495.0);
                break;
        }
    }
}
