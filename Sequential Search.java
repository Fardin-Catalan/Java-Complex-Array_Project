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
        System.out.print("Enter the element to be found:");
        int target=sc.nextInt();
        boolean found=false;
        int index=0;
        for(int i=0;i<old.length;i++){
            if(old[i]==target){
                index=i;
                found=true;
                break;
            }
        }
        if(found){
            System.out.println(target+"is found at index "+index);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
