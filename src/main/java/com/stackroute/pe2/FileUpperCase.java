package com.stackroute.pe2;

import java.io.*;

public class FileUpperCase {
    public String convertUpperCase(File f){

        try(FileInputStream fileInputStream = new FileInputStream(f)) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

            String line = bufferedReader.readLine();
            String contents = line;
            line = bufferedReader.readLine();
            while (line != null){
                contents += "\n"+line;
                line = bufferedReader.readLine();
            }
            return contents.toUpperCase()+" "+f.length();
        }
        catch (IOException ioException){
            return ioException.getMessage();
        }
    }
}
