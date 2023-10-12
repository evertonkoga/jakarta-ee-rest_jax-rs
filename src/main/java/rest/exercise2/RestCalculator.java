package rest.exercise2;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/calculator")
public class RestCalculator {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sum(
            @QueryParam("v1") Integer value1,
            @QueryParam("v2") Integer value2
    ) {
        return "Value of sum is: " + (value1 + value2);
    }
}
