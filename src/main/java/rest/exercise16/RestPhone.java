package rest.exercise16;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Path("/phones")
public class RestPhone {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Phone> list() {
        System.out.println("Call Rest");
        List<Phone> list = new ArrayList<>();
        for (int i=0; i< 1000; i++) {
            list.add(new Phone("Name"+i, ""+new Random().nextInt()));
        }
        return list;
    }
}
