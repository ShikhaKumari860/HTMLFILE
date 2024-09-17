import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter target element");
        int x = sc.nextInt();

        System.out.print("enter size of array");
        int n = sc.nextInt();

       int[] arr = new int[n];
       System.out.print("enter the element in array");
         
       for(int i=0; i<n; i++)
       arr[i] = sc.nextInt();
    
    
   
    boolean flag = false; // false means not found
    for(int i=0;i<n;i++){
    if(arr[i]==x)
    {
    flag = true; // true means found
    break;

}
}

if(flag==true)

System.out.print("element found");
else 
System.out.print("element not found");

}
}