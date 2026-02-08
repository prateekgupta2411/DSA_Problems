package Basics;

import java.util.Scanner;

public class ArmStrong_Number {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
            Long n = sc.nextLong();
            System.out.println(isArm(n));
    }
    public static boolean isArm(Long n){
        int d = countOfDigit(n);
        int sum = 0;
        while (n>0){
            long rem = n % 10;
            sum += (int)Math.pow(rem,d);
            n = n/10;
        }
        if(n == sum){
            return true;
        } return false;
    }
    public static int countOfDigit(Long n){
        int count  = 0;
        while (n>0){
            count++;
            n /= 10;
        }
        return count;
    }
}
