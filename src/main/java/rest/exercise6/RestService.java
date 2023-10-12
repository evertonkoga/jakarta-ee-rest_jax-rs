package rest.exercise6;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import java.util.Date;

@Path("/service")
public class RestService {

    @GET
    @Path("/date")
    @Produces(MediaType.TEXT_PLAIN)
    public String date() {
        return "Atual date is " + new Date();
    }

    @GET
    @Path("/sum")
    @Produces(MediaType.TEXT_PLAIN)
    public Integer sum(@QueryParam("v1") Integer value1, @QueryParam("v2") Integer value2) {
        return value1 + value2;
    }
}
