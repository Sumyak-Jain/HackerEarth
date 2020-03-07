import java.util.*; 
      
class  Divisibility
{ 
  
// Function that returns true if the 
// number formed by the last digits of 
// all the elements is divisible by 10 
static boolean isDivisible(int arr[], int a) 
{ 
    
    int lastDigit = arr[a - 1] % 10; 
  
    
    if (lastDigit == 0) 
        return true; 
  
    return false; 
} 

static public void main ( String []arg) 
{ 
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int arr[] = new int[a]; 
    for(int i=0;i<a;i++){
        arr[i]=sc.nextInt();
    }
  
    if (isDivisible(arr, a)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
