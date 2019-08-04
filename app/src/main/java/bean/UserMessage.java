package bean;

/**
 * Created by 小黑 on 2019/8/4.
 */

public class UserMessage {
    private String account;
    private String password;
    private String province;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public UserMessage(String account, String password, String province, String username) {
        this.account = account;
        this.password = password;
        this.province = province;
        this.username = username;
    }

}
