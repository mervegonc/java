import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1;
        int conclusion=0;

        System.out.println("Please Enter number:");
        conclusion = scanner.nextInt();
        scanner.nextLine();

        for (;;){
            System.out.println(" Please Select The  Math Operation You Want To do");
            System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
            int option = scanner.nextInt();

            if (option == 1) {

            } else if (option == 2) {

            } else if (option == 3) {

            } else if (option == 4) {

            }else{
                System.out.println("You Entered Wrong Sign") ;
                continue;

            }

            System.out.println("Please Enter  number:");
            number1 = scanner.nextInt();
            scanner.nextLine();



            if (number1==0&& option==4){
                System.out.println("You Entered Wrong Sign");
                continue;
            }

                if (option == 1) {
                    conclusion +=  number1 ;
                } else if (option == 2) {
                    conclusion -=  number1 ;
                } else if (option == 3) {
                    conclusion *= number1 ;
                } else if (option == 4) {
                    conclusion /= number1 ;
                }else{

                }





                System.out.println("sonuç:"+conclusion);
                }

            }
}
