package com.prodapt.prepaid.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.prepaid.Entity.Prepaid;



@Repository
public interface PrepaidRepository extends JpaRepository<Prepaid,Integer> {

	void deleteByid(int id);

}