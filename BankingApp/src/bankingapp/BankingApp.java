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
public class BankingApp {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BankSystem bs = new BankSystem();
        bs.allAccounts.add(new BankAccount("Alexandra", 3005.42));
        bs.allAccounts.add(new BankAccount("Douglas", 7650.39));
        bs.allAccounts.add(new BankAccount("Carson", 5512.75));
        bs.allAccounts.add(new BankAccount("Beatrice", 1143.98));
        
        System.out.println("Original List\n");
        for (BankAccount b : bs.allAccounts)
            System.out.println(b.getName() + ": " + b.getBalance());      
     
        Collections.sort(bs.allAccounts, bs.createComparatorByBalance(true)); 
 
      System.out.println("\nSorted by Balance: Ascending\n");      
      for (BankAccount b : bs.allAccounts)
            System.out.println(b.getName() + ": " + b.getBalance()); 
      
    }
    
}
