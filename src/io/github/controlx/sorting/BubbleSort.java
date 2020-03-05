package io.github.controlx.sorting;

public class BubbleSort{
	public static int[] sort(int[] a) {
		for(int i=0; i<(a.length)-1-i; i++) {
			int flag = 0;
			if(a[i+1] < a[i]) {
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
				flag = 1;
			}
			if(flag == 0) {
				break;
			}
		}
		return a;
	}
}
