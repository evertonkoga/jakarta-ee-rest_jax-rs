package rest.exercise14;

import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClientRequestFilterAuthenticator implements ClientRequestFilter {
    @Override
    public void filter(ClientRequestContext request) throws IOException {
        List<String> header = new ArrayList<>();
        header.add("koga");

        request.getHeaders().add("User", header);
    }
}
