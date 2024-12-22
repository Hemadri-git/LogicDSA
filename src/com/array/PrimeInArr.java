package com.array;

public class PrimeInArr
{
    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int[] arr =  {2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Prime Numbers are: ");
        for (int num : arr){
            if (isPrime(num)){
                System.out.print(num+ " ");
            }
        }
    }
}
