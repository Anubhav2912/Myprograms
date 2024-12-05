package com.anu.learning.pla;
import java.util.*;
import java.lang.Math;

public class SegmentedSieve{
    public static void GetPrime(ArrayList<Integer> prime,int R){
        boolean[] c=new boolean[R+1];

        Arrays.fill(c,true);
        c[1]=false;
        c[0]=false;

        for(int i=2;(i*i)<=R;i++){
            if(c[i]==true){

                for(int j=i*i;j<=Math.sqrt(R);j=j+i){
                    c[j]=false;
                }
            }
        }

        for(int i=2;i*i<=R;i++){
            if(c[i]==true){
                prime.add(i);
            }
        }
    }
    public void segSieveProcess(int L,int R){
        int result = 0;
        ArrayList<Integer> chprime= new ArrayList<Integer>();
        GetPrime(chprime,R);

        boolean[] dummy=new boolean [R-L+1];
        //initialise all its elements as true
        Arrays.fill(dummy,true);
        for(int i:chprime){
            int low=(L/i);
            if(low<=1){
                low=i+i;
            }
            else if(L%i!=0){
                low=(low*i)+i;
            }
            else{
                low=(low*i);
            }
            for(int j=low;j<=R;j=j+i){
                dummy[j-L]=false;
            }
        }
        for(int i=L;i<=R;i++){
            if(dummy[i-L]==true){
                result = i;
            }
        }

        System.out.println("The largest prime number in this range is : " + result);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit : ");
        int L = sc.nextInt();
        System.out.println("Enter the Upper limit : ");
        int R = sc.nextInt();
        SegmentedSieve obj = new SegmentedSieve();
        obj.segSieveProcess(L,R);
    }
}

