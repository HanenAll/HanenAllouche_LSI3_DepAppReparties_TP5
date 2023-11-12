package rmiClient;
import java.rmi.Naming;
import rmiService.IConversion;
public class ConversionClient {

	public static void main(String[] args) {
		try {
			IConversion stub=(IConversion)Naming.lookup("rmi://localhost:1099/ObjectDistant");
			// localhost c l@ IP, 1099 c le port, et ObjectDistant c la ref
			// lookup() S un remote donc on va fait la consersion a IConversion
			// on a creer un stub qui est deja creer dans 
			System.out.println(stub.convertirMontant(1500));
			System.out.println(stub.convertirMontant(1000));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
