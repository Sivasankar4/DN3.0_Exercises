package main.java.com.code.api.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.code.api.entity.Customer;
@Repository
public interface customerRepository  extends JpaRepository<Customer, Integer>{
	 //Optional<Customer> findByUsername(String username);
	 
	 Optional<Customer> findByEmailid(String email);
	  //Boolean existsByEmail(String email);

}