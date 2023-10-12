package rest.exercise6;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;

public class ClientRest {
    private static final String BASE_URL = "http://localhost:8080/service";
    private static void getDate() {
        Client client = ClientBuilder.newClient();
        WebTarget web = client.target(BASE_URL + "/date");
        Response response = web.request().get();

        if(response.getStatus() == Response.Status.OK.getStatusCode()) {
            String date = response.readEntity(String.class);
            System.out.println(date);
        } else {
            System.out.println("Erro na requisiçõa: " + response.toString());
        }

        response.close();
        client.close();
    }

    private static void getSumFixedParams() {
        Client client = ClientBuilder.newClient();
        WebTarget web = client.target(BASE_URL + "/sum?v1=10&v2=10");
        Response response = web.request().get();

        if(response.getStatus() == Response.Status.OK.getStatusCode()) {
            Integer sum = response.readEntity(Integer.class);
            System.out.println("The fixed sum is " + sum);
        } else {
            System.out.println("Erro na requisiçõa: " + response);
        }

        response.close();
        client.close();
    }

    private static void getSumDinamicParams() {
        Client client = ClientBuilder.newClient();
        WebTarget web = client.target(BASE_URL);
        WebTarget request = web.path("/sum").queryParam("v1", 20).queryParam("v2", 20);
        Response response = request.request().get();

        if(response.getStatus() == Response.Status.OK.getStatusCode()) {
            Integer sum = response.readEntity(Integer.class);
            System.out.println("The dynamic sum is " + sum);
        } else {
            System.out.println("Erro na requisiçõa: " + response);
        }

        response.close();
        client.close();
    }
    public static void main(String[] args) {
        getDate();
        getSumFixedParams();
        getSumDinamicParams();
    }
}
