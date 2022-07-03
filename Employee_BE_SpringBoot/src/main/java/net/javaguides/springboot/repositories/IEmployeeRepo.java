package net.javaguides.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Employee;

// jpa repo internally extends paging and sorting repos
// Jpa Repository will take DB table name and datatype of the peimarimary key as parameters
@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Long> {
	
		

}
