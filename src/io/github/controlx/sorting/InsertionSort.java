package io.github.controlx.sorting;

public class InsertionSort {

	public static int[] sort(int[] a) {
		for(int i=1; i<a.length - 1; i++) {
			int value = a[i];
			int hole = i;
			
			while(hole > 0 && a[hole-1] > value) {
				a[hole] = a[hole-1];
				hole = hole - 1;
			}

			a[hole] = value;
		}
		return a;
	}
}
