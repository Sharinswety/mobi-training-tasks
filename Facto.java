package mobitaining.day1;

import java.util.Scanner;

public class Facto {

	public static void main(String[] args) {
		
		       int i,fact=1;
		       
		   Scanner sc=new Scanner(System.in);
		       System.out.println("enter the factorial value:");
		     int num=sc.nextInt();
		      
		       
	          // int num=5;
		       for(i=1;i<=num;i++){
		           fact=fact*i;
		       }
		       System.out.println("the factorial of"+num+"is"+fact);
		    }
		}

	
