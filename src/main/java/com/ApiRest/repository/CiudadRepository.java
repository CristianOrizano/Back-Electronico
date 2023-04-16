package com.ApiRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiRest.entity.Ciudad;



public interface CiudadRepository extends JpaRepository<Ciudad, String> {

}
