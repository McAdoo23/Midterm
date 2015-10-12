package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	public UUID SectionID; 
	public UUID StudentID;
	public UUID EnrollmentID;
	public double Grade;
	
	private Enrollment(){
	}
	public Enrollment(UUID StudentID, UUID SectionID){
		this.StudentID = StudentID;
		this.SectionID = SectionID;
	}
	public void setGrade(double Grade){
		this.Grade = Grade;
	}
}
