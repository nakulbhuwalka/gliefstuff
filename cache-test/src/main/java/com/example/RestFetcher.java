package com.example;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RestFetcher {

    HttpClient client = HttpClient.newHttpClient();
    public RestFetcher() {

    }

    public long[] timedFetch(String lei)  {
        long[] times = new long[2];
        times[0] = System.currentTimeMillis();
        try {
            String result = fetch(lei);
//            System.out.println(result);
            if(result == null)
            {
                throw new RuntimeException("no result");
            }
        } catch (URISyntaxException | InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }
        times[1] = System.currentTimeMillis();
        return times;
    }

    public String fetch(String lei) throws URISyntaxException, IOException, InterruptedException {


        HttpRequest request = HttpRequest.newBuilder().
                uri(new URI("http://localhost:8080/gleif/" + lei))

                .GET()
                .build();

        return  client.send(request, HttpResponse.BodyHandlers.ofString()).body();


    }
}
