import java.util.ArrayList;

public class Casino {

    ArrayList<Card> deck;
    int score;

    public static void main(String[] args) {
        Casino table = new Casino();
    }

    public Casino() {
        createDeck();
        printDeck();
    }

    public void createDeck() {
        deck = new ArrayList<>();
        for (int x = 0; x < 4; x++) {
            for (int y = 2; y < 13; y++) {
                deck.add(new Card(x, y));
            }
        }
    }

    public void printDeck(){
        for(int x = 0; x > 52; x++){
            deck.get(x).printCardInfo();
        }
    }

}

