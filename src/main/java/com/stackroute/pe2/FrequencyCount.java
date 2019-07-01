package com.stackroute.pe2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
        FrequencyCount frequencyCount = new FrequencyCount();
        Map m1 = frequencyCount.countWords("/home/nilakshi/PracticeExcercise2/src/test/resources/frequencyCounterInput");

        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);
    }
    public Map countWords(String filename){
        Map<String,Integer> wordMap = new HashMap<String, Integer>();
        try(FileInputStream fileInputStream = new FileInputStream(filename);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream))) {

            String line = bufferedReader.readLine();
            while (line != null){
                String[] words = line.split("\\s+|,|\\.|;");
                for (String word :
                        words) {

                    if (wordMap.containsKey(word)){
                        Integer count = wordMap.get(word);
                        wordMap.put(word,++count);
                    }
                    else {
                        wordMap.put(word,1);
                    }
                }
                line = bufferedReader.readLine();
            }
            return wordMap;
        }
        catch (IOException ioException){
            System.err.println(ioException);
            return null;
        }
    }
}
