/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import app.InsertMoney;
import app.Machine;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author Brenton
 */
public class CoinTests {
    public static InsertMoney CoinExchange = new InsertMoney();
    
    public void InputIsValidOn5(){
      assertTrue(Machine.AcceptCoin(5,CoinExchange));
      
    }
}
