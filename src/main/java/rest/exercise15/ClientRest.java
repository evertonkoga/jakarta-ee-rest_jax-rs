package rest.exercise15;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;
import rest.exercise14.ClientRequestFilterAuthenticator;

public class ClientRest {

    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        client.register(FilterClientRandomNumber.class);

        WebTarget web = client.target("http://localhost:8080/random");
        Response response = web.request().get();

        if(response.getStatus() == 200) {
            System.out.println(response.readEntity(String.class));
        } else {
            System.out.println("Erro: " + response);
        }

        response.close();
        client.close();
    }
}
