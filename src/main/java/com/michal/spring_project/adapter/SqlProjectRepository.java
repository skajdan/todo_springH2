package com.michal.spring_project.adapter;

import com.michal.spring_project.model.Project;
import com.michal.spring_project.model.ProjectRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface SqlProjectRepository extends ProjectRepository, JpaRepository<Project, Integer> {
    @Override

    @Query("select distinct p from Project p join fetch p.steps")
    List<Project> findAll();
}
