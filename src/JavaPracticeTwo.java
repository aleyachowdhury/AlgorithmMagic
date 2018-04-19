import java.util.Scanner;

public class JavaPracticeTwo {

    //Just the positives
    public void positiveNumber(int[] posArray) {
        for (int i = 0; i < posArray.length; i++) {
            if (posArray[i] > 0) {
                System.out.print(posArray[i] + " ");
            }
        }

    }

    //Just the Evens
    public void evenNUmbers(int[] evenArray) {
        for (int i = 2; i < evenArray.length; i++) {
            if (evenArray[i] % 2 == 0) {
                System.out.print(evenArray[i] + " ");
            }
        }

    }

    //Square the Numbers
    public void squareNumbers(int[] sqrNumber) {
        for (int i = 0; i < sqrNumber.length; i++) {
            System.out.print(sqrNumber[i] * sqrNumber[i] + " ");
        }
    }

    //Str Multiply
    public void stringMultiply(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(str);

        }
    }

    //Palindrome
    public static String reverse(String str) {
        if (str == null) {
            return str;
        }
        else if (str.length() == 1) {
            return str;
        } else {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        JavaPracticeTwo javaPracticeTwo = new JavaPracticeTwo();
        //Just the positives
//        int [] scenario1 = {1, -3, 5, -3, 0};
//        int [] scenario2 = {1, 2, 3};
//        int [] scenario3 = {-1, -2, -3};
//        javaPracticeTwo.positiveNumber(scenario1);
//        System.out.println();
//        javaPracticeTwo.positiveNumber(scenario2);
//        System.out.println();
//        javaPracticeTwo.positiveNumber(scenario3);

        //Just the Evens

//        int [] scenario1 = {1, -8, 4, -3, 6, 9};
//        int [] scenario2 = {1, 2, 3, 4, 5, 6 ,7, 8};
//        int [] scenario3 = {-1, -3, 5, 7, 9, -11};
//
//        javaPracticeTwo.evenNUmbers(scenario1);
//        System.out.println();
//        javaPracticeTwo.evenNUmbers(scenario2);
//        System.out.println();
//        javaPracticeTwo.evenNUmbers(scenario3);

        //Square the Numbers
//        int [] scenario1 = {2, 4, 8};
//        int [] scenario2 = {3, 9, 6};
//        javaPracticeTwo.squareNumbers(scenario1);
//        System.out.println();
//        javaPracticeTwo.squareNumbers(scenario2);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter number of array");
//        int [] array = new int[3];
//        for(int i=0; i<array.length; i++){
//            array[i]=sc.nextInt();
//
//        }
//        javaPracticeTwo.squareNumbers(array);

        //Str Multiply
        //javaPracticeTwo.stringMultiply("abc", 5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter string:");
        String str = sc.nextLine();

            System.out.println(javaPracticeTwo.reverse(str));
                if(str.equals(reverse(str))){
                    System.out.println("Palindrome");
                }
                else {
                    System.out.println("Not Palindrome");
                }
    }
}