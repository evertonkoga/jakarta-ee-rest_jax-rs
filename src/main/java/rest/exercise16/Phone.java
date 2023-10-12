package rest.exercise16;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Phone {
    private String name;
    private String phone;

    public Phone() {
    }

    public Phone(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
