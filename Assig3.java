
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
   
   //Constructor sets card to default variables
   public Card() 
   {
      set('A', Suit.spades);
   }
   
   //Constructor sets card variables to user input
   public Card(char value, Suit suit) 
   {
      set(value, suit);
   }
   
   //Get card and error message strings ready to display depending on validity 
   public String toString()
   {
      if(errorFlag == true)
         return "** illegal **";
      else
         return getValue() + " " + "of" + " " + getSuit();
   }
   
   //Set values and return boolean depending on if card is valid
   public boolean set(char value, Suit suit)
   {
      if(isValid(value, suit))
      {
         this.value = value;
         this.suit = suit;
         errorFlag = false;
      }
      else
         errorFlag = true;
      
      return errorFlag; 
   }
   
   //Return suit
   public Suit getSuit()
   {
      return suit;
   }
   
   //Return value
   public char getValue()
   {
      return value;
   }
   
   //Return errorFlag
   public boolean getErrorFlag()
   {
      return errorFlag;
   }
   
   //Compare two cards to one another and return boolean
   public boolean equals(Card card)
   {
      if(card.getValue() == getValue() && card.getSuit() == getSuit() && 
         card.getErrorFlag() == getErrorFlag())
      {
         return true;
      }
      else
         return false;
   }
   
   //Determine if card value is valid and return boolean
   private boolean isValid(char value, Suit suit)
   {
      if(value == 'A' || value == '2' || value == '3' || value == '4' || 
         value == '5' || value == '6' || value == '7' || value == '8' ||
         value == '9' || value == 'T' || value == 'J' || value == 'Q' ||
         value == 'K')
         return true;
      else
         return false;
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
