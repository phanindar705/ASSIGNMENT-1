package net.phani.User.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User {

    @Id
    private String Username;

   @Column
    private String firstname;

   @Column
    private String lastname;

   @Column
    private String emailId;

   @Column
    private long phonenumber;

   @Column
    private String address1;

   @Column
    private String address2;


   public User() {
    }

    public User(String Username,String firstname,String lastname,String emailId,long phonenumber,String address1,String address2){
       super();
       this.Username = Username;
       this.firstname = firstname;
       this.lastname = lastname;
       this.emailId = emailId;
       this.phonenumber = phonenumber;
       this.address1 = address1;
       this.address2 = address2;
    }

    public String getUsername() {
        return Username;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


}
