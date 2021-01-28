import java.util.Scanner;

public class CardExperiment {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);

        Card aceOfSpades = new Card("Ace","Spades");

        //aceOfSpades.setSuit("harts");
        //aceOfSpades.setFaceName("two");


        System.out.println(aceOfSpades);
        System.out.println(aceOfSpades+" is a "+aceOfSpades.cardColour()+" card");
        System.out.println("and the face value is "+aceOfSpades.faceValue());
    }
}
