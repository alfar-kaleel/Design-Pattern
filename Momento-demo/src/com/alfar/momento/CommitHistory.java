package com.alfar.momento;

import java.util.Stack;

public class CommitHistory {
	
	
	Stack<Project.ProjectMomento> history = new Stack<>();
	
	
	public void save (Project project) {
		
		
		history.push(project.saveChanges());
	}
	
	public void revert(Project project) {
		
		if(!history.isEmpty()) {
			
			project.revert(history.pop());
			
		}
		
		else {
			
			System.out.println("Project has no commit to pop");
		}
	}

}
