package rest.exercise16;

import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.ext.Provider;
import jakarta.ws.rs.ext.WriterInterceptor;
import jakarta.ws.rs.ext.WriterInterceptorContext;

import java.io.IOException;
import java.util.zip.GZIPOutputStream;

@Provider
public class GzipServer implements WriterInterceptor {
    @Override
    public void aroundWriteTo(WriterInterceptorContext context) throws IOException, WebApplicationException {
        System.out.println("Call Interceptor Server");

        GZIPOutputStream outputStream = new GZIPOutputStream(context.getOutputStream());
        context.setOutputStream(outputStream);
        context.proceed();

        return;
    }
}
