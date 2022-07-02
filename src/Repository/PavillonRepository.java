package Repository;

import java.util.Scanner;

import models.Pavillon;

public class PavillonRepository {
    Scanner sc = new Scanner(System.in);

    public Pavillon saisi() {
        Pavillon pavillon = new Pavillon();
        System.out.println("Donner le num du pavillon");
        pavillon.setNumPav(sc.nextInt());
        System.out.println("Donner le nombre d' etage");
        pavillon.setNbreDetages(sc.nextInt());
        return pavillon;
    }
}
