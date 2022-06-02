public class MethodOverloading {
    static void print(){

        System.out.println("Parametresiz Metod");
    }

    static void print(int a){
        System.out.println("Parametreler : " + a);
    }

    static void print(double a){
        System.out.println("Parametreler : " + a);
    }

    static int print(int a, int b){
        return a+b;
    }

    static int print(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        print();
        print(2);
        print(12.0);
        System.out.println(print(2,3));
        System.out.println(print(2,3,4));
    }
}
