package com.prodapt.MicroServiceContact.ContactRepository;

import org.hibernate.Session;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.MicroServiceContact.Entity.*;
@Repository
public interface ContactRepository extends JpaRepository<Contactus,Integer> {

	void deleteByid(int id);

}
