package Inheritence.BillSystem;

import java.util.Scanner;

public class Payable {
    public void bill(int cost){
        System.out.println("Your total cost is : "+cost);
    }
}

class Vegetable extends Payable{
    int choice, veg, q;
    public void veggies(){
        System.out.println("Select vegetables \n");
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("1 for Potato\n2 for Onion\n3 for Tomatoes\n4 for cucumbers\n");
        System.out.println("5 for Spinach\n6 for Capsicum");
        choice = sc.nextInt();
        System.out.println("Enter quantity in kg : ");
        q = s.nextInt();

        if(choice == 1 || choice == 4){
            veg = 50 * q;
        } else if(choice == 2 || choice == 3){
            veg = 30 * q;
        } else if(choice == 6 || choice == 5){
            veg = 40 * q;
        } else{
            System.out.println("Wrong item selected");
        }

    }
    @Override
    public void bill(int cost){
        System.out.println("Your total cost is : "+(cost + veg));
    }
}
