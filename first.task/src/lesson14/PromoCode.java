package lesson14;

public class PromoCode {
    private  String code;
    private Boolean isExpired;

    @Override
    public String toString() {
        return "PromoCode{" +
                "code='" + code + '\'' +
                ", isExpired=" + isExpired +
                '}';
    }

    public PromoCode(String code, Boolean isExpired) {
        this.code = code;
        this.isExpired = isExpired;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setExpired(Boolean expired) {
        isExpired = expired;
    }

    public String getCode() {
        return code;
    }

    public Boolean getExpired() {
        return isExpired;
    }
}
