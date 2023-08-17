package homework8.controller;

import homework8.model.Card;
import homework8.model.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class CardController {
    HashMap<Integer, Card> cards = new HashMap<>();

    public void createCard(Student student, int id, int startDate, int endDate, int bookId) {
        cards.put(id, new Card(id, startDate, endDate, bookId, student));
    }

    public void removeCard(int id) {
        cards.remove(id);
    }

    public String getCardInformation(int id) {
        Card card = cards.get(id);
        return card.toString();
    }
}
