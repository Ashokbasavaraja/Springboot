package com.sjprogramming.restapi;



import org.springframework.data.jpa.repository.JpaRepository;

import com.sjprogramming.restapi.entity.Student;



public interface studentrepository extends JpaRepository <Student,Integer >{


}
