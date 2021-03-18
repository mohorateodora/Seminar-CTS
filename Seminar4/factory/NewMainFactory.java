import ro.ase.cts.after.RestApiFactory;
import ro.ase.cts.after.contracts.RestApi;

public class NewMainFactory {

	public static void main(String[] args) {
		
		RestApi api = RestApiFactory.createConnection("release");
	   api.connect();
	}
	
} 
