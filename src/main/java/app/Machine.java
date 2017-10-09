package app;

import java.util.Scanner;

public class Machine {
    /**
     * @param args the command line arguments
     */
    public static InsertMoney CoinExchange = new InsertMoney();
    public static boolean AcceptCoin(int moneyInserted, InsertMoney coin){
        if(moneyInserted == 10 || moneyInserted == 25 || moneyInserted == 5){
                    CoinExchange.setCoin(coin.getCoin() + moneyInserted);
                    System.out.println(moneyInserted + " cents inserted. " + coin.getCoin() + " total");
                    return true;
                }
                else
                    System.out.println("Not a valid coin.");
        return false;
    }
    public static void main(String[] args) {
        boolean Chosen = false;
        int[] itemStock = {10,10,10};
        Scanner read = new Scanner(System.in);
        
        
        while (!Chosen) {
            System.out.print("INSERT COIN (Type '5','10', or '25' without the quotes)"
                        + "\nChoose Cola for $1 by typing '1',"
                        + "\nChips for $0.50 by typing '2',"
                        + "\nCandy for $0.65 by typing '3'\n");
            
               
                    if(read.hasNext()){
                 CoinExchange.setMoney(Integer.parseInt(read.nextLine()));
                    read.reset();
                    }
                
            if(CoinExchange.getMoney() != 0)
              AcceptCoin(CoinExchange.getMoney(),CoinExchange);
                
        }
    }
}
