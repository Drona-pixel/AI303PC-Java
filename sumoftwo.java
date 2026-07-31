import java.util.Scanner;
import java.util.Arrays;
class sumoftwo{

     public static void main(String...args){
        int n=0;
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter size of array");
        n = sn.nextInt();
        int [] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sn.nextInt();
        }
        System.out.println("enter the target");
        int ta = sn.nextInt();
        sumoftwo(num,ta);
    }
    public static void sumoftwo(int [] nums,int target){
        int [] arr=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
   
}
