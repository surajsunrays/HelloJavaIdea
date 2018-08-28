package com.app.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "emptab")
public class Employee {
    @Id
    @Column(name = "eid")
    private int empId;
    @Column(name = "ename")
    private String empName;
    @Column(name = "esal")
    private double empSal;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "eidfk")
    private List<Address> addr = new ArrayList<>(0);

    public Employee() {
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }

    public List<Address> getAddr() {
        return addr;
    }

    public void setAddr(List<Address> addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSal=" + empSal +
                ", addr=" + addr +
                '}';
    }
}
