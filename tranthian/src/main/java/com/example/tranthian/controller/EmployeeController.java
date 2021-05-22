package com.example.tranthian.controller;

import com.example.tranthian.entity.EmployeeEntity;
import com.example.tranthian.model.BaseResponse;
import com.example.tranthian.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public ResponseEntity createEmployee(@RequestBody EmployeeEntity p){
        EmployeeEntity data = employeeService.createEmployee(p);
        BaseResponse res = new BaseResponse();
        res.data = data;
        return ResponseEntity.ok(res);
    }
}
