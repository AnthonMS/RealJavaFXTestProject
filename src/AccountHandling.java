/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Anthon Steiness
 */
public class AccountHandling
{
    private static AccountHandling accHandling = new AccountHandling();
    private final ArrayList<Account> accArray = new ArrayList<>();
    
    
    private AccountHandling()
    {
        init();
    }
    
    
    
    public static AccountHandling getInstance()
    {
        return accHandling;
    }
    
    
    
    
    public void addAccount(Account acc)
    {
        accArray.add(acc);
    }
    
    
    
    public Account removeAccount(int id)
    {
        for (int i = 0; i < accArray.size(); i++)
        {
            Account acc = accArray.get(i);
            if (id == acc.getId())
            {
                accArray.remove(acc);
                return acc;
            }
        }
        return null;
    }
    
    
    
    public Account getAcc(int id)
    {
        for (int i = 0; i < accArray.size(); i++)
        {
            Account acc = accArray.get(i);
            if (id == acc.getId())
            {
                return acc;
            }
        }
        return null;
    }
    
    
    
    private void init()
    {
        accArray.add(new Account("Anthon", "Password123!", 3));
        accArray.add(new Account("Dennis", "SecurePass", 2));
        accArray.add(new Account("Admin", "Admin", 1));
    }

    
    public ArrayList<Account> getAccArray()
    {
        return accArray;
    }
    

    
}
