import java.util.Arrays;

public class ArrayStuff
{

    public ArrayStuff()
    {

    }

    public static int findMinOrMax(int[] arr, int val)
    {
        if(val == 0) //find the minimium
        {
            int minimum = arr[0];
            for(int i = 1; i < arr.length; i++)
            {
                if(arr[i] < minimum)
                {
                    minimum = arr[i];
                }
            }
            return minimum;
        }
        else //find the maximum
        {
            int maximum = arr[0];
            for(int i = 1; i < arr.length; i++)
            {
                if(arr[i] > maximum)
                {
                    maximum = arr[i];
                }
            }
            return maximum;
        }
    }

    public static int sequentialSearch(int[] arr, int num)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == num)
            {
                return i;
            }
        }
        return -1;
    }

    public static double computeSum(double[] arr)
    {
        double sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        return sum;
    }

    public static double computeAvg(double[] arr)
    {
        double sum = computeSum(arr);
        return sum/arr.length;
    }

    //Mode - Worked on in codingrooms

    public static boolean atleastOnePositive(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > 0)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean allPositive(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < 0)
            {
                return false;
            }
        }

        return true;
    }

    public static int findNumOfNegativeInts(int[] arr)
    {
        int count = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < 0)
            {
                count++;
            }    
        }

        return count;
    }

    // Problem 8 Unsolved

    public static boolean findDuplicates(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    return true;
                }                
            }
        }
        return false;
    }

    public static int[] shiftLeft(int[] arr)
    {
        int[] array = new int[arr.length];

        for(int i = 0; i < array.length-1; i++)
        {
            array[i] = arr[i+1];
        }

        array[arr.length - 1] = arr[0];

        return array;
    }

    public static int[] shiftRight(int[] arr)
    {
        int[] array = new int[arr.length];

        for(int i = 0; i < arr.length-1; i++)
        {
            array[i+1] = arr[i];
        }

        array[0] = arr[arr.length-1];

        return array;
    }

    public static int[] reverseArray(int[] arr)
    {
        int[] array = new int[arr.length];

        for(int i = arr.length - 1; i >= 0; i--)
        {
            array[arr.length - 1 - i] = arr[i];
        }

        return array;
    }

    public static int[] reverseArray2(int[] arr)
    {
        for(int i = arr.length - 1; i >= arr.length/2; i--)
        {
            int num = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = num;

        }

        return arr;
    }
    public static void main(String[] args) {
        int[] testArray = {0,1,2,3,-4,5,6,7,8,9,-1,2,3,-0,2,0};
        System.out.println(findMinOrMax(testArray, 0));
        System.out.println(findMinOrMax(testArray, 1));
        System.out.println(sequentialSearch(testArray, 21));
        System.out.println(atleastOnePositive(testArray));
        System.out.println(allPositive(testArray));
        System.out.println(findNumOfNegativeInts(testArray));
        System.out.println(findDuplicates(testArray));
        System.out.println(Arrays.toString(reverseArray(testArray)));
        System.out.println(Arrays.toString(reverseArray2(testArray)));

        int[] testArray2 = {1,2,3,4};
        System.out.println(Arrays.toString(shiftLeft(testArray2)));
        System.out.println(Arrays.toString(shiftRight(testArray2)));
    }
}