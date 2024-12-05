package Inheritence.BillSystem;

import java.util.Scanner;

public class TestBill {

    public static int cost = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Press 1 to Buy vegetable or 2 to exit");
        int val = scan.nextInt();
        if(val == 1){
            Vegetable v = new Vegetable();
            v.veggies();
            v.bill(cost);
        } else if(val == 2){
            Payable p = new Payable();
            p.bill(cost);
        }

    }
}
