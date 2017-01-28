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
		 int max = 0;
		 for(int i = 0; i < interns.length; i++){
			 
		 }
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
