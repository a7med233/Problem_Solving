import java.util.*;

public class CentauriPrime {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //the number of the counties which will be provided
        int n = Integer.parseInt(sc.nextLine());

        for(int i = 1; i <= n; i++){
            String country = sc.nextLine();
            char lastLetter = country.charAt(country.length() - 1);

            if (lastLetter == 'y'){
                //ruler is nobody
                System.out.println("Case #" + i + ":" + country +
                        " is ruled by nobody");

            } else if (lastLetter == 'a' || lastLetter == 'e' ||
                    lastLetter == 'o' || lastLetter == 'u' ||
                    lastLetter == 'i') {
                //ruler is a queen
                System.out.println("Case #" + i + ":" + country +
                        " is ruled by a queen");
            }
            else {
                //ruler is a king
                System.out.println("Case #" + i + ":" + country +
                        " is ruled by a king");
            }
        }
    }
}
