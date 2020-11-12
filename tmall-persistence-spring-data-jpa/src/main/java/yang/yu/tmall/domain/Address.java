package yang.yu.tmall.domain;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Address {

    private String province;

    private String city;

    private String detail;

    private String receiver;

    private String receiverPhone;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Address)) {
            return false;
        }
        Address address = (Address) o;
        return Objects.equals(getProvince(), address.getProvince()) &&
                Objects.equals(getCity(), address.getCity()) &&
                Objects.equals(getDetail(), address.getDetail()) &&
                Objects.equals(getReceiver(), address.getReceiver()) &&
                Objects.equals(getReceiverPhone(), address.getReceiverPhone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProvince(), getCity(), getDetail(), getReceiver(), getReceiverPhone());
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", detail='" + detail + '\'' +
                ", receiver='" + receiver + '\'' +
                ", receiverPhone='" + receiverPhone + '\'' +
                '}';
    }
}
