package rest.exercise16;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;

public class ClientRest {

    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        client.register(FilterClientRandomNumber.class);

        WebTarget web = client.target("http://localhost:8080/phones");
        Response response = web.request().get();

        if(response.getStatus() == 200) {
            System.out.println("Response Length: " + response.readEntity(String.class).length());
        } else {
            System.out.println("Erro: " + response);
        }

        response.close();
        client.close();
    }
}
