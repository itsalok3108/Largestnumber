import java.util.Scanner;

public class Method_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int max1= Math.max(a,b);
        int max2= Math.max(max1,c);

        System.out.println(max2);
        //Or
        System.out.println(Math.max(c,Math.max(a,b)));
    }
}
