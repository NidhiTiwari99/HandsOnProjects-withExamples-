package handson;

	import java.util.Arrays;  
	public class ParellalArrayShorting {  
	    public static void main(String[] args) {  
	        int[] arr = {5,8,1,0,6,9};  
	        for (int i : arr) {  
	            System.out.print(i+" ");  
	        }  
	        Arrays.parallelSort(arr);  
	        System.out.println("\nArray elements after sorting");  
	        for (int i : arr) {  
	            System.out.print(i+" ");  
	        }  
	    }  
	}  