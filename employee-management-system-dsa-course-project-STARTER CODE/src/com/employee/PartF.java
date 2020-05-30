package com.employee;


public class PartF {

	SingleLinkedList empList = new SingleLinkedList();

	public SingleLinkedList newEmployeeStructure(PermanentEmployee[] perm) {

		// ************************************ TODO F2 ************************************
		/*
		 * This method should form a linkedlist containing objects of type
		 * PermanentEmployee and should return the linkedlist
		 *
		 * You are required to implement LinkedList from scratch and add all the objects
		 * of perm array to your linked List
		 *
		 * Uncomment line "TestYourCode.testNewEmployeeStructure(tail)" to test your code
		 * Note : this method takes the tail of type Node of your linkedList as a parameter.
		 *
		 */

		// ************************************ SOLUTION F2 BEGIN ************************************
		for(int i =0 ; i< perm.length ; i++) {
			empList.addNode(perm[i]);
		}

		int lastEmployeeId = 0;
		if(empList.tail.next == null) {
			lastEmployeeId = empList.tail.employee.getId();
			System.out.println(lastEmployeeId);
		}


		// Uncomment the line below to test your code
		 TestYourCode.testNewEmployeeStructure(lastEmployeeId);

		return empList;
		// ************************************ SOLUTION F2 END ************************************
	}

	


	public SingleLinkedList addNewEmployee(SingleLinkedList empList, PermanentEmployee perm) {

		// ************************************ TODO F3 ************************************
		/*
		 * This method should add an employee in the linkedlist
		 * and return the updated linkedlist
		 * Note : the linked list remains ordered based on the permanent Ids
		 *
		 * Uncomment line "TestYourCode.testAddNewEmployee(position)" to test your code
		 * Note : this method takes the position of type integer at which the object is added as a parameter
		 *
		 */

		// ************************************ SOLUTION F3 BEGIN ************************************

		empList.addNode(perm);
		Node temp = empList.head;

		int position = 1;
		if (perm.getId() < temp.employee.getId()) {
			Node temp1 = empList.head;
			empList.head = new Node(perm);
			empList.head.next = temp1;
		} else {

			while (temp.next != null && temp.next.employee.getId() < perm.getId()) {
				position++;
				temp = temp.next;
			}

			Node temp2 = temp.next;
			temp.next = new Node(perm);
			temp.next.next = temp2;

			if (temp.next.next == null) {
				empList.tail = temp.next;
			}
			position++;
			System.out.println(position);
		}



		// Uncomment the line below to test your code
		 TestYourCode.testAddNewEmployee(position);

		return empList;
		// ************************************ SOLUTION F3 END ************************************
	}



	public SingleLinkedList removeAbscondedEmployee(SingleLinkedList empList) {

		// ************************************ TODO F4 ************************************
		/*
		 * This method should remove an employee from the linkedlist
		 * Note : Your task is to print the id of the employee that gets removed.
		 * This method should return the updated linkedlist
		 *
		 * Uncomment the line "TestYourCode.testRemoveAbscondedEmployee(abscondedEmployee)" to test your code
		 * Note : this method takes abscondedEmployee of type Node as a parameter.
		 */
		int len = 0;

		Node temp = empList.head;
		Node temp1 = empList.head;

		while(temp != null)
		{
			temp = temp.next;
			len++;
		}

		int i=2, abscondedEmployee;

		while(i < len-4 && temp1 != null)
		{
			temp1 = temp1.next;
			i++;
		}

		abscondedEmployee = temp1.next.employee.getId();

		System.out.println(abscondedEmployee);

		// ************************************ SOLUTION F4 BEGIN ************************************



		// Uncomment the line below to test your code
		 TestYourCode.testRemoveAbscondedEmployee(abscondedEmployee);

		return empList;
		// ************************************ SOLUTION F4 END ************************************
	}
}
