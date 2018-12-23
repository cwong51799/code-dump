public class SelectionSort {
	public static void main (String[] args) {
		int [] array = {2, 9, 5, 4, 8, 1, 6}; // Enter a group of numbers into this array.
		int position = 0;
		int smallest; 
		int p;
		for (position = 0; position < array.length; position++) {
		smallest = array[position];
			for (int i = position+1; i < array.length;i++) {
				if (smallest > array[i]) {
					p = array[i]; 
					array[i] = smallest;
					smallest = p;
				}
		}
			array[position] = smallest;
			
		}
		for (int i = 0; i < array.length; i++) 
			System.out.print(array[i] + " ");
			}
		}

