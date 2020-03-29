import java.util.Scanner;
public  class rajan{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=((2*a)+1);
        int arr[]=new int[b];
        for(int i=0;i<b;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<b;j++){
            int count=0;
            for(int k=0;k<b;k++){
                if(arr[j]==arr[k])
                    count++;
            }
            if((count % 2) != 0)
                System.out.println(arr[j]);
        }
    }
}
