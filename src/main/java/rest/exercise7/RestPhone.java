package rest.exercise7;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

@Path("/phone")
public class RestPhone {

    @POST
    @Path("/xml")
    @Consumes(MediaType.APPLICATION_XML)
    public void processInXml(Person person) {
        System.out.println("Process in Xml: " + person);
    }
    @POST
    @Path("/json")
    @Consumes(MediaType.APPLICATION_JSON)
    public void processInJson(Person person) {
        System.out.println("Process in Json: " + person);
    }
}
