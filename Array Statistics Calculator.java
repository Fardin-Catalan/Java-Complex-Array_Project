import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array:");
        int n=sc.nextInt();
        double[] old=new double[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a number:");
            old[i]=sc.nextDouble();
        }
        double max=0,min=0,sum=0,avg=0;
         max=old[0];
         min=old[0];
         int max_index=0;
         int min_index=0;
        for(int i=0;i<old.length;i++){
            for(int j=i+1;j<old.length;j++){
                if(old[j]>max){
                    max=old[j];
                    max_index=j;
                }
                if(old[j]<min){
                    min=old[j];
                    min_index=j;
                }
            }
                sum+=old[i];
            }
        avg=sum/n;
        System.out.println("Maximum element "+max+" found at index "+max_index);
        System.out.println("Minimum element "+min+" found at index "+min_index);
        System.out.println("Summation:"+sum);
        System.out.println("Average:"+avg);
    }
}           
