package MachineCoding.Rental.utils;

public class IdGenerator {

	public static int customId = 0;
	
	public static int getNextId() {
		customId++;
		return customId;
	}
	
}
