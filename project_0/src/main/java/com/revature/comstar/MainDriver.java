package com.revature.comstar;

import com.revature.comstar.models.Financials;
import com.revature.comstar.models.Transactions;
import com.revature.comstar.models.UserInformation;
import com.revature.comstar.services.FinancialServices;
import com.revature.comstar.services.TransactionServices;
import com.revature.comstar.services.UserServices;

import java.io.*;
import java.util.List;

public class MainDriver {

    public static void main(String[] args) {

        UserServices userServices = new UserServices();
        UserInformation newUser = new UserInformation("John", "Smith", "JSmith", "password", "JSmith@mail.com");
        userServices.create(newUser);

        List<UserInformation> users = userServices.findAll();
        for (UserInformation user:users) {
            System.out.println("from for loop for user information");
            System.out.println(user);

        }

        UserInformation updatedUser = new UserInformation("Alice", "Smith", "ASmith", "password2", "AS@mail.com");
        userServices.update(updatedUser);

        UserInformation userInfo = new UserInformation("John","Smith", "JSmith", "password3", "JSmith@mail.com");
        userServices.delete(String.valueOf(userInfo));

        FinancialServices financialServices = new FinancialServices();
        Financials userBalance = new Financials("JSmith", "$10,000", "$20,000");
        financialServices.create(userBalance);

        List<Financials> fusers = financialServices.findAll();
        for (Financials fuser:fusers) {
            System.out.println(("this is from the loop for financials"));
            System.out.println(fuser);
        }

        Financials newBalance = new Financials("JSmith", "10,000", "placeholder");
        financialServices.update(newBalance);

        Financials userFinances = new Financials("JSmith", "where", "money?");
        financialServices.delete(String.valueOf(userFinances));

        TransactionServices transactionServices = new TransactionServices();
        Transactions newTransaction = new Transactions("05-20-3052", "$20,000", 1);
        transactionServices.create(newTransaction);

        List<Transactions> tusers = transactionServices.findAll();
        for (Transactions tuser:tusers) {
            System.out.println("this is from the transaction loop");
            System.out.println(tuser);

        }

        Transactions updatedTransaction = new Transactions("05-4-2022", "$3.50",  1);
        transactionServices.update(updatedTransaction);

        Transactions rmvTransactions = new Transactions("10-10-2010", "$60.00", 2);
        transactionServices.delete(String.valueOf(rmvTransactions));



    }

}