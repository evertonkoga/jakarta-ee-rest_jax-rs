package rest.exercise9;

import java.util.List;

public interface WithdrawService {
    void save(Withdraw withdraw) throws BusinessException;
    void delete(String title) throws BusinessException;
    List<Withdraw> list() throws BusinessException;
}
