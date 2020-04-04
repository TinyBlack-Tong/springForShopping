package com.tinytong.springbootest.enity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    private String  user_id;
    private String  user_password;
    private String  user_password_2;

    public String getUser_password_2() {
        return user_password_2;
    }

    public void setUser_password_2(String user_password_2) {
        this.user_password_2 = user_password_2;
    }



    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }



    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }


}
