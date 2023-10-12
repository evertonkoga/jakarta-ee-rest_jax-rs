package rest.exercise14;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.Provider;

import java.io.IOException;

@Provider
public class ContainerRequestFilterAuthenticator implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext request) throws IOException {
        if(request.getHeaderString("User") == null) {
            request.abortWith(Response
                    .status(Response.Status.FORBIDDEN)
                    .entity("User is required!")
                    .build()
            );
        }
    }
}
