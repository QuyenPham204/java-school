import java.math.BigInteger;

public class Bai4 {
    public static void main(String[] args) {
//        BigInteger f1= BigInteger.ONE;
//        BigInteger f2= BigInteger.ONE;
//        BigInteger f3;
        int f1=1;
        int f2=1;
        int f3;

        System.out.print("Dãy Fibonacci : "+ f1+" "+f2);
        for(int i=2;i<100;i++){
//            f3=f1.add(f2);
            f3=f1+f2;
            System.out.print(" "+ f3);
            f1=f2;
            f2=f3;
        }
    }
}
