import java.util.*;

public class matrixchainmultiplication {
    
    static int matrix(int arr[],int n){
        int arr1[][]=new int[n][n];
        for(int i=1;i<n;i++){
              arr1[i][i]=0;
        }
        for(int l=2;l<n;l++){
          for(int i=1;i<n-l+1;i++){
             int j=i+l-1;
              if(j==n)
                continue;
              arr1[i][j]=Integer.MAX_VALUE;
              for(int k=i;k<=j-1;k++){
                  int q=arr1[i][k]+arr1[k+1][j]+arr[i-1]*arr[k]*arr[j];
                  if(q<arr1[i][j]){
                      arr1[i][j]=q;
                  }
              }
          }
        }
        return arr1[1][n-1];
     }
      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter The Size:");
          int n=sc.nextInt();
          System.out.println("Enter The Array Elements:");
          int arr[]=new int[n];
          for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
          }
          sc.close();
          System.out.println("Minimum Number Of Multiplication is:"+matrix(arr,n));
    }
  

}
