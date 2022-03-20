package com.capgemini.febr18;

import java.util.stream.Stream;

public class StreamDemo2 {
	public static void main(String[] args) {
        // a stream is a sequence of data to process and find meaningful
        //insights out of huge datasource
        //stream does not store the data
        //arrays, collection and file are the sources of stream
        //java.util.stream is the base package for stream api
        //
        String[] strings = {"hi", "hello", "you", "bye", "me", "there", "what", "hi", "bye"};
        Stream.of(strings).distinct().sorted().forEach(System.out::println);
    }
}
