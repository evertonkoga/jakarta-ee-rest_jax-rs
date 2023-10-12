package rest.exercise3;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/registre/{user:[a-zA-Z]*}")
public class RestRegistre {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String registreProcessed(@PathParam("user") String user) {
        String message = "Processed for " + user;
        System.out.println(message);
        return message;
    }
}
