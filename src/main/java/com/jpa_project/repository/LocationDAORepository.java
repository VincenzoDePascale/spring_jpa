package com.jpa_project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa_project.model.Location;

@Repository
public interface LocationDAORepository extends CrudRepository <Location, Long>{

}