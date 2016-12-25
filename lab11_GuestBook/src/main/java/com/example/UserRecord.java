
package com.example;



import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name= "UserRecords")
public class UserRecord {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name= "userName", length=64)
    private String userName;
    @Column(name= "textUser", length=64)
    private String textUser;
    @Column(name = "dateRecord")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRecord;

    public UserRecord(){};

    public UserRecord(String userName, String textUser){
        this.userName = userName;
        this.textUser =  textUser;
        this.dateRecord = new Date();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTextUser() {
        return textUser;
    }

    public void setTextUser(String textUser) {
        this.textUser = textUser;
    }

    public Date getDate() {
        return dateRecord;
    }

    public void setDate(Date date) {
        this.dateRecord = date;
    }
}
