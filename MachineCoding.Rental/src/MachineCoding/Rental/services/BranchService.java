package MachineCoding.Rental.services;

import java.util.HashMap;
import java.util.List;

import MachineCoding.Rental.models.Branch;
import MachineCoding.Rental.models.Vehicle;

public class BranchService {
	
	HashMap<String, Branch> branchMap = new HashMap<>();
	
	public BranchService() {
	
	}
	
	public Branch adddBranch(String branchName, List<Vehicle> allVehicles) {
		Branch branch = new Branch();
		branch.setBranchName(branchName);
		branch.setAllVehicles(allVehicles);
		branchMap.put(branchName, branch);
		return branch;
	}
	
	public void addVehicleToBranch(String branchName, String vehicleName, int freq) {
		if(branchMap.containsKey(branchName) == true) {
			Branch branch = branchMap.get(branchName);
			List<Vehicle> allbranchvehicles = branch.getAllVehicles();
			boolean found = false;
			for(Vehicle v : allbranchvehicles) {
				if( (v.getName()).equals(vehicleName)) {
					v.setFreq(v.getFreq() + freq);
					found = true;
				}
			}
			if(found == false) {
				System.out.print(vehicleName + "Not Found");
			}
			branch.setAllVehicles(allbranchvehicles);
		}else {
			System.out.println("Branch Not Found");
		}
	}
	
}
