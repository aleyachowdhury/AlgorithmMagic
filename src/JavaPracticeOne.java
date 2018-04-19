import java.util.ArrayList;

public class JavaPracticeOne {

    //Sum the numbers
    public static int sumNumber(int sumarray[]) {
        int sum = 0;

        for (int i = 0; i < sumarray.length; i++) {
            sum += sumarray[i];

        }
        return sum;
    }
    //Product
    public static int productNumber(int productarray[]) {
        int product = 1;

//        for (int i =0; i<productarray.length;i++){
//            product  = product*productarray[i];
//
//        }
        for (int i : productarray) {
            product = product * i;
        }
        return product;
    }
   //Find the factorial !
    public static int factNumber(int fact) {
        int res = 1;

        for (int i = 2; i <= fact; i++) {
            res = res * i;
            System.out.println(res);
        }


        return res;
    }
   //Filtering
    public static ArrayList<Integer> arrayListMethod() {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 1; i < 1001; i++) {

            arrayList.add(i);
        }
        return arrayList;
    }

    public static ArrayList<Integer> arrayListFilter(ArrayList<Integer> arrayList) {

        ArrayList<Integer> updatedArraylist = new ArrayList<>();
        for (int i = 1; i < 30; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0)
                updatedArraylist.add(i);

        }
        return updatedArraylist;
    }
   //Print a Square
    public static void printSquare() {
        int num = 0;
        for (int i = 4; i >= 1; i--) {
            num = 0;
            for (int j = 1; j <= i; j++) {
                num++;
                System.out.print(num);
            }
            System.out.println();
        }
    }
    //Acronym
    public static void acronym(String[] acronymArray) {

        for (int i = 0; i < acronymArray.length; i++) {
            System.out.print(acronymArray[i].toUpperCase().charAt(0));
        }
        //return acronymString;
    }

    //ThreeInARow
    public static void ThreeInRow(String[] sArray) {
//        sArray = new String[3];
            if (sArray[0].equals(sArray[1]) && sArray[1].equals(sArray[2])) {
                System.out.println(sArray[0]);


            } else {
                System.out.println("None");
            }
        }

//Alphabetical Order Sorting
        public static  void alphabeticOrder(String s) {
            char[] chArray = s.toCharArray();
//            String result=" " ;
            char temp =0;
            for (int i = 0; i <chArray.length; i++) {
                for (int j = 0; j < chArray.length; j++) {
                    if (chArray[j]>chArray[i]) {
                         temp = chArray[i];
                        chArray[i] = chArray[j];
                        chArray[j]=temp;
                    }

                }

            }
            for(int k=0;k<chArray.length;k++){
                System.out.print(chArray[k]);
            }
        }
    //Tic Tac Toe
     public static  void ticToc(String [][] ticTocArray) {
        //ticTocArray = new String[3][3];
         for (int row = 0; row <3; row++) {
             for (int col = 0; col < 3; col++) {
                 if (ticTocArray[0][0].equals(ticTocArray[0][1]) && ticTocArray[0][1].equals(ticTocArray[0][2])) {
                     System.out.print(ticTocArray[0][0]);
                 }
                 else if (ticTocArray[1][0].equals(ticTocArray[1][1]) && ticTocArray[1][1].equals(ticTocArray[1][2])) {
                     System.out.print(ticTocArray[1][0]);
                 }
                 else if (ticTocArray[2][0].equals(ticTocArray[2][1]) && ticTocArray[2][1].equals(ticTocArray[2][2])) {
                     System.out.print(ticTocArray[2][0]);
                 }
                 else if (ticTocArray[0][0].equals(ticTocArray[1][1]) && ticTocArray[1][1].equals(ticTocArray[2][2])) {
                         System.out.print(ticTocArray[0][0]);
                 }
                 else if (ticTocArray[2][0].equals(ticTocArray[1][1]) && ticTocArray[1][1].equals(ticTocArray[0][2])) {
                     System.out.print(ticTocArray[2][0]);
                 }
                 else if (ticTocArray[0][1].equals(ticTocArray[1][1]) && ticTocArray[1][1].equals(ticTocArray[2][1])) {
                     System.out.print(ticTocArray[0][1]);
                 }
                 else {
                     System.out.print("none");
                 }

             }
         }
     }
     //test
    public static void main(String [] args){

        JavaPracticeOne pracArray= new JavaPracticeOne();
//        int [] array1= {1, 4, 8};
//        int [] array2= {3,4,5};
        //  System.out.println("sum :"+ pracArray.sumNumber(array1)); //sum
//        System.out.println("Product :"+ pracArray.productNumber(array2));  //product
       // String [] sArray ={"very", "important", "person"};
        // pracArray.acronym(sArray);  //acronym


//        String [] scenario1 = new String[]{"X","X","X"};
//        String [] scenario2 = new String[]{"O","O","O"};
//        String [] scenario3 = new String[]{"X","O","X"};
//        String [] scenario4 = new String[]{"X"," ","X"};
//        String [] scenario5 = new String[]{" "," ","X"};
                                                           //three in a row
//         pracArray.ThreeInRow(scenario1);
//         pracArray.ThreeInRow(scenario2);
//         pracArray.ThreeInRow(scenario3);
//         pracArray.ThreeInRow(scenario4);
//         pracArray.ThreeInRow(scenario5);

        //  ArrayList<Integer> arrayList = new ArrayList<>();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number");
//        int n=sc.nextInt();
//        System.out.println("factorial of " +n +" is: ");
        //pracArray.factNumber(n);  //factorial


       // System.out.println("Number in list :"+pracArray.arrayListMethod());    //filter

       // System.out.println(pracArray.arrayListFilter(arrayListMethod()));       //filter

       // pracArray.printSquare();   //printSquare

        //pracArray.alphabeticOrder("hello");  //alphabet sorting
        String [][] scenario1 = new String[][] { {"O", "O", "O"}, {"X", " ", "X"}, {" " , "X", " "}};
        String [][] scenario2 = new String[][] { {"O", "X", "O"}, {"O", "X", " "}, {" " ,"X" ," "}};
        String [][] scenario3 = new String[][] { {"O", "X", "O"}, { "O", "O", " "}, {" ","X","X"}};
       // pracArray.ticToc(scenario1);   //tic tac toe
        pracArray.ticToc(scenario2);
      //  pracArray.ticToc(scenario3);
    }


}
