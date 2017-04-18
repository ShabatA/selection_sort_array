/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sortarray;

/**
 *
 * @author Abuobayda Shabat
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] array = new int[5];
        array[0]=10;
        array[1]=5;
        array[2]=2;
        array[3]=15;
        array[4]=3;
        
        selectionSort(array);
        
        for(int i=0; i<array.length;i++){
            System.out.println("item "+(i+1)+": "+ array[i]);
        }
        
        
    }

	
	// Arranges the elements of the given array into sorted order
	// using the "selection sort" algorithm, which makes sweeps over
	// the array, finding the i'th smallest element each time,
	// and swapping it to be stored at index i.
	public static void selectionSort(int[] a) {
		for (int pass = 0; pass < a.length; pass++) {
			// figure out what should go into a[pass]
			int min = pass;
			for (int j = pass + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			
			swap(a, pass, min);
		}
	}
	
	// Swaps the values at the two given indexes in the given array.
	private static void swap(int[] a, int i, int j) {
		if (i != j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}

	
	// Returns true if the given array is in sorted ascending order.
	private static boolean isSorted(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}
		return true;
	}
	
	

}
    

