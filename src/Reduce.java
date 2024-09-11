public class Reduce {

    public static void main(String[] args) {
        // variables
        int n = 100;
        int stepCounter = 0;

        //  * check if n is even or not even
        while (!(n == 0)) {
            boolean nIsEven = n % 2 == 0;
            //  if n is even:
            if (nIsEven) {
            //      yes, divide n by 2 and increment stepCounter
                n = n / 2;
                stepCounter++;
            }
            else {
            //      no, subtract 1 from n and increment stepCounter
                n--;
                stepCounter++;
            }
            //          go back to *
        }
        System.out.println(stepCounter);
    }
}
