package ro.ase.acs.main;

import ro.ase.acs.composite.Department;
import ro.ase.acs.composite.Employee;
import ro.ase.acs.composite.HierarchicalNode;
import ro.ase.acs.composite.Manager;

public class MainComposite {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Daniel");
		e1.setSalary(2000);
		Employee e2 = new Employee();
		e2.setName("Andrei");
		e2.setSalary(3000);
		Employee e3 = new Employee();
		e3.setName("Stefan");
		e3.setSalary(4000);
		Manager m1 = new Manager();
		m1.setName("Mircea");
		m1.setSalary(5000);
		Manager m2 = new Manager();
		m2.setName("Ana");
		m2.setSalary(6000);
		Department d = new Department();
		m1.addHierarchicalNode(e1);
		m1.addHierarchicalNode(e2);
		m2.addHierarchicalNode(m1);
		m2.addHierarchicalNode(e3);
		d.setName("Financial");
		System.out.println(m2);
		m1.deleteHierarchicalNode(e1);
		d.addHierarchicalNode(e1);
		m2.addHierarchicalNode(d);
		System.out.println(m2);
		HierarchicalNode node = m1.searchNodeByName("Andrei");
		System.out.println(node);
	}
}
