package trello.api;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TrelloApi {

    public static final String KEY = "***";
    public static final String TOKEN = "***";

    OkHttpClient client = new OkHttpClient.Builder()
        .connectTimeout(30, TimeUnit.SECONDS)
         .writeTimeout(30, TimeUnit.SECONDS).build();


    public void getBoardLists(String boardId) throws IOException {
        Request request = new Request.Builder()
                .url("https://api.trello.com/1/boards/"+boardId+"/lists?cards=none&fields=all&key="+KEY+"&token="+TOKEN)
                .build();
        String response = client.newCall(request).execute().body().string();
        System.out.println(response);
    }

    public void createCard(String listId) throws IOException {
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), "{\"name\":\"JACK SPARROW\"}");
        Request request = new Request.Builder()
                .url("https://api.trello.com/1/cards?idList="+listId+"&keepFromSource=all&key="+KEY+"&token="+TOKEN)
                .post(body)
                .build();
        String response = client.newCall(request).execute().body().string();
        System.out.println(response);
    }

}
