package rest.exercise11;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.text.SimpleDateFormat;
import java.util.Date;

@Path("/header")
public class RestRequestFilterHeader {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String call() {
        System.out.println("===> Call Rest");
        return new SimpleDateFormat("HH:mm:ss dd/MM/yyyy").format(new Date());
    }
}
