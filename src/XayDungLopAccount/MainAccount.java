package XayDungLopAccount;

import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {

        Account ac = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền muốn rút: ");
        double tien_rut = sc.nextDouble();
        System.out.print("Số tiền bạn muốn gửi thêm là: ");
        double tien_gui = sc.nextDouble();
        ac.setId(1122);
        ac.setBalance(20000);
        ac.setAnnualInterestRate(4.5);

        System.out.println("Số dư tài khoản hiện tại của bạn là: " + (ac.getBalance() - tien_rut + tien_gui));
        System.out.println("Số tiền lãi hàng tháng bạn nhận được là: " + ac.tien_lai());
        System.out.println("Số tiền bạn định rút từ tiền lãi hàng tháng là: " + ac.withdraw(tien_rut));
        System.out.println("Số tiền bạn muốn gửi thêm là: " + ac.deposit(tien_gui));
    }
}
