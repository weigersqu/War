import java.util.ArrayList;
public class Cards
	{
	private String rank;
	private String suit;
	private int value;
	
	public Cards (String r, int v, String s)
		{
		rank = r;
		suit = s;
		value = v;
		}
	public String getRank()
		{
		return rank;
		}
	public void setRank(String rank)
		{
		this.rank = rank;
		}
	public String getSuit()
		{
		return suit;
		}
	public void setSuit(String suit)
		{
		this.suit = suit;
		}
	public int getValue()
		{
		return value;
		}
	public void setValue(int value)
		{
		this.value = value;
		}
	public static ArrayList getCardDeck()
		{
		return cardDeck;
		}
	public static void setCardDeck(ArrayList cardDeck)
		{
		Cards.cardDeck = cardDeck;
		}
	public static ArrayList cardDeck;
		{
	addHearts();
	addSpades();
	addClubs();
	addDiamonds();
		}
	public static ArrayList addHearts()
		{
		cardDeck.add(new Cards ("Two", 2, "Hearts"));
		cardDeck.add(new Cards ("Three",3 , "Hearts"));
		cardDeck.add(new Cards ("Four", 4, "Hearts"));
		cardDeck.add(new Cards ("Five", 5, "Hearts"));
		cardDeck.add(new Cards ("Six", 6, "Hearts"));
		cardDeck.add(new Cards ("Seven", 7, "Hearts"));
		cardDeck.add(new Cards ("Eight", 8, "Hearts"));
		cardDeck.add(new Cards ("Nine", 9, "Hearts"));
		cardDeck.add(new Cards ("Ten", 10, "Hearts"));
		cardDeck.add(new Cards ("Jack", 11, "Hearts"));
		cardDeck.add(new Cards ("Queen", 12, "Hearts"));
		cardDeck.add(new Cards ("King", 13, "Hearts"));
		cardDeck.add(new Cards ("Ace", 14, "Hearts"));
		return cardDeck;
		}
	public static ArrayList addSpades()
		{
		cardDeck.add(new Cards ("Two", 2, "Spades"));
		cardDeck.add(new Cards ("Three",3 , "Spades"));
		cardDeck.add(new Cards ("Four", 4, "Spades"));
		cardDeck.add(new Cards ("Five", 5, "Spades"));
		cardDeck.add(new Cards ("Six", 6, "Spades"));
		cardDeck.add(new Cards ("Seven", 7, "Spades"));
		cardDeck.add(new Cards ("Eight", 8, "Spades"));
		cardDeck.add(new Cards ("Nine", 9, "Spades"));
		cardDeck.add(new Cards ("Ten", 10, "Spades"));
		cardDeck.add(new Cards ("Jack", 11, "Spades"));
		cardDeck.add(new Cards ("Queen", 12, "Spades"));
		cardDeck.add(new Cards ("King", 13, "Spades"));
		cardDeck.add(new Cards ("Ace", 14, "Spades"));
		return cardDeck;
		}
	public static ArrayList addDiamonds()
		{
		cardDeck.add(new Cards ("Two", 2, "Diamonds"));
		cardDeck.add(new Cards ("Three",3 , "Diamonds"));
		cardDeck.add(new Cards ("Four", 4, "Diamonds"));
		cardDeck.add(new Cards ("Five", 5, "Diamonds"));
		cardDeck.add(new Cards ("Six", 6, "Diamonds"));
		cardDeck.add(new Cards ("Seven", 7, "Diamonds"));
		cardDeck.add(new Cards ("Eight", 8, "Diamonds"));
		cardDeck.add(new Cards ("Nine", 9, "Diamonds"));
		cardDeck.add(new Cards ("Ten", 10, "Diamonds"));
		cardDeck.add(new Cards ("Jack", 11, "Diamonds"));
		cardDeck.add(new Cards ("Queen", 12, "Diamonds"));
		cardDeck.add(new Cards ("King", 13, "Diamonds"));
		cardDeck.add(new Cards ("Ace", 14, "Diamonds"));
		return cardDeck;
		}
	public static ArrayList addClubs()
		{
		cardDeck.add(new Cards ("Two", 2, "Clubs"));
		cardDeck.add(new Cards ("Three",3 , "Clubs"));
		cardDeck.add(new Cards ("Four", 4, "Clubs"));
		cardDeck.add(new Cards ("Five", 5, "Clubs"));
		cardDeck.add(new Cards ("Six", 6, "Clubs"));
		cardDeck.add(new Cards ("Seven", 7, "Clubs"));
		cardDeck.add(new Cards ("Eight", 8, "Clubs"));
		cardDeck.add(new Cards ("Nine", 9, "Clubs"));
		cardDeck.add(new Cards ("Ten", 10, "Clubs"));
		cardDeck.add(new Cards ("Jack", 11, "Clubs"));
		cardDeck.add(new Cards ("Queen", 12, "Clubs"));
		cardDeck.add(new Cards ("King", 13, "Clubs"));
		cardDeck.add(new Cards ("Ace", 14, "Clubs"));
		return cardDeck;
		}
	}
