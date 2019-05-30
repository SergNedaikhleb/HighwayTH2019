package lesson13;

import okhttp3.OkHttpClient;
import okhttp3.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.testng.annotations.Test;
import java.io.IOException;

public class GetRequest {

    @Test
    public void tryIt() throws IOException {

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("http://www.imdb.com/chart/top").build();
        Response response = client.newCall(request).execute();
        String html = response.body().string();
        System.out.println(html);

        Document document = Jsoup.parse(html);
        Elements elements = document.select(".titleColumn a");


    }
}
