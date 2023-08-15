package homework8;

import java.util.ArrayList;

public class CardController {
    ArrayList<Card> cards = new ArrayList<>();

    public void createCard(Student student, int id, int startDate, int endDate, int bookId) {
        cards.add(new Card(id, startDate, endDate, bookId, student));
    }

    public void getCardInformation(int id) {
        cards.stream().forEach(card -> {
            if (card.getId() == id) System.out.println(card.toString());
        });
    }
}
