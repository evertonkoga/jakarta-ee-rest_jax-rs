package rest.exercise14;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/auth")
public class RestAuthenticator {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String auth() {
        return "Hellow!!!";
    }
}
