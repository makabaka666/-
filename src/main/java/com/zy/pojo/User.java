package com.zy.pojo;

public class User {
    private Integer u_id;
    private String u_name;
    private String u_sex;
    private String u_pass;
    private String u_email;

    public User(Integer u_id, String u_name, String u_sex, String u_pass, String u_email) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_sex = u_sex;
        this.u_pass = u_pass;
        this.u_email = u_email;
    }
    public User(Integer u_id, String u_name, String u_sex, String u_email) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_sex = u_sex;
        this.u_email = u_email;
    }

    public User() {
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_sex() {
        return u_sex;
    }

    public void setU_sex(String u_sex) {
        this.u_sex = u_sex;
    }

    public String getU_pass() {
        return u_pass;
    }

    public void setU_pass(String u_pass) {
        this.u_pass = u_pass;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    @Override
    public String toString() {
        return "user{" +
                "u_id=" + u_id +
                ", u_name='" + u_name + '\'' +
                ", u_sex='" + u_sex + '\'' +
                ", u_pass='" + u_pass + '\'' +
                ", u_email='" + u_email + '\'' +
                '}';
    }
}
