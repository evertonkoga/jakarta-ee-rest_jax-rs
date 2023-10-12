package rest.exercise7;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.math.BigDecimal;

@XmlRootElement
public class Person {
    private String name;
    private BigDecimal wage;
    private Integer age;

    public Person() {
    }

    public Person(String name, BigDecimal wage, Integer age) {
        this.name = name;
        this.wage = wage;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getWage() {
        return wage;
    }

    public void setWage(BigDecimal wage) {
        this.wage = wage;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", wage=" + wage +
                ", age=" + age +
                '}';
    }
}
