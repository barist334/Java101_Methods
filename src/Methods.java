public class Methods {

    static int power(int base, int exp){
        int result = 1;
        for (int i = 1; i <= exp; i++){
            result *= base;
        }
        return result;
    }

    static void helloWorld(){
        System.out.println("Merhaba Dünya!");
    }


    public static void main(String[] args) {
        // f(x) = 2x+5
        // f(6) = 2*6 + 5 = 17
        int number1 = 2, number2 = 3;
        // int case1 = power(2,3);
        int case1 = power(number1,number2);
        System.out.println("Result: " + case1);
        System.out.println(power(4,2));
        helloWorld();
    }

}
