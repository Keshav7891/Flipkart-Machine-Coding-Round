package MachineCoding.Rental.Application;

import java.util.ArrayList;
import java.util.List;

import MachineCoding.Rental.models.Branch;
import MachineCoding.Rental.models.Vehicle;
import MachineCoding.Rental.services.BranchService;

public class Application {

	public static void main(String[] args) {
		
		BranchService branchService = new BranchService();
		
		List<Vehicle> koramangalaVehicles = new ArrayList<>();
		
		Vehicle koramangalaVehicle1 = new Vehicle("suv", 1 , 12, null);
		//3 sedan for Rs.10 per hour”
		Vehicle koramangalaVehicle2 = new Vehicle("sedan", 3 , 10, null);
		//3 bikes for Rs.20 per hour
		Vehicle koramangalaVehicle3 = new Vehicle("bikes", 3 , 20, null);
		
		koramangalaVehicles.add(koramangalaVehicle1);
		koramangalaVehicles.add(koramangalaVehicle2);
		koramangalaVehicles.add(koramangalaVehicle3);
		
		
		Branch koramangalaBranch = branchService.adddBranch("koramangala", koramangalaVehicles);
		
		List<Vehicle> jayanagarVehicles = new ArrayList<>();
		
		Vehicle jayanagarVehicle1 = new Vehicle("sedan", 3, 11, null);
		Vehicle jayanagarVehicle2 = new Vehicle("bikes", 3, 30, null);
		Vehicle jayanagarVehicle3 = new Vehicle("hatchback", 4, 8, null);

		jayanagarVehicles.add(jayanagarVehicle1);
		jayanagarVehicles.add(jayanagarVehicle2);
		jayanagarVehicles.add(jayanagarVehicle3);

		Branch jayanagarBranch = branchService.adddBranch("jayanagar", jayanagarVehicles);

		List<Vehicle> malleshwaramVehicles = new ArrayList<>();

		Vehicle malleshwaramVehicle1 = new Vehicle("suv", 1, 11, null);
		Vehicle malleshwaramVehicle2 = new Vehicle("bikes", 10, 3, null);
		Vehicle malleshwaramVehicle3 = new Vehicle("sedan", 3, 10, null);

		malleshwaramVehicles.add(malleshwaramVehicle1);
		malleshwaramVehicles.add(malleshwaramVehicle2);
		malleshwaramVehicles.add(malleshwaramVehicle3);

		Branch malleshwaramBranch = branchService.adddBranch("malleshwaram", malleshwaramVehicles);

		
		
		System.out.println(koramangalaBranch);
		System.out.println(jayanagarBranch);
		System.out.println(malleshwaramBranch);
		
		branchService.addVehicleToBranch("koramangala", "sedan", 1); 
		
		System.out.println(koramangalaBranch);
		System.out.println(jayanagarBranch);
		System.out.println(malleshwaramBranch);
		
		
		
	}
	
}
