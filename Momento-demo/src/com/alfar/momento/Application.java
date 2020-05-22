package com.alfar.momento;

public class Application {
	
	
	public static void main(String[] args) {
	
	CommitHistory commithistory = new CommitHistory();
	
	Project project = new Project();
	
	project.addCommit(new Commit("edit variable name"));
	
	project.addCommit(new Commit("Add variables"));
	
	commithistory.save(project);
	System.out.println(project);
	
	
	project.addCommit(new Commit("Modify the method"));
	
	commithistory.save(project);
	System.out.println(project);
	
	
	
	project.addCommit(new Commit("Add new class"));
	//commithistory.save(project);
	System.out.println(project);
	
	commithistory.revert(project);
	
	System.out.println(project);
	
	
	commithistory.revert(project);
	
	System.out.println(project);
	
	
	commithistory.revert(project);
	
	//System.out.println(project);
	
	//commithistory.revert(project);
	
	//System.out.println(project);
	}

}
