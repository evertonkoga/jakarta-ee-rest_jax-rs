package rest.exercise1;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Date;

@Path("/hellow")
public class RestHellowImp implements Hellow {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String servico() {
        System.out.println("Executed the rest...");
        return new Date().toString();
    }
}
