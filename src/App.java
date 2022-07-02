import models.Pavillon;
import service.IService;
import service.ServiceTableau;

public class App {
    public static void main(String[] args) throws Exception {
        IService service = new ServiceTableau();
        Pavillon pavillon = new Pavillon();
        pavillon.setId(1);
        pavillon.setNumPav(1);
        pavillon.setNbreDetages(4);
        service.addPavillon(pavillon);
        service.listerPavillon();

    }
}
