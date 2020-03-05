package io.github.controlx.sorting;

public class SelectionSort {
	
	public static int[] sort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
}
