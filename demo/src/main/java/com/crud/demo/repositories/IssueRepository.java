package com.crud.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.models.Issue;


@Repository
public interface IssueRepository extends JpaRepository<Issue, Long> {

}
