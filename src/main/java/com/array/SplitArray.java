package com.array;

import java.util.Arrays;

public class SplitArray
{
    static void splitArray(int[] arr)
    {
        System.out.println("\n Original array given:"+ Arrays.toString(arr));
        int[] subArray1 = Arrays.copyOfRange(arr,0,3);
        int[] subArray2 = Arrays.copyOfRange(arr,3,6);

        System.out.println("\nArray's obtained from the original array,\n"+Arrays.toString(subArray1)+"\n"+Arrays.toString(subArray2));
    }
    public static void main(String[] args)
    {
        System.out.println("\n Program to obtain subArray's from the original Array");
        splitArray(new int[]{1,2,3,4,5,6,7,8,9});
    }
}
