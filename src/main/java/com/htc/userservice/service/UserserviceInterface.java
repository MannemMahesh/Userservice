package com.htc.userservice.service;
import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.userservice.entity.Userservice;

public interface UserserviceInterface   extends JpaRepository<Userservice, Long>{

}
