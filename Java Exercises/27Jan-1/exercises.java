import java.util.Arrays; 
public class exercises {
    
    public static void main(String[] args) {
       
        int[] array_nums = {50, 34, 200};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int max_val = array_nums[0];
	if(array_nums[2] >= max_val)
		max_val = array_nums[2];
	System.out.println("Larger value between first and last element: "+max_val); 	 	 


    int[] arrays = {20, 30, 40};
	System.out.println("Original Array: "+Arrays.toString(arrays)); 
	int x = arrays[0];
	arrays[0] = arrays[arrays.length-1];
	arrays[arrays.length-1] = x;
	System.out.println("New array after swaping the first and last elements: "+Arrays.toString(arrays));
 }
}