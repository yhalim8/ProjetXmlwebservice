import jakarta.jws.WebService;
import proxy.*;

import java.lang.Exception;
import java.util.List;

public class Clientws {
    public static void main(String[] args) throws Exception {
        Relevewss stub = new RelevewsService().getRelevewssPort();
        Releve re = stub.getreleve();
        Operations ops  = stub.getreleve().getOperations();
        List<Operation> operations = stub.getreleve().getOperations().getOperation();
        System.out.println("RIB : " +re.getRIB());
        System.out.println("Solde : " +re.getSolde());
        System.out.println("de "+ops.getDateDebut() + "\tvers "+ ops.getDateFin());
        for (int i =0 ; i< operations.size();i++)
         System.out.println(operations.get(i).getType() + "\t" + operations.get(i).getMontant()+"\t"+operations.get(i).getDescription()+"\t"+operations.get(i).getDate());





    }


}
