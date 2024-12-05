package Inheritence;

public class BasePlusCommissionEmployee extends BaseEmployee{
    @Override
    public void salary(long s) {
        if(0<s || s<75000){
            s = s * 3/2;
            System.out.println("Your new salary is "+s);

        }else if(75001<s || s<200001){
            s = s * 5/4;
            System.out.println("Your new salary is "+s);

        }else if(200001<s || s<500001){
            s = s * 23/20;
            System.out.println("Your new salary is "+s);

        } else{
            s = s * 21/20;
            System.out.println("Your new salary is "+s);
        }
    }
}
