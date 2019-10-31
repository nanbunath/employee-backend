package com.example.employee;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class EmployeeDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void addEmployee(EmployeeDTO employeeDTO){
        entityManager.persist(employeeDTO);
    }

    public List<EmployeeDTO> getAllEmployees(){
        List<EmployeeDTO> products = entityManager.createQuery("FROM ProductDetails")
                .getResultList();
        return products;
    }
}
