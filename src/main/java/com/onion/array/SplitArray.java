package com.onion.array;

import java.util.*;

public class SplitArray
{
    // copyOfRange().,
    static void splitArray(int[] arr)
    {
        System.out.println("\n Original Array given:"+ Arrays.toString(arr));
        int[] subArray1 = Arrays.copyOfRange(arr,0,4);
        System.out.println("\n Sub array:"+Arrays.toString(subArray1));
    }

    public static void main(String[] args)
    {
        splitArray(new int[]{1,3,4,5,6,7,8});
    }
}
