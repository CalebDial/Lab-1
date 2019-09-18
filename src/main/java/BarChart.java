import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caleb
 */
public class BarChart {public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
	
		int sales = 0;
		
		System.out.print("Enter today's sales for store 1: ");
		int sale1 = input.nextInt();
		
		System.out.print("Enter today's sales for store 2: ");
		int sale2 = input.nextInt();
		
		System.out.print("Enter today's sales for store 3: ");
		int sale3 = input.nextInt();
		
		System.out.print("Enter today's sales for store 4: ");
		int sale4 = input.nextInt();
		
		System.out.print("Enter today's sales for store 5: ");
		int sale5 = input.nextInt();
		

		System.out.println("");
		
		System.out.println("SALES BAR CHART");
		for(int k = 1; k <= 5; k++){
			System.out.print("Store " + k + ": ");
			switch(k){
			case 1:
				sales = sale1;
				break;
			case 2:
				sales = sale2;
				break;
			case 3:
				sales = sale3;
				break;
			case 4: 
				sales = sale4;
				break;
			case 5:
				sales = sale5;
			}
			for(int l=1; l<=sales/100; l++){
				System.out.print("*");
				
			}
			System.out.println("");
		}

    
}
}
