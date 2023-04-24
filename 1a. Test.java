package THB1;
import java.util.Scanner;
public class Test {
    static Scanner sc = new Scanner(System.in);  
      static void nhapXe(Vehicle xe){
            System.out.print("Nhap loai xe: ");
            xe.setLoaiXe(sc.nextLine());sc.nextLine();
            System.out.print("Nhap ten chu xe: ");
            xe.setChuXe(sc.nextLine());
            System.out.print("Nhap dung tich xe: ");
            xe.setDungTich(sc.nextInt());
            System.out.print("Nhap tri gia xe: ");
            xe.setTriGia(sc.nextDouble());;sc.nextLine();
        }     
    public static void main(String[] args) {
        Vehicle v[]= null;
        int a,n=0;
        boolean flag = true;     
        do{
            System.out.println("Ban chon lam gi!!!");
            System.out.println("1.Tao cac đoi tuong xe va nhap thong tin \n"+
                    "2.Xuat bang ke khai tien thue cua cac xe.\n"+
                    "Nhap so khac đe thoat");
            a =sc.nextInt();
            switch (a){
                case 1:
                    System.out.print("Nhap so luong xe ban muon khai bao thue: ");
                    n=sc.nextInt();                 
                    v= new Vehicle[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Xe thu " + (i+1));
                        v[i] = new Vehicle();
                        nhapXe(v[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%5s %5s %10s %10s %8s \n","Loai xe","Chu xe","Dung tich","Tri gia","Thue");
                    for (int i = 0; i < n; i++) {
                        v[i].inThue();
                    }
                    break;
                default:
                    System.out.println("bye");
                    flag=false;
                    break;
            }
        }while (flag);
    }
}
