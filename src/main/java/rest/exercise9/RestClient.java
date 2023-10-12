package rest.exercise9;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;

import java.math.BigDecimal;
import java.util.List;

public class RestClient {

    private static WebTarget create() {
        Client client = ClientBuilder.newClient();
        WebTarget web = client.target("http://localhost:8080/withdraw");
        return web;
    }
    private static void create(Withdraw withdraw) {
        WebTarget web = create().path("/save");
        Response response = web.request().post(Entity.json(withdraw));

        System.out.println("Save status: " + response.getStatus() + " - " + response.readEntity(String.class));

        response.close();
    }

    private static void list() {
        WebTarget web = create().path("/list");
        Response response = web.request().get();

        System.out.println("List status: " + response.getStatus());
        List<Withdraw> list = response.readEntity(new GenericType<>(){});
        list.forEach(item -> System.out.println(item.getTitle() + " - " + item.getMony()));

        response.close();
    }

    private static void delete(String title) {
        WebTarget web = create().path("/delete");
        Response response = web.queryParam("title", title).request().delete();

        System.out.println("Delete status: " + response.getStatus() + " - " + response.readEntity(String.class));

        response.close();
    }
    public static void main(String[] args) {
        create(new Withdraw());
        create(new Withdraw("Pedro", new BigDecimal(100)));
        create(new Withdraw("Lucas", new BigDecimal(20)));
        list();
        delete("Koga");
        delete("Lucas");
        list();
    }
}
