package com.app.model;

import javax.persistence.*;

@Entity
@Table(name = "addrtab")
public class Address {
    @Id
    @Column(name = "aid")
    private int aid;
    @Column(name = "loc")
    private String loc;
    @Column(name = "pin")
    private int pinCode;

    @OneToOne
    @JoinColumn(name = "eidfk")
    private Employee emp;

    public Address() {
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Address{" +
                "aid=" + aid +
                ", loc='" + loc + '\'' +
                ", pinCode=" + pinCode +
                ", emp=" + emp +
                '}';
    }
}

