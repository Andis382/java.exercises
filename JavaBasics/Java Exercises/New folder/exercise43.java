public class exercise43 {
    
    public static void main(String args[])
    {
        int[] arr = { 2, 8, 7, 3, 5 };
        int sum = 10;
        getPairsCount(arr, sum);
    }
 
    
    public static void getPairsCount(int[] arr, int sum)
    {
 
        int count = 0; 
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;
 
        System.out.println("The count of pairs is  " + count);
    }
}

