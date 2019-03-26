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

        for (int i=0; i < size_left; ++i){
		left_array[i] = arr[left_index + i];
	}
        for (int j=0; j < size_right; ++j){
		right_array[j] = arr[right_index + 1+ j];
	}


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

	while (i < size_left) {
        	arr[k] = left_array[i];
        	i++;
        	k++;
	}

    	while (j < size_right){
        	arr[k] = right_array[j];
        	j++;
        	k++;
    	}
}

void mergeSortHelp(int arr[], int left_index_start, int right_index_start) {
    if (left_index_start < right_index_start) {
        	int m = left_index_start+(right_index_start-left_index_start)/2;

        	// Sort first and second halves
        	mergeSortHelp(arr, left_index_start, m);
        	mergeSortHelp(arr, m+1, right_index_start);

        	merge(arr, left_index_start, m, right_index_start);
    	}
}

}
