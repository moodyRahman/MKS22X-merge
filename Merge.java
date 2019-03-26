public class Merge{

public static void mergesort(int[]data){

}

void merge(int arr[], int left_index, int right_index, int total_size){
        // find sizes
        int size_left = right_index - left_index + 1;
        int size_right = total_size - right_index;

        // temps
        int left_array[] = new int [size_left];
        int right_array[] = new int [size_right];




	// MERGE! probably
        // init index subarray 1 and 2
        int i = 0, j = 0;

        // init index post merge
        int k = left_index;
        while (i < size_left && j < size_right){
            if (left_array[i] <= right_array[j]){
                arr[k] = left_array[i];
                i++;
            }
	    else{
                arr[k] = right_array[j];
                j++;
            }
            k++;
        }


    }

}
