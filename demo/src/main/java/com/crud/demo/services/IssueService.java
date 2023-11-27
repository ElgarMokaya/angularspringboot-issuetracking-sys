package com.crud.demo.services;

import java.util.List;

import com.crud.demo.models.Issue;

public interface IssueService {
	 List<Issue> getAllIssues();

    Issue getIssueById(Long id);

    Issue createIssue(Issue issue);

    Issue updateIssue(Long id, Issue issue);

    void deleteIssue(Long id);

}
