public class TestMyMath {
    public static void main(String[] args) {

        System.out.println("\nQuestion 1 Smallest Number:");

        int result = MyMath.smallestThreeNums(1, 3, 5);
        System.out.println(result); //expected 1
        result = MyMath.smallestThreeNums(12,10,13);
        System.out.println(result); //expected 10
        result = MyMath.smallestThreeNums(12,10,8);
        System.out.println(result); //expected 8
        result = MyMath.smallestThreeNums(0,0,0);
        System.out.println(result); //expected 8

        System.out.println("\nQuestion 2 Powers:");

        result = MyMath.powerUp(2,2);
        System.out.println(result); //expected 4
        result = MyMath.powerUp(5,3);
        System.out.println(result); //expected 125
        result = MyMath.powerUp(4,2);
        System.out.println(result); //expected 16
        result = MyMath.powerUp(0,2);
        System.out.println(result); //expected 0
        result = MyMath.powerUp(2,0);
        System.out.println(result); //expected 1

        System.out.println("\nQuestion 3 Sums:");

        result = MyMath.sumNums(3);
        System.out.println(result); //expected 6
        result = MyMath.sumNums(5);
        System.out.println(result); //expected 120
        result = MyMath.sumNums(8);
        System.out.println(result); //expected 4032
        result = MyMath.sumNums(1);
        System.out.println(result); //expected 4032

        System.out.println("\nQuestion 5 prime:");

        boolean newResult = MyMath.isPrime(3);
        System.out.println(newResult); //expected true
        newResult = MyMath.isPrime(4);
        System.out.println(newResult);//expected false
        newResult = MyMath.isPrime(0);
        System.out.println(newResult);//expected false
        newResult = MyMath.isPrime(1);
        System.out.println(newResult);//expected false
        newResult = MyMath.isPrime(31);
        System.out.println(newResult);//expected true


    }
}
