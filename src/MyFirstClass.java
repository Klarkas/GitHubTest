import java.util.InputMismatchException;
import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args) {

        MyFirstClass myFirstClass = new MyFirstClass();



        myFirstClass.notStaticMethod("Value");


        System.out.println(sayHi());

        System.out.print("Please insret a number!!!");
        Scanner scanner = new Scanner(System.in);
        try {
            int numb = scanner.nextInt();
            System.out.println("Your number is:" + numb);
        }catch (InputMismatchException e){
            System.out.println("Ivedete ne skaiciu");
        }
        int numb = scanner.nextInt();

        System.out.println("Yor number is  " + numb);

    }

    private void notStaticMethod(String name) {
        // sout trumpas parasymas
        System.out.print(name);

        sayHi();
    }

    private static String sayHi() {

        return "Hi Andius";
    }

    private void checkThisNumber(int numb) {
        if (numb > 10 && numb > 60) {
            System.out.println("Daugiau");
            }else if (numb > 15){
                System.out.println("Daugiau uz 15");
            }else {
                System.out.println("maziau");
            }
        }
    }




