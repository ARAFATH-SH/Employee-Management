package com.exam.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.exam.entity.Employee;
@Repository
public interface EmpRepo extends JpaRepository <Employee ,Integer >{

}