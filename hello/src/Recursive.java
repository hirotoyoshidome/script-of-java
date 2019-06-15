public class Recursive {
    public static void main(String args[]){
        int in = 5;
        System.out.println(rec(in));
    }

    /**
     * 簡単な再起処理
     * @param i
     * @return
     */
    private static int rec(int i){
        if(i <= 0) {
            return i;
        }
        return i + rec(i - 1);
    }
}
