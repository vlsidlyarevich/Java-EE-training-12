package com.itibo.lesson12;

import com.sun.istack.internal.NotNull;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.Pattern;

@ManagedBean(name ="user")
@ViewScoped
public class UserBean {

    @NotNull
    @Pattern(regexp = "^[0-9]+$", message = "Invalid id")
    private String id;

    @NotNull
    private String name;

    private String password;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
