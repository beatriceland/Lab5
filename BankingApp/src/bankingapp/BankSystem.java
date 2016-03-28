/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapp;
import java.util.*;
/**
 *
 * @author beland
 */
public class BankSystem {
    
    public static Comparator<BankAccount> createComparatorByName(final boolean increasing) {
        int direction;
        if (increasing) direction = 1;
        else direction = -1;
        return new Comparator<BankAccount>() {
            public int compare(BankAccount acct1, BankAccount acct2) {
                return direction * acct1.getName().compareTo(acct2.getName());
            }
        };
    }
    
    public static Comparator<BankAccount> createComparatorByBalance(final boolean increasing) 
           {
               return new Comparator<BankAccount>() {
                   public int compare(BankAccount acct1, BankAccount acct2) {
                       if (increasing) 
                           return acct1.compareTo(acct2);
                       else 
                           return -1 * acct1.compareTo(acct2);
                   }
               };
           }
    
    public int compare(BankAccount acct1, BankAccount acct2) {
        return acct1.getName().compareTo(acct2.getName());
    }


    
    ArrayList<BankAccount> allAccounts = new ArrayList<BankAccount>();
    
}
