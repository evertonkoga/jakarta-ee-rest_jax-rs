package rest.exercise9;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@XmlRootElement
public class Withdraw {
    private String title;
    private BigDecimal mony;

    public Withdraw() {
    }

    public Withdraw(String title, BigDecimal mony) {
        this.title = title;
        this.mony = mony;
    }

    public void isValid() throws BusinessException {
        List<String> errors = new ArrayList<>();
        if(this.title == null || this.title.isBlank()) {
            errors.add("Title is required");
        }
        if(this.mony == null) {
            errors.add("Money is required");
        }
        if (!errors.isEmpty()) {
            throw new BusinessException(errors.toString());
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getMony() {
        return mony;
    }

    public void setMony(BigDecimal mony) {
        this.mony = mony;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Withdraw withdraw = (Withdraw) o;
        return Objects.equals(getTitle(), withdraw.getTitle()) && Objects.equals(getMony(), withdraw.getMony());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getMony());
    }

    @Override
    public String toString() {
        return "Withdraw{" +
                "title='" + title + '\'' +
                ", mony=" + mony +
                '}';
    }
}
