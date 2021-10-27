package payroll;

import lombok.Data;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Log
public class Employee {

    private @Id @GeneratedValue Long id;
    private String name;
    private String role;

    @Autowired
    public Employee(String name, String role){
        this.name=name;
        this.role=role;
    }

 }
