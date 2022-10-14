import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {
        BankAccount playerAccount = new BankAccount(1000);
        BankAccount casinoAccount = new BankAccount(100000);
        int predictedValue, actualValue;
        double bet;
        String choice = "no";
        Scanner in = new Scanner(System.in);

        do{
            do{
                System.out.println("il valore del dato:");
                predictedValue= in.nextInt();
                in.nextLine();
                if(predictedValue<1||predictedValue>6){
                    System.out.println("Il valore inserito non è valido!!");
                }
            }while(predictedValue<1||predictedValue>6);
            do {
                System.out.println("Quanto si vuole scommettere?");
                bet=in.nextDouble();
                in.nextLine();
                if(playerAccount.getBalance()<bet||casinoAccount.getBalance()<bet*5){
                    System.out.println("Scommessa non valida!!");
                }
            }while(playerAccount.getBalance()<bet||casinoAccount.getBalance()<bet*5);

            Random rnd=new Random();
            actualValue=rnd.nextInt(1,7);
            System.out.println("Il valore del dado restituito è: "+actualValue);

            if(predictedValue==actualValue){

            }else{

            }

        }while(choice.equals("si")&&playerAccount.getBalance()>0);

        System.out.println("Il tuo saldo è " + playerAccount.getBalance());

    }
}