import java.util.Scanner;

import models.Pavillon;
import service.IService;
import service.ServiceTableau;

public class App {
    public static void main(String[] args) throws Exception {
        IService service = new ServiceTableau();
        service.menu();
    }
}
