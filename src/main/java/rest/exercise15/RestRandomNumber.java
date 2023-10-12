package rest.exercise15;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Random;

@Path("/random")
public class RestRandomNumber {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String process() {
        return "Rest Random Number: " + new Random().nextInt(100000);
    }
}
