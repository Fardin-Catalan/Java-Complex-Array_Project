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
        System.out.print("Please enter the length of array 2 to check whether it's a subset of Array 1 or not:");
        int m=sc.nextInt();
        int[] arr2=new int[m];
        for(int j=0;j<m;j++){
            System.out.print("Enter a number:");
            arr2[j]=sc.nextInt();
        }
        int match=0;
        for(int i=0;i<arr2.length;i++){
            int temp=arr2[i];
            for(int j=0;j<arr1.length;j++){
                if(temp==arr1[j]){
                    match+=1;
                    break;
                }
            }
        }
        if(match==arr2.length){
            System.out.println("Array 2 is a subset of Array 1");
        }
        else{
            System.out.println("Array 2 is not a subset of Array 1");
        }
    }
}
