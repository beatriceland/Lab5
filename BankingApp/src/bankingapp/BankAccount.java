/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapp;

/**
 *
 * @author beland
 */
public class BankAccount implements Comparable<BankAccount>{
    
    final String name;
    final double balance;
    
    public BankAccount(String nm, double blnc) {
        name = nm;
        balance = blnc;
    }
    
    public String getName() {
        return name;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public int compareTo(BankAccount other) {
        if (balance < other.balance) return -1;
        if (balance > other.balance) return 1;
        return 0;
    }
    
}
