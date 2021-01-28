import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Card {
    private String faceName;
    private String suit;

    /**
     * this is constructor that will take 2 arguments
     */

    public Card(String faceName, String suit)
    {
        setFaceName(faceName);
        setSuit(suit);
    }

    public String getFaceName() {
        return faceName;
    }

    public static List<String> faceNamesList()
    {
        return Arrays.asList("two","three","four","five","six","seven","eight",
                "nine","ten","jack","queen","king","ace");

    }
    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();
         List<String> faceNames = faceNamesList();

        if (faceNames.contains(faceName)) {
            this.faceName = faceName;
        }
        else {
            throw new IllegalArgumentException(faceName + " is not valid, use " + faceNames);
        }

        this.faceName = faceName;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        suit = suit.toLowerCase();
        List<String> validSuits = Arrays.asList("hearts","diamonds","spades","clubs");
        if (validSuits.contains(suit)) {// this performs a case sensitive comparison
            this.suit = suit;
        }
        else {
            throw new IllegalArgumentException(suit + " is not valid.  Use one of " + validSuits);
        }
    }

    public String toString()
    {
        return faceName + " of " + suit;
    }

    public String cardColour()
    {
        if(suit.equals("spades") || suit.equals("clubs"))
        {
            return "black";
        }
        else
        {
            return "red";
        }
    }

    public int faceValue()
    {
        return faceNamesList().indexOf(faceName)+2;
    }
}
