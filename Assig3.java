
public class Assig3 
{

   public static void main(String[] args) 
   {
      
   }

}

class Card
{
   public enum Suit 
   {
      clubs, diamonds, hearts, spades
   }
   
   private char value;
   private Suit suit;
   private boolean errorFlag;
   
   public Card() 
   {
      
   }
   
   public Card(char value, Suit suit) 
   {
      
   }
   
   public string toString()
   {
      
   }
   
   public boolean set(char value, Suit suit)
   {
      
   }
   
   public Suit getSuit()
   {
      
   }
   
   public Suit getValue()
   {
      
   }
   
   public Suit getErrorFlag()
   {
      
   }
   
   public boolean equals(Card card)
   {
      
   }
   
   private boolean isValid(char value, Suit suit)
   {
      
   }
}

class Hand
{
   final static int MAX_CARDS = 50;
   
   private Card[] myCards;
   private int numCards;
   
   public Hand(){}
   
   public void resetHand() 
   {
      
   }
   
   public boolean takeCard(Card card)
   {
      
   }
   
   public Card playCard() 
   {
      
   }
   
   public String toString()
   {
      
   }
   
   public getNumCards()
   {
      
   }
   
   public Card inspectCard(int k) 
   {
      
   }
}

class Deck
{
   public final static int MAX_CARDS = 6*52;
   
   private static Card[] masterPack;   
   private Card[] cards;
   private int topCard;
   
   public Deck()
   {
      
   }
   
   public Deck(int numPacks)
   {
      
   }
   
   public void init(int numPacks)
   {
      
   }
   
   public void shuffle() 
   {
      
   }
   
   public Card dealCard()
   {
      
   }
   
   public int getTopCard()
   {
      
   }
   
   public Card inspectCard(int k)
   {
      
   }
   
   private static void allocateMasterPack()
   {
      
   }
}
