package MachineCoding.Rental.models;

import java.util.List;

public class Branch {
	String branchName;
	
	List<Vehicle> allVehicles;

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public List<Vehicle> getAllVehicles() {
		return allVehicles;
	}

	public void setAllVehicles(List<Vehicle> allVehicles) {
		this.allVehicles = allVehicles;
	}

	@Override
	public String toString() {
		return "Branch [branchName=" + branchName + ", allVehicles=" + allVehicles + "]";
	}
	
}
