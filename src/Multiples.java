public class Multiples {
    public static void main(String[] args) {
        int multipleOf3or5 = 0;
        int i = 1;
        while (i < 1000) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3 && divisibleBy5) {
                multipleOf3or5++;
                i++;
            } else if (divisibleBy3 || divisibleBy5) {
                multipleOf3or5++;
                i++;
            } else {
                i++;
            }
        }
        System.out.println(multipleOf3or5);

    }

}
