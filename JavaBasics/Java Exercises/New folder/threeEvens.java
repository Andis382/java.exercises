public class threeEvens {
    
    public static void main(String[] args) throws Exception {
           
        //Initialize variables
        int[] numbers = {7, 11, 5, 35, 45, 94, 9, 62, 23};
        int sumEven = 0;
        int sumOdd = 0;

        //Traverse the array
        for(int i = 0; i < numbers.length; i++)
            {
                //Checking if the element is divisible by 2 
                if(numbers[i] % 2 == 0)
                    sumEven += numbers[i];
                else 
                    sumOdd += numbers[i];
            }

        //Checking if the sum of even and odd numbers is equal
        if(sumOdd == sumEven)
            System.out.println("Even and Odd equals");
        else
            System.out.println("Odd and Even");

        }
    }