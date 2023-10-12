package rest.exercise9;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Path("/withdraw")
public class RestWithdrawImp implements WithdrawService {

    private static final List<Withdraw> bank = new ArrayList<>();
    static {
        bank.add(new Withdraw("Everton", BigDecimal.TEN));
        bank.add(new Withdraw("Koga", BigDecimal.ONE));
    }

    @POST
    @Path("/save")
    @Consumes(MediaType.APPLICATION_JSON)
    @Override
    public void save(Withdraw withdraw) throws BusinessException {
        withdraw.isValid();
        bank.add(withdraw);
    }

    @DELETE
    @Path("/delete")
    @Consumes(MediaType.TEXT_PLAIN)
    @Override
    public void delete(@QueryParam("title") String title) throws BusinessException {
        if(title == null || title.isBlank()) {
            throw new BusinessException("Title is required");
        }

        Withdraw withdraw = bank.stream()
                .filter(item -> item.getTitle().equals(title))
                .findFirst()
                .orElse(null);

        if(withdraw == null) {
            throw new BusinessException("Title is nonexistent");
        }
        bank.remove(withdraw);
    }

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public List<Withdraw> list() throws BusinessException {
        return new ArrayList<>(bank);
    }
}
