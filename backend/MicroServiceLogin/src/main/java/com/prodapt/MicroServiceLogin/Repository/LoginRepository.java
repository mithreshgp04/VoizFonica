package com.prodapt.MicroServiceLogin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.MicroServiceLogin.Entity.Login;



@Repository
public interface LoginRepository extends JpaRepository<Login,Integer> {

	void deleteByid(int id);

}