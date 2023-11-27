package com.crud.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.models.Issue;
import com.crud.demo.repositories.IssueRepository;

@Service
public class IssueServiceImpl implements IssueService{
private final IssueRepository issueRepository;

    @Autowired
    public IssueServiceImpl(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }
    
	@Override
	public List<Issue> getAllIssues() {
        return issueRepository.findAll();
    }


	@Override
	public Issue getIssueById(Long id) {
        Optional<Issue> optionalIssue = issueRepository.findById(id);
        return optionalIssue.orElse(null);
    }

	@Override
	public Issue createIssue(Issue issue) {
        return issueRepository.save(issue);
    }

	@Override
	 public Issue updateIssue(Long id, Issue issue) {
        if (issueRepository.existsById(id)) {
            issue.setId(id); // Ensure the correct ID is set
            return issueRepository.save(issue);
        } else {
            return null; // Issue with the given ID doesn't exist
        }
    }

	@Override
	 public void deleteIssue(Long id) {
        issueRepository.deleteById(id);
    }

}
