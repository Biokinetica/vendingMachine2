/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import app.InsertMoney;
import app.Machine;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Brenton
 */
public class CoinTests {
    public static InsertMoney CoinExchange = new InsertMoney();
    boolean Chosen;
    @Before
              public void SetUp(){
                  Chosen = false;
                  CoinExchange.setCoin(0);
                  CoinExchange.setMoney(0);
              }
    @Test
    public void InputIsValidOn5(){
      assertTrue(Machine.AcceptCoin(5,CoinExchange));
      
    }
}
