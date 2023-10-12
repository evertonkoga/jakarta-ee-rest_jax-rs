package rest;

import jakarta.ws.rs.core.UriBuilder;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.net.URI;
import java.util.Scanner;

public class Server {
    /**
     *  To access API documentation, access http://localhost:8080/application.wadl
     */
    public static void main(String[] args) {
        var serverBaseUrl = "http://localhost/";
        var serverPort = 8080;
        var packageBasePath = "rest.exercise";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the exercise number:");
        String exerciseNumber = scanner.nextLine();

        try {
            URI uri = UriBuilder.fromUri(serverBaseUrl).port(serverPort).build();

            ResourceConfig config = new ResourceConfig();
            config.packages(packageBasePath + exerciseNumber);

            GrizzlyHttpServerFactory.createHttpServer(uri, config);

            System.out.println("Server is started...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}