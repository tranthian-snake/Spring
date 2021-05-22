package com.example.tranthian.repository;

import com.example.tranthian.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {
    @Query("select p from EmployeeEntity p where p.name like %:name%")
    List<EmployeeEntity> findAllEmployees(String name);
}
