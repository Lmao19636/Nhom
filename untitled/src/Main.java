import java.util.Scanner;
lớp công khai c4_1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a=-1;
    trong khi (a < 0) {
        System.out.print("Nhap gia tri: ");
        a = sc.nextInt();
    }
    int tong=0;
    for (int i = 1 ; i<= a; i++)
    {
        System.out.println("Gia tri thu " + i + ://: + a);
        lưỡi ± a;
    }
    System.out.println("Tong la: " + tong);
}
}