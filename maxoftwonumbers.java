import java.util.*;
public class maxoftwonumbers {
    
    static int maxProduct(int arr[]) {
        int n = arr.length ;
        if (n < 2)
        {
            System.out.println("NA");
            return Integer.MIN_VALUE;
        }
        int highestnum = Integer.MIN_VALUE;
        int secondhighestnum = Integer.MIN_VALUE;
        int lowestnum = Integer.MAX_VALUE;
        int secondlowestnum = Integer.MAX_VALUE;
        for(int i = 0; i<n ; i++){
            if(arr[i] > highestnum){
                highestnum = arr[i];
            }
            else if( arr[i] < highestnum && arr[i] > secondhighestnum ){
                secondhighestnum = arr[i];
            }
            else if(arr[i] < secondhighestnum){
                if(arr[i] < lowestnum) lowestnum = arr[i];
                else if(arr[i] > lowestnum && arr[i] < secondlowestnum) lowestnum = arr[i];
            }
        }
        if(highestnum*secondhighestnum > lowestnum*secondlowestnum)
            return highestnum*secondhighestnum;
        else return lowestnum*secondlowestnum;

    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int answer = maxProduct(arr);
        System.out.print(answer);
    }
}
