public class Return_and_Void {
    static int sum(int a, int b){
        int result = a + b;
        return result;
    }

    static void sum_2(int a, int b){
        int result = a + b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        // int result = sum(5,2);
        // System.out.println(result);

        int result = sum(5,2) + sum(3,1);
        sum_2(5,2);
        System.out.println(result);
    }
}
