
import java.util.Scanner;

class Addition {
    public static void main(String a[]) {
        int no1 = 0, no2 = 0, ans = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no=");
        no1 = sc.nextInt();

        System.out.println("Enter secind number=");
        no2 = sc.nextInt();
        ans = no1 + no2;

        System.out.println("Addition is:" + ans);
    }
}