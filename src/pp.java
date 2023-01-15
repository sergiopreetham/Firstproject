import java.util.Scanner;

    class Cards {
        int value;
        String suit;

        public void setCards(String suit, int r) {
            this.value = r;
            this.suit = suit;
            
        }

        int getSuitPriority(String suitString) {
            String[] suits = {"Spades", "Diamonds", "Hearts", "Clubs"};
            for (int i = 0; i < suits.length; i++) {
                if (suits[i].equals(suitString)) {
                    return i;
                }
            }

            return -1;
        }
    }

    class ClassicGame {
        int points1 = 0;
        int points2 = 0;

        public void game(Cards c1, Cards c2) {
            if (c1.value > c2.value) {
                points1++;
            } else if (c2.value > c1.value) {
                points2++;
            } else {
                int suitPriority1 = c1.getSuitPriority(c1.suit);
                int suitPriority2 = c2.getSuitPriority(c2.suit);
                if (suitPriority1 > suitPriority2) {
                    points1++;
                } else {
                    points2++;
                }
            }
            System.out.println("points of player 1 :" + " " + points1);
            System.out.println("points of player 2 :" + " " + points2);
        }
    }

    public class pp {
        public static void main(String[] args) {
            //Two objects (cards) of class Cards
            Cards c1 = new Cards();
            Cards c2 = new Cards();
            Scanner in = new Scanner(System.in);
            //Enter the suit of card 1
            String s1 = in.nextLine();
            c1.setCards(s1, in.nextInt());
            in.nextLine();
            //Enter the suit of card 2
            String s2 = in.nextLine();
            c2.setCards(s2, in.nextInt());
            ClassicGame c = new ClassicGame();

            c.game(c1, c2);
        }
    }





