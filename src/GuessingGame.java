import java.util.Scanner;

public class GuessingGame {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int randomAnswer = (int)(Math.random()*100);
        boolean flag =false;
        System.out.println("Answer is "+ randomAnswer);

        do{
            System.out.println("Enter a number between 1 and 100");

            int response = scanner.nextInt();
            if(response == randomAnswer){
                System.out.println("Congratulations you guessed right");
                System.out.println("Loop will now exit");
                flag = true;
            }else{
                System.out.println("Sorry wrong guess try again");
            }
        }while(!flag);
    }
}
