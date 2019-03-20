package entity;

import java.util.Date;

public class Person {

    private String firstName;
    private String lastName;
    private Date birthday;
    private String phoneNumber;
    private String nickname;
    private String secretPassword;
    private Long inscriptionCode;

    public Long getInscriptionCode() {
        return inscriptionCode;
    }

    public void setInscriptionCode(Long inscriptionCode) {
        this.inscriptionCode = inscriptionCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSecretPassword() {
        return secretPassword;
    }

    public void setSecretPassword(String secretPassword) {
        this.secretPassword = secretPassword;
    }
}
