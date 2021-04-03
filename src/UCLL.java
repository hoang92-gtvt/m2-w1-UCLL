import java.util.Scanner;

public class UCLL {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Nhập số thứ nhất");
        int number1= input.nextInt();
        System.out.println("Nhập số thứ hai");
        int number2= input.nextInt();
        boolean check=true;
        int number3;
        if(number1<number2){
            number3=number1;
        }else number3=number2;

        if(number1==0 || number2==0){
            System.out.println("Hai số không có ước chung");

        }else if(number1==number2){
            System.out.println("Hai số cùng ước chung là " + number1);
        }
        else{
            while(check){
                if (number1%number3==0 && number2%number3==0 ){
                    check=false;
                    break;
                }
                number3--;
            }
            System.out.println("Ước chung lớn nhất của 2 số là "+ number3);
        }

    }
}
