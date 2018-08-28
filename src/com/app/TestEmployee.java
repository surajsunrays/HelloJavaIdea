package com.app;

import com.app.model.Address;
import com.app.model.Employee;
import com.app.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestEmployee {
    public static void main(String[] args) {
        Transaction tx = null;
        try(Session ss = HibernateUtil.getSf().openSession()) {

            tx = ss.beginTransaction();

            Address add1 = new Address();
            add1.setAid(101);
            add1.setLoc("Pune");
            add1.setPinCode(500);

            Address add2 = new Address();
            add2.setAid(102);
            add2.setLoc("Mumbai");
            add2.setPinCode(600);

            Address add3 = new Address();
            add3.setAid(103);
            add3.setLoc("Hyderabad");
            add3.setPinCode(700);

            Employee e = new Employee();
            e.setEmpId(10);
            e.setEmpName("AA");
            e.setEmpSal(2.2);
            e.getAddr().add(add1);
            e.getAddr().add(add2);

            ss.save(e);

            tx.commit();

        }catch (Exception e)
        {
            tx.rollback();
            System.out.println(e.getMessage());
        }
    }
}
