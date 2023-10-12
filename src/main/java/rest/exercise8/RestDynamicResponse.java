package rest.exercise8;

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import rest.exercise7.Person;

import java.math.BigDecimal;

@Path("/call")
public class RestDynamicResponse {

    @GET
    public Response call(@QueryParam("code") @DefaultValue("0") Integer code) {
        if (code == 0) {
            return Response
                    .status(Response.Status.FORBIDDEN)
                    .type(MediaType.TEXT_PLAIN)
                    .entity("Nao permitido!")
                    .build();
        }
        Person person = new Person("koga", BigDecimal.TEN, 35);
        if (code == 1) {
            return Response.ok().type(MediaType.APPLICATION_XML).entity(person).build();
        }
        if (code == 2) {
            return Response.ok().type(MediaType.APPLICATION_JSON).entity(person).build();
        }

        return Response.ok().type(MediaType.TEXT_PLAIN).entity("Codigo nao tratado").build();
    }
}
