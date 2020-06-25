package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class Manager {

    public static void processData(String inputPath) {
        try {
            Stream<String> stream = Files.lines(Paths.get(inputPath));

            final int[] counter = new int[1];
            IntSummaryStatistics IntSummaryStatistics =
            stream
                    .map(s -> Arrays.asList(s.split(" ")))
                    .flatMap(Collection::stream)
                    .mapToInt(Integer::valueOf)
                    .sorted()
                    .peek(i-> {
                        counter[0]++;
                    })
                    .distinct()
                    .peek(i-> {
                        System.out.print(i + " ");
                    })
                    .summaryStatistics();

            System.out.println();
            System.out.println("count: " + counter[0]);
            System.out.println("distinct: " + IntSummaryStatistics.getCount());
            System.out.println("min: " + IntSummaryStatistics.getMin());
            System.out.println("max: " + IntSummaryStatistics.getMax());

            } catch (IOException ioException) {
            ioException.printStackTrace();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
