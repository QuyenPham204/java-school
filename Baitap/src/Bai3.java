import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[] A = new int[10];
       int c;
       for(int i=0;i<10;i++){
           System.out.println("Nhập phần tử A["+i+"] :");
           A[i] = sc.nextInt();
       }
       for (int i=0;i<10;i++){
           for(int j=i+1;j<10;j++){
               if(A[i]<A[j]){
                   c = A[i];
                   A[i]=A[j];
                   A[j]=c;
               }
           }
       }
        System.out.print("Chuỗi sau khi được sắp xếp : " );
       for(int i=0;i<10;i++){
           System.out.print(A[i]+ " ");
       }
    }
}
