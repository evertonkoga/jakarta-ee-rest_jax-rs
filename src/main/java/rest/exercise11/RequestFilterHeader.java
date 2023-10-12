package rest.exercise11;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.ext.Provider;

import java.io.IOException;

@Provider
public class RequestFilterHeader implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        containerRequestContext.getHeaders().forEach((key, values) -> {
            System.out.println("\n-> " + key);
            values.forEach(value -> System.out.println("---> " + value));
        });
    }
}
