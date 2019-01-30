import java.sql.SQLOutput;

public class MyMath {

    public static int smallestThreeNums(int x, int y, int z){
        int smallest;
        if(x < y)
            smallest = x;
        else
            smallest = y;
        if(z < smallest)
            smallest = z;

        return smallest;
    }


    public static int powerUp(int x, int y){
        int result = 1;
        for(int i = 0; i < y; i++){
            result = result * x;

        }
        return result;
    }

    public static int sumNums(int x){
        int i, result=1;
        int number = x;
        for(i = 1; i<=number; i++){
            result = result*i;
        }
        return result;
    }

    public static boolean isPrime(int x){

        boolean prime;
        //if x%2 != 0 number is not prime

        if(x == 1 || x == 0){
            prime = false;
        }else if(x%2 != 0){
            prime = true;
        }else{
            prime = false;
        }
        return prime;
    }

}
