package hu.gyarmatip.employeecrudrest.controller;

import hu.gyarmatip.employeecrudrest.entity.Employee;
import hu.gyarmatip.employeecrudrest.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/employee")
    public List<Employee> findAll() {
        return ((List<Employee>) employeeRepository.findAll());
    }

}
