package common;

import java.util.*;
import java.io.*;

public class TrianglePattern {
	
	public static void TrianglePatternBasic(int n) {

		// Write your code here
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("1");
			}
			System.out.println();
		}

	}
	
	public static void TrianglePattern(int n) {

		// Write your code here
		for (int i = 1; i <= n; i++) {
			int k=i;
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(k);
				k++;
			}
			k=k-2;
			for(int j=1;j<i;j++) {
				System.out.print(k);
				k--;
			}
			System.out.println();
		}

	}
	
	

	public static void main(String[] args) {
		TrianglePatternBasic(4);
		System.out.println("--hehe--");
		TrianglePattern(4);
	}

}
