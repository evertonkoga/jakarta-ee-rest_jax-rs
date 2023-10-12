package rest.exercise17;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import rest.exercise16.Phone;

import java.util.List;

public class ClientRest {

    /**
     *
     * Para Rodar este teste execute a API do exercicio 16
     */
    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        client.register(GzipClient.class);

        WebTarget web = client.target("http://localhost:8080/phones");
        Response response = web.request().get();

        List<Phone> phones = response.readEntity(new GenericType<>(){});
        phones.forEach(phone -> System.out.println(phone.getName() + " - " + phone.getPhone()));

        response.close();
        client.close();
    }
}
