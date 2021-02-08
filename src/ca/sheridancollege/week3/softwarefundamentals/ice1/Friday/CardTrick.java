
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 * Yukun Chen
 * 991565733
 * @author leo
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card card1 = new Card("Hearts", 6);
       String suit1 = card1.getSuit();
       int value1 = card1.getValue();
       System.out.println(suit1 + value1);

    }
    
}
