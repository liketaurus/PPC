
package binarysort;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class BinarySort {
    private static int [][] matrix;
    
    private static String[] convertArray(int[][] a)
    {
        String[] result = new String[a.length];
        for (int i=0; i<a.length;i++)
        {
            String temp = "";
            for (int j=0; j<a[0].length;j++)
            {
                temp=temp+Integer.toString(a[i][j]);
            }
            result[i]=temp;
        }
        return result;
    }

    private static void printArray(String[] a)
    {
        System.out.println(Arrays.toString(a));
    }
    
    private static String[] addDecimal (String[] a)
    {
        String[] result = new String[a.length];
        for (int i=0; i<a.length;i++)
        {
            result[i]= Integer.toString(Integer.parseInt(a[i],2))+"="+a[i];
        }
        return result;                
    }
    
    private static String[] sortArray (String[] a)
    {
        //Bubble sort        
        boolean flag=true;
        String temp="";
        
        while (flag)
        {
            flag=false;
            for (int i=0;i<a.length-1;i++ )
            {
                if (a[i].charAt(0)<a[i+1].charAt(0))
                {
                    temp = a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    flag=true;
                }
            }
        }
        return a;
    }
    
    private static String[] formatArray(String[] a)
    {
        for (int i=0;i<a.length;i++ )
        {
            StringBuilder temp = new StringBuilder(a[i]);
            temp.delete(0, 2);
            a[i]=temp.toString();
        }
        return a;
    }
    
    public static void main(String[] args) {    
        matrix = new int[][]{{1,0,1},{1,1,0},{1,0,0},{0,0,1},{0,1,0}};
        printArray(convertArray(matrix));
        printArray(addDecimal(convertArray(matrix)));
        printArray(sortArray(addDecimal(convertArray(matrix))));
        printArray(formatArray(sortArray(addDecimal(convertArray(matrix)))));
    }
    
}
