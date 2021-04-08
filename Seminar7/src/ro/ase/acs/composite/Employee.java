package ro.ase.acs.composite;

public class Employee implements HierarchicalNode{	
	private float salary;
	private String name;
	
	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public float getSalary() {
		return salary;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void addHierarchicalNode(HierarchicalNode node) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void deleteHierarchicalNode(HierarchicalNode node) {
		throw new UnsupportedOperationException();		
	}

	@Override
	public HierarchicalNode searchNodeByName(HierarchicalNode node) {
		return null;
	}

	
}
