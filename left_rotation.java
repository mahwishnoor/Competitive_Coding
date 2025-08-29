import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static int[] rotateLeft(int d, int[] arr) 
    {
        int rot=0,temp,n=arr.length;
        while(rot<d)
        {
            temp=arr[0];
            for(int i=0;i<n-1;i++)
            {
                arr[i]=arr[i+1];
            }  
                arr[n-1]=temp;
                rot++;
        }
    return arr;

    }
}

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int d = ob.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = ob.nextInt();
        }
        int[] res = Result.rotateLeft(d,arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(res[i]+" ");
        }
        ob.close();
    }
}
