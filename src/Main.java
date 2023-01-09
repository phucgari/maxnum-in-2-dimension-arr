import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter n");
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        int[][] arr= new int[n][];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=new int[n];
            for (int j = 0; j < n; j++) {
                System.out.println("input number for position"+i+" "+j);
                arr[i][j]=s.nextInt();
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int max=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Max num is "+max);
    }
}