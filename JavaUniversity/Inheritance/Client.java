package inheritance;

import java.util.Date;

public class Client extends Person {
    private int clientId;
    private Date registrationDate;
    private boolean vip;
    private static int clientCounter;

    public Client(Date registrationDate, boolean vip, String name, char gender, int age, String address) {
        super(name, gender, age, address);
        this.clientId = ++Client.clientCounter;
        this.registrationDate = registrationDate;
        this.vip = vip;
    }

    public int getClientId() {
        return clientId;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Client{clientId=" + clientId + ", registrationDate=" + registrationDate + ", vip=" + vip + ", " + super.toString() + "}";
    }
}