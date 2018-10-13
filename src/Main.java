import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luongThang = 0, heSoLuong = 0, namLamViec = 0;
        boolean isHSLLesserThan1, isHSLGreaterThan5, isYearLesserThan0;
        boolean isContinue = true;

        do {
            do{
                System.out.print("\nNhap he so luong: ");
                heSoLuong = scanner.nextInt();
                isHSLLesserThan1 = heSoLuong < 1;
                isHSLGreaterThan5 = heSoLuong > 5;
                if(isHSLLesserThan1 || isHSLGreaterThan5){
                    System.out.print("\nHe so luong khong hop le!! ");
                }
            }while (isHSLLesserThan1||isHSLGreaterThan5);

            do{
                System.out.print("Nhap he so nam lam viec: ");
                namLamViec = scanner.nextInt();
                isYearLesserThan0 = namLamViec<0;
                if(isYearLesserThan0){
                    System.out.print("\nGia tri nam lam viec khong hop le!! ");
                }
            }while (isYearLesserThan0);

            luongThang = heSoLuong*4000000 + namLamViec*500000;

            System.out.printf("Luong thang %d", luongThang);

            System.out.print("\nCon muon tiep tuc? (y/n)");
            String str = scanner.next();

            if(str.equals("n")){
                isContinue = false;
            }
        }while (isContinue);

    }
}
