package rest.exercise12;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.text.SimpleDateFormat;
import java.util.Date;

@Path("/simple")
public class RestContainerResponseFilterSimple {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String call() {
        System.out.println("===> Call Rest");
        return new SimpleDateFormat("HH:mm:ss dd/MM/yyyy").format(new Date());
    }
}
