public class Main {
    public static void main(String[] args) {
        int primeNumber = 11;
        boolean result = true;
        if(primeNumber == 0 || primeNumber == 1){
            result = false;
        }else{
            for (int i = 2; i <= primeNumber / 2; i++) {
                if (primeNumber % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}