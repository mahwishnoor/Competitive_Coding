import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY stringList
     *  2. STRING_ARRAY queries
     */

    public static int[] matchingStrings(String[] stringList, String[] queries) {
    // Write your code here
    int s1 = stringList.length,s2 = queries.length;
    int c=0;
    int[] results = new int[s2];
    for(int i = 0;i<s2;i++)
    {
        for(int j = 0;j<s1;j++)
        {
            if(queries[i].equals(stringList[j]))
                c++;
        }
        results[i]=c;
        c=0;
    }
    return results;
    }

}

public class Solution {
    public static void main(String[] args)  
    {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        String[] StringList = new String[n];
        for(int i = 0;i<n;i++)
        {
            StringList[i] = sc.nextLine();
        }
        
        int q = Integer.parseInt(sc.nextLine());
        String[] queries = new String[q]; 
        for(int j = 0;j<q;j++)
        {
            queries[j] = sc.nextLine();
        }   
        int[] res = Result.matchingStrings(StringList,queries); 
        for(int i = 0;i<res.length;i++)   
            System.out.println(res[i]+" ");
    }
    
}
