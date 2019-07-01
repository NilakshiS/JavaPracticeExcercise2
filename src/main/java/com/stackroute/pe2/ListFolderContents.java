package com.stackroute.pe2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ListFolderContents {
    public static void main(String[] args) {
        String basePath = "/home/nilakshi/PracticeExcercise2";
        ListFolderContents listFolderContents = new ListFolderContents();

        String[] files = listFolderContents.getFolderContents(basePath);
        System.out.println("List of files: ");
        for (String file :
                files) {
            System.out.println(file);
        }

        Scanner in = new Scanner(System.in);
        System.out.println("\n\nEnter name of file: ");
        String filename = in.nextLine();

        System.out.println("Contents of file are: ");
        System.out.println(new String(listFolderContents.getFileContents(basePath,filename)));

    }
    String[] getFolderContents(String basePath){
        Path dir = Paths.get(basePath);
        ArrayList<String> files = new ArrayList<>();

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {

            for (Path file: stream) {
                files.add(file.getFileName().toString());
            }
            return files.toArray(new String[0]);
        } catch (IOException | DirectoryIteratorException x) {
            // IOException can never be thrown by the iteration.
            // In this snippet, it can only be thrown by newDirectoryStream.
            System.err.println(x);
            return null;
        }
    }
    byte[] getFileContents(String basePath,String file){
        File f = new File(basePath+"/"+file);
        try (FileInputStream fileInputStream = new FileInputStream(f)){
            byte[] contents = new byte[(int)f.length()];
            int read_count = fileInputStream.read(contents);
            return contents;
        }
        catch (IOException x){
            System.err.println(x);
            return null;
        }
    }
}
