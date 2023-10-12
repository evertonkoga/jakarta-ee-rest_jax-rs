package rest.exercise3;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/ticket/{id:[0-9]*}")
public class RestTicket {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String processTicket(@PathParam("id") Long id) {
        String message = "Processed ticket " + id;
        System.out.println(message);
        return message;
    }
}
