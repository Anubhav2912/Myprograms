package Inheritence;

import java.util.Scanner;

public class TestEmployee {

    static long s;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary : ");
        s = sc.nextLong();

        BaseEmployee be = new BaseEmployee();
        BasePlusCommissionEmployee bce = new BasePlusCommissionEmployee();

        be.salary(s);

        bce.salary(s);

    }
}
