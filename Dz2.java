import java.util.Arrays;

public class Dz2 {
    public static void main(String[] args) {
        int [] masiv = {11, 3, 14, 16, 7};
 
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < masiv.length-1; i++) {
                if(masiv[i] > masiv[i+1]){
                    isSorted = false;
 
                    buf = masiv[i];
                    masiv[i] = masiv[i+1];
                    masiv[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(masiv));
    }
}
