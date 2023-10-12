package rest.exercise7;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;

import java.math.BigDecimal;

public class ClientRest {
    private static final String BASE_URL = "http://localhost:8080/phone";
    private static void getInXml(Person person) {
        Client client = ClientBuilder.newClient();
        WebTarget web = client.target(BASE_URL + "/xml");
        Response response = web.request().post(Entity.xml(person));

        if(response.getStatus() == Response.Status.NO_CONTENT.getStatusCode()) {
            System.out.println("Enviado com sucesso para Xml");
        } else {
            System.out.println("Erro na requisiçõa: " + response.toString());
        }

        response.close();
        client.close();
    }

    private static void getInJson(Person person) {
        Client client = ClientBuilder.newClient();
        WebTarget web = client.target(BASE_URL + "/json");
        Response response = web.request().post(Entity.json(person));

        if(response.getStatus() == Response.Status.NO_CONTENT.getStatusCode()) {
            System.out.println("Enviado com sucesso para Json");
        } else {
            System.out.println("Erro na requisiçõa: " + response);
        }

        response.close();
        client.close();
    }
    public static void main(String[] args) {
        Person person = new Person("koga", BigDecimal.TEN, 35);
        getInXml(person);
        getInJson(person);
    }
}
