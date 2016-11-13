package module2.assignment_2_2;
import java.util.Scanner;
/**
 * Created by merkulovvs on 11/13/2016.
 */
public class WithdrawMoney {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double balance = 100.0;
        System.out.println("Please, enter the withdrawal amount: ");
        Double withdrawal = in.nextDouble();
        Boolean positiveBalance = checkBalance(balance, withdrawal);
        balance = withdrawMoney(balance, withdrawal);
        if(positiveBalance == true){
            System.out.print("OK 0.5 "+balance);
        }else{
            System.out.print("NO");
        }
    }

    private static Boolean checkBalance(Double balance, Double withdrawal) {
        if(withdrawal*1.05<balance) {
            return true;
        }
        else{
            return false;
        }

    }

    private static Double withdrawMoney(Double balance, Double withdraw) {
        balance -= withdraw*1.05;
        return balance;
    }




}
