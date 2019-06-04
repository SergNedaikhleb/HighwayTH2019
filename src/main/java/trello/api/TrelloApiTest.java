package trello.api;

import org.testng.annotations.Test;

import java.io.IOException;

public class TrelloApiTest {

    @Test
    public void tryIt() throws IOException {
        TrelloApi trelloapi = new TrelloApi();
        trelloapi.getBoardLists("qJHNMYFi");
        trelloapi.createCard("5cf68");

    }


}
