package rest.exercise5;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.math.BigDecimal;

@Path("/employee/")
public class RestCompany {

    private Employee creatEmployee() {
        Employee employee = new Employee();
        employee.setName("koga");
        employee.setAge(35);
        employee.setWage(BigDecimal.TEN);
        return employee;
    }

    @GET
    @Path("/xml")
    @Produces(MediaType.APPLICATION_XML)
    public Employee getXml() {
        System.out.println("Create object in Xml");
        return creatEmployee();
    }
    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getJson() {
        System.out.println("Create object in Json");
        return creatEmployee();
    }
}
