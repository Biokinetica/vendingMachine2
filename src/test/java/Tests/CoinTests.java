/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import app.InsertMoney;
import app.Machine;
import static org.junit.Assert.assertFalse;
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
    int[] itemStock = {10,10,10};
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
    @Test
    public void InputIsValidOn10(){
        assertTrue(Machine.AcceptCoin(10,CoinExchange));
    }
    @Test
    public void InputIsValidOn25(){
        assertTrue(Machine.AcceptCoin(25,CoinExchange));
    }
    @Test
    public void InputIsInvalidOn23(){
        assertFalse(Machine.AcceptCoin(23,CoinExchange));
    }
    @Test
    public void ItemOneIsChosen(){
        CoinExchange.setCoin(100);
      assertTrue(Machine.ChooseItem(1,itemStock));
    }
}
