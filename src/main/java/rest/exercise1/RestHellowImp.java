package rest.exercise1;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Date;

@Path("/ola")
public class RestHellowImp implements Hellow {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String servico() {
        System.out.println("Executou o rest...");
        return new Date().toString();
    }
}
