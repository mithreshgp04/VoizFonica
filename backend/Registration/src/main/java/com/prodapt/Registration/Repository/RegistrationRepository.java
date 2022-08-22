package com.prodapt.Registration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.prodapt.Registration.Entity.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Integer> {

	void deleteByid(int id);

}
