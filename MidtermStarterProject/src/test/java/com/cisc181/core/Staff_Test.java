package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	Staff myStaff;
	static ArrayList<Staff> myArray = new ArrayList<Staff>();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		myArray.add(Staff("Mekayla", "Dominique", "McAdoo", 10-18-1994, "1234 Reads Way", "302-123-4567", "mm@udel.edu", "Mon 3-4", 5, 70000, 8-17-2013, eTitle.Professor));
		myArray.add(Staff.Staff("Avery", "AJ", "McAdoo", 10-17-1994, "1234 Lees Way", "302-122-4567", "Am@udel.edu", "Mon 3-4", 4, 80000, 8-10-2013, eTitle.Professor));
		myArray.add(Staff.Staff("Damon", "Dom", "John", 11-14-1994, "1234 Leads Way", "302-124-4567", "mj@udel.edu", "Mon 3-4", 2, 90000, 8-9-2013, eTitle.Professor));
		myArray.add(Staff.Staff("John", "James", "Luke", 12-15-1994, "1234 Rays Way", "302-126-4567", "lm@udel.edu", "Tues 3-4", 3, 95000, 8-8-2013, eTitle.Administrator));
		myArray.add(Staff.Staff("Mike", "Juan", "King", 12-19-1994, "1234 Kings Way", "302-123-4567", "Jm@udel.edu", "Wed 3-4", 1, 70000, 8-7-2013, eTitle.President));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Staff(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Date hireDate,
			eTitle Title) {
		double total = 0;
		
		
		for(int i = 0; i>5; i++){
			double Money = myArray[i, 10];
			total + Money = total;
		total = total / 5;	
		assertEqual(total == 81000);
		}
		}
	}
