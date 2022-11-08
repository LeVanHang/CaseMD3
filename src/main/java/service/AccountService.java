package service;


import dao.CRUD_Account;

import models.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    public static List<Account> accounts = CRUD_Account.getAllAccount();

    public static void addAccount(Account account){
        accounts.add(account);
        CRUD_Account.saveAccount(account);
    }


}