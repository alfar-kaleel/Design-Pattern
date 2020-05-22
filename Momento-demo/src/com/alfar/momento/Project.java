package com.alfar.momento;

import java.util.ArrayList;

public class Project {
	
	 ArrayList<Commit> commits = new ArrayList<Commit>();
	
	public void addCommit(Commit commit) {
		
		commits.add(commit);
		
	}
 
	
	
	
	
	public ArrayList<Commit> getCommits() {
		return (ArrayList<Commit>) commits.clone();
	}



  public ProjectMomento saveChanges() {
	  
	  return new ProjectMomento(getCommits());
  }
  

  public void revert(ProjectMomento projectmomento) {
	  
	  
	  commits = projectmomento.getCommits();
  } 




	@Override
	public String toString() {
		return "Project [commits=" + commits + "]";
	}





	static class ProjectMomento{
		
		
		ArrayList<Commit> commits;
		
		public ProjectMomento(ArrayList<Commit> commits) {
			
			this.commits = commits;
		}

		private ArrayList<Commit> getCommits() {
			return commits;
		}

		
		
		
		
		
		
		
		
	}


	
}
