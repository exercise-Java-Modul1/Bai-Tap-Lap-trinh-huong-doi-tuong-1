package XayDungLopAccount;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    private double money;
    private double tien_rut;

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }


    public double getMonthlyInterestRate() {
        double monthlyInterestRate = this.getAnnualInterestRate() / 12;
        return monthlyInterestRate;
    }

    public double withdraw(double tien_rut) {
        this.tien_rut = tien_rut;
        return tien_rut;
    }

    public double deposit(double money) {
        this.money = money;
        return money;
    }

    public double tien_lai() {
        double tien_lai = this.getBalance() * this.getMonthlyInterestRate();
        return tien_lai;
    }
}
