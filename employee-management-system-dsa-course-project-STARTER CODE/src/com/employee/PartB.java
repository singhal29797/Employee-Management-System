package com.employee;

public class PartB {

	public void searchForAnEmployee(PermanentEmployee[] perm, int id) {
		// ************************************ TODO B1 ************************************
		/*
		 * This method should print the contact number of corresponding employee if
		 * present else the method should print : "Employee not in the records"
		 * 
		 * Uncomment the line containing "TestYourCode.testSearchForAnEmployee(str)" to test your code 
		 * Note : str is the contact number of the corresponding employee;
		 */
		String str ="";
		int left = 0;
		int right = perm.length - 1;
		while (left <= right) {
			int mid = left + (right-left) /2;
			if (id == perm[mid].getId()){
				str = String.valueOf(perm[mid].getContact());
			}
			if (id < perm[mid].getId()) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		System.out.println(str);


		// ************************************ SOLUTION B1 BEGIN ************************************

		


		// Uncomment below line to test your code
		 TestYourCode.testSearchForAnEmployee(str);

		// ************************************ SOLUTION B1 END ************************************
	}
}
