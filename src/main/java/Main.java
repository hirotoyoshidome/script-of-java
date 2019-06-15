/**
 * main class
 * 基本構文
 */
public class Main {
    /**
     * main exec
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int i = 3;
        if(i == 3){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        for(int j = 0; j < 5; j++){
            System.out.println(j);
        }
        int k = 0;
        while(true){
            System.out.println("aa");
            k++;
            if(k == 2){
                break;
            }
        }

        System.out.println(add(1, 4));
    }

    /**
     * private method add
     * @param a
     * @param b
     * @return
     */
    private static int add(int a, int b){
        return a + b;
    }

}
