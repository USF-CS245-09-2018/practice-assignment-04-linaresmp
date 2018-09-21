public class BubbleSort implements SortingAlgorithm{

	public void sort(int[] a){
		boolean swapped = true;
		int temp;
		while(swapped){
			swapped = false;
		
		for (int j = 0; j <a.length -1; j++){
			for (int k = 0; k<a.length-j-1;k++){
			if(a[k]>a[k+1]){
				temp = a[k];
				a[k] = a[k+1];
				a[k+1] = temp;
			}
			}
		}
	}
}
	
}