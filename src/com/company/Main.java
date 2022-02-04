package com.company;

import java.io.IOException;

import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;


public class Main {

    public static void main(String[] args) throws IOException {

        DirectoryStream.Filter<Path> filter = p-> Files.isRegularFile(p);// kalsörlerde sadece file olması için filtre
        Path path = FileSystems.getDefault().getPath("deneme");

        try {
            DirectoryStream<Path> liste = Files.newDirectoryStream(path,filter);
            for (Path path1:liste ) {
                System.out.println(path1);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}

