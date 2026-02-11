import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array:");
        int n=sc.nextInt();
        int[] old=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a number:");
            old[i]=sc.nextInt();
        }
        System.out.println("Original array:");
        for(int i=0;i<old.length;i++){
            System.out.print(old[i]+" ");
        }
        for(int i=0;i<old.length;i++){
            int temp=old[i];
            if(temp<=0){
                old[i]=0;
            }
            else{
                old[i]=1;
            }
        }
        System.out.println();
        System.out.println("After modifying result:");
        for(int j=0;j<old.length;j++){
            System.out.print(old[j]+"  ");
        }
    }
}         
