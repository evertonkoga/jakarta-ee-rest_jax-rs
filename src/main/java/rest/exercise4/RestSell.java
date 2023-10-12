package rest.exercise4;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/sell")
public class RestSell {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sell(
            @QueryParam("name") String name,
            @QueryParam("product")String product,
            @QueryParam("type") @DefaultValue("pdf") String type
    ) {
        String message = String.format("ticket: name=%s - product=%s - type=%s", name, product, type);
        System.out.println(message);
        return message;
    }
}
