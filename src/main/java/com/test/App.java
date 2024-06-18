package com.test;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.event.model.AppSyncEvent;
import com.test.event.model.AppSyncEventTruncated;
import software.amazon.awssdk.services.s3.S3Client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Lambda function entry point. You can change to use other pojo type or implement
 * a different RequestHandler.
 *
 * @see <a href=https://docs.aws.amazon.com/lambda/latest/dg/java-handler.html>Lambda Java Handler</a> for more information
 */
public class App implements RequestHandler<Object, Object> {
    private final S3Client s3Client;

    public App() {
        // Initialize the SDK client outside of the handler method so that it can be reused for subsequent invocations.
        // It is initialized when the class is loaded.
        s3Client = DependencyFactory.s3Client();
        // Consider invoking a simple api here to pre-warm up the application, eg: dynamodb#listTables
        System.out.println("Hello");
    }

    @Override
    public Object handleRequest(final Object input, final Context context) {
        // TODO: invoking the api call using s3Client.
        System.out.println(input.toString());
        List<Post> posts = new ArrayList<>();

        posts.add(new Post("1", "First book", "John Johnson", "https://posts.org/1", "Lorem ipsum dolor sit amet.", "23", "55"));
        posts.add(new Post("2", "Second book", "Jane Doe", "https://posts.org/1", "Lorem ipsum dolor sit amet.", "67", "63"));
        posts.add(new Post("3", "Third book", "Bob Berrington", "https://posts.org/1", "Lorem ipsum dolor sit amet.", "45", "2"));
        posts.add(new Post("4", "Fourth book", "John Johnson", "https://posts.org/1", "Lorem ipsum dolor sit amet.", "95", "8"));

        Map<String, List<String>> relatedPosts = new HashMap<>();
        relatedPosts.put("1", Arrays.asList("3"));
        relatedPosts.put("2", Arrays.asList("4", "1"));

        System.out.println(input);
        ObjectMapper objectMapper = new ObjectMapper();

//        AppSyncEvent event = objectMapper.convertValue(input, AppSyncEvent.class);
        AppSyncEventTruncated eventTruncated = objectMapper.convertValue(input, AppSyncEventTruncated.class);

//        System.out.println("converted = " + event);
        System.out.println("converted = " + eventTruncated);
//        switch (event.getInfo().getFieldName()) {
//
//            case "getPost":
//                return "got a post";
////                return posts.stream().filter(x -> x.getId().equals(event.getArguments().getId())).findFirst();
//            case "allPosts":
//                return posts;
//            case "addPost":
//                System.out.println("post added");
//            case "addPostErrorWithData":
//                System.out.println("post added with error data");
//            case "relatedPosts":
//                System.out.println("relatedPosts");
//
//        }

        Post post = new Post("1", "First book", "John Johnson", "https://posts.org/1", "Lorem ipsum dolor sit amet.", "23", "55");

        return post;
    }
}
