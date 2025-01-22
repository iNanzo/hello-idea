import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("What is your favorite number?");
        //String name = scanner.nextLine();

        Double num = 0d;

        try{
            num = scanner.nextDouble();
        }catch(Exception e){
            System.out.println(num + " is not a number.");
            System.exit(0);
        }
        System.out.println("Cool! I like that favorite number is " + num);
    }//End Constructor
}//End Main
//Newton Hoang