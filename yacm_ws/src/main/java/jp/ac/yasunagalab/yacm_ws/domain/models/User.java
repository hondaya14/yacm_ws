package jp.ac.yasunagalab.yacm_ws.domain.models;


public class User {
    private String uid; // account name
    private int uidNumber; // serial number
    private String userName; // cn
    private String password; // encrypted pass word by sha-1

    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getUidNumber() {
        return this.uidNumber;
    }

    public void setUidNumber(int uidNumber) {
        this.uidNumber = uidNumber;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
