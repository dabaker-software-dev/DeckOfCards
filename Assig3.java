
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
   
   public Card(Card original)
   {
      set(original.value, original.suit);
      errorFlag = original.errorFlag;
   }
   
   //Get card and error message strings ready to display depending on validity 
   public String toString()
   {
      if(errorFlag == true)
         return "** illegal **";
      else
         return getValue() + " of " + getSuit();
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
   /*
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
   */
}

class Deck
{
   public final static int MAX_CARDS = 6*52;
   
   private static Card[] masterPack;   
   private Card[] cards;
   private int topCard;
   
   private int numPacks;
   
   /*
    * Default Constructor
    */
   public Deck()
   {
      numPacks = 1;
      cards = new Card[52];
      Deck.allocateMasterPack();
   }
   
   /*
    * Constructor to set number of packs in the deck object
    */
   public Deck(int numPacks)
   {
      if(numPacks > 6)
         numPacks = 6;
      
      this.numPacks = numPacks;
      cards = new Card[ numPacks * 52 ];
      Deck.allocateMasterPack();
   }
   
   public void init(int numPacks)
   {
      int counter = 0;
      for(int k = 0; k < numPacks * 52; k++)
      {
         if( k % 52 == 0 )
         {
            counter = 0;
         }
         
         cards[k] = new Card(masterPack[counter++]);
      }
      
      this.topCard = cards.length;
   }
   
   public void shuffle() 
   {
      
   }
   
   /*
    * Removes card from top of deck
    * return Card object reference at topDeck position
    */
   public Card dealCard()
   {
      Card currentCard;
      if(topCard > 0)
      {
         currentCard = cards[(topCard-1)];
         topCard--;
         return currentCard;
      }
      else
      {
         currentCard = new Card();
      }
      
      /* DAVEDEV
       * I'm not sure what to return if there are no more cards to deal
       */
      return currentCard;
   }
   
   
   /*
    * Accessor for card at top of deck
    * return Card object reference at topDeck position
    */
   public Card getTopCard()
   {
      Card theTopCard = cards[topCard];
      
      return theTopCard;
   }
   
   /*
   public Card inspectCard(int k)
   {
      
   }
   
   */

   /*
    * Fill Master Pack with 52 distinct cards
    * Check that this is the first time the method has ran, otherwise do nothing 
    */
   private static void allocateMasterPack()
   {
      
      if(masterPack == null)
      {
         masterPack = new Card[52];
         
         // array of suit values to iterate over
         Card.Suit[] suitValues = Card.Suit.values();
         int localMasterPackCounter = 0;
         
         for(Card.Suit suit : suitValues)
         {
            Card newCard = new Card();;
            char valueChar; //assume value
            
            for(int i = 13; i > 0; i--)
            {
               if( i > 1 && i < 10 )
               {
                  valueChar = (char)('0' + i);
               }
               else if(i == 13)
               {
                  valueChar = 'K';
               }
               else if(i == 12)
               {
                  valueChar = 'Q';
               }
               else if(i == 11)
               {
                  valueChar = 'J';
               }
               else if(i == 10)
               {
                  valueChar = 'T';
               }
               else
               {
                  valueChar = 'A';
               }
               
               newCard = new Card(valueChar, suit);
            
               masterPack[localMasterPackCounter] = newCard;
               
               if(localMasterPackCounter == 51)
               {
                  localMasterPackCounter = 0;
               }
               else
               {
                  localMasterPackCounter++;
               }
               
            }
         } 
      }
   } // END allocateMasterPack()
}
