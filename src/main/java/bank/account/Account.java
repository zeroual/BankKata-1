package bank.account;

import bank.transaction.Transaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Account {

    private Client client;

    private List<Transaction> transactions;

    public Account(Client client) {
        this.transactions = new ArrayList<>();
        this.client = client;
    }

    private Account(Client client, List<Transaction> transactions) {
        this.transactions = transactions;
        this.client = client;
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return Collections.unmodifiableList(this.transactions);
    }

    public Account copy() {
        return new Account(this.client, this.transactions);
    }

}
