package com;

import java.io.*;
import java.util.*;


public class Solution {
	
	
	 public static void main(String[] args) {
	        //first we take in input
		 	Scanner sc = new Scanner(System.in);
		 	int testCases = sc.nextInt();
		 	
		 	
		 	for(int i = 0; i < testCases; i++){
		 		int internCount = sc.nextInt();
		 		int[] interns = new int[internCount];
		 
		 		for(int x = 0; x < internCount; x++ ){
		 			interns[x] = sc.nextInt();
		 		}
		 		process(interns);
		 
		 	}
		 	
	    }
	 
	 /**
	  * this method takes in the Array and processes it
	  * @param interns
	  */
	 private static void process(int[] interns){
		 
		 if( checkEqual(interns)){
			 System.out.println("0");
		 }
		 int min = Integer.MAX_VALUE;
		 for(int i = 0; i < interns.length; i++){
			 if(interns[i] < min){
				 min = interns[i];
			 }
		 }
		 int operations = 0;
		 for(int i = 0; i < interns.length; i++){
			 int value = interns[i] - min;
			 operations += operate(value);
		 }
		 System.out.println(operations);
	 }
	 
	 private static int operate(int value){
		 if(value >= 5){
			 return 1 + operate(value - 5);
		 }
		 if(value >= 2){
			 return 1 + operate(value - 2);
		 }
		 if(value >= 1){
			 return 1 + operate(value - 1);
		 }
		 return 0;
	 }
	 /**
	  *This method checks to see if the interns already have an equal amount of chocolate
	  */
	 private static boolean checkEqual(int[] interns){
		 int check = interns[0];
		 
		 for(int i = 0; i < interns.length; i++){
			 if(check != interns[i]){
				 return false;
			 }
		 }
		 return true;
	 }

}
