package com.example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private final List<String> lines;
    private final long size;

    public Main(List<String> lines) {
        this.lines = lines;
        this.size = lines.size();
    }


    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        try(Stream<String> stream = Files.lines(Path.of("/home/nakul/Downloads/leilist.txt")))
        {


            Main main = new Main(stream.toList());
            main.run();


        }






       // System.out.println(restFetcher.fetch("001GPB6A9XPE8XJICC14"));
    }

    private void run() {
        RestFetcher restFetcher = new RestFetcher();
        try (ExecutorService executor = Executors.newFixedThreadPool(100)) {
            long start = System.currentTimeMillis();

            List<Future<long[]>> futures = lines.stream().map(lei -> executor.submit(() -> restFetcher.timedFetch(lei)))
                    .toList();

           try(BufferedWriter writer = Files.newBufferedWriter(Paths.get("/home/nakul/Downloads/leiresult.txt"))) {

               for (Future<long[]> future : futures) {
                   long[] result = future.get();
                   writer.write(String.join(",",Long.toString(result[0]),Long.toString(result[1]),Long.toString((result[1]-result[0]))));
                   writer.newLine();


               }
            
           } catch (IOException | ExecutionException | InterruptedException e) {
               throw new RuntimeException(e);
           }
            ;


            System.out.println("Time taken " +(System.currentTimeMillis()-start));
        }

    }
}