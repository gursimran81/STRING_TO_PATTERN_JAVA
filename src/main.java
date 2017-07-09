import java.util.Scanner;

/**
 * Created by gursimransingh on 06/07/17.
 */
public class main {
    public static void main(String[] args) {
        //INPUT STRING
        Scanner scanner = new Scanner(System.in);
       String inputTemp  = scanner.nextLine();
       //String inputTemp = "DJJGKHG HBMBEBIBFBF HBMBQDK HBMBTDH HBMBEBIBFBF HBNGKHG";
        String[] splittedString = (inputTemp.split("\\s"));
        //PRINTING STRING

        //Manipulating each String
        for (int i = 0; i <splittedString.length; i++) {
            int[] temp = new int[splittedString[i].length()];
            int sum=0;
            for (int j = 0; j <splittedString[i].length()  ; j++) {
                temp[j] = splittedString[i].charAt(j);
                temp[j]=temp[j]-64;
            }


            for (int k = 0; k <temp.length ; k++) {
                sum=sum+temp[k];
            }
            if (sum!=57){
                System.out.println("Invalid Input! Sum of ASCII values of Substrings!=57");
                break;
            }else {
                //HERE GOES THE PRINTING CODE(OUTPUT)
                for (int l = 0; l <temp.length ; l++) {
                    if (l%2==0){//EVEN INDEX
                        for (int m = 0; m <temp[l] ; m++) {
                            System.out.print(0);
                        }
                    }
                    else {
                        for (int m = 0; m <temp[l] ; m++) {
                            System.out.print("!");
                        }
                    }
                }
            }
            System.out.print("\n");

        }


    }
}
