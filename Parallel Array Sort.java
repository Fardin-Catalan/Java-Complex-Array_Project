import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the length of array 1:");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a number:");
            arr1[i]=sc.nextInt();
        }
        System.out.print("Please enter the length of array2:");
        int m=sc.nextInt();
        sc.nextLine();
        String[] arr2=new String[m];
        for(int j=0;j<arr2.length;j++){
            System.out.print("Enter a string:");
            arr2[j]=sc.nextLine();
        }
        for(int i=0;i<arr1.length-1;i++){
            for(int j=i+1;j<arr2.length;j++){
                if(arr1[j]<arr1[i]){
                    int temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                    String temp_str=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp_str;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted Array:");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int j=0;j<arr2.length;j++){
            System.out.print(arr2[j]+" ");
        }
    }
}       
