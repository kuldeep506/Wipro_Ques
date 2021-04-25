package futureskills;

import java.util.Arrays;

/**
 * question--The method sum takes 3 parameters of type integer having value (1000<parameter<9999)
 * then it should print the sum;
 * formula for sum:
 *
 *   SUM= ((sum of smallest digit of each parameters)-(sum of largest digit of each parameters))
 */
public class Ques {
     public static int sum(int n1,int n2,int n3){
        int[] arr1=new int[4];
        int[] arr2=new int[4];
        int[] arr3=new int[4];
        for (int i = 0; i <4 ; i++) {
            arr1[i]=n1%10;
            n1=n1/10;
            arr2[i]=n2%10;
            n2=n2/10;
            arr3[i]=n3%10;
            n3=n3/10;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
         return ((arr1[0]+arr2[0]+arr3[0])-(arr1[3]+arr2[3]+arr3[3]));
    }
}



