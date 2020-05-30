package com.employee;

public class PartC {

	public PermanentEmployee[] getHighestToMedianSalary(PermanentEmployee[] perm) {
		// ************************************ TODO C1 ************************************
		/*
		 * This method should print the ratio of Highest Salary to Median Salary of the permanent employees
		 *
		 * This method should return a sorted array of the PermanentEmployee, based on compensation.
		 *
		 *
		 * Uncomment the line "TestYourCode.testHighestToMedianSalary(ratio)" to test your code
		 * Note : Pass the desired ratio as a float value
		 */
		float ratio;
		int n = perm.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (perm[j].getCompensation() > perm[j+1].getCompensation()) {
					PermanentEmployee temp = perm[j];
					perm[j] = perm[j+1];
					perm[j+1]= temp;
				}
			}
		}
		float medianCompensation;
		float highestCompensation = perm[n-1].getCompensation();
		if(n % 2 == 0){
			medianCompensation = (perm[(n - 1) / 2].getCompensation() + perm[n / 2].getCompensation()) / 2;
		}
		else
			medianCompensation = perm[n/2].getCompensation();

		ratio = highestCompensation / medianCompensation;
		System.out.println(ratio);

		// ************************************ SOLUTION C1 BEGIN ************************************

		// Uncomment the line below to test your code
		 TestYourCode.testHighestToMedianSalary(ratio);

		return perm;

		// ************************************ SOLUTION C1 END ************************************
	}
}
