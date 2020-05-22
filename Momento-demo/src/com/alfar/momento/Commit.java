package com.alfar.momento;

public class Commit {

	private String Change;

	public Commit(String change) {
		
		this.Change = change;
	}

	public String getChange() {
		return Change;
	}

	public void setChange(String change) {
		this.Change = change;
	}
	

	@Override
	public String toString() {
		return "Commit [Change=" + Change + "]";
	}
	
	
	
	
}
