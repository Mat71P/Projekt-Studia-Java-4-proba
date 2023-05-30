package controllers;

import models.Assasin;
import models.Warlock;
import models.Warrior;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Class RunController
 */
public class RunController {
    /**
     * Class RunController
     */

    public void run() {
        System.out.println("Witaj w kreatorze");
        System.out.println("wybierz swoją profesje");
        System.out.println("Działający z cienia Assasin");
        System.out.println("Szerzący zament i zniszczenie Warlock");
        System.out.println("Ruszający do przodu Warrior");

        Scanner scanner = new Scanner(System.in);
        String decision = scanner.nextLine();

        switch (decision) {
            case "Assasin" -> {

                Assasin assasin = new Assasin();
                assasin.welcome(decision);
                assasin.breakLine();
                System.out.println("Twoje imie");
                assasin.setName(scanner.nextLine());
                System.out.println("Twój wiek (24-40)");
                int age = Integer.parseInt(scanner.nextLine());
                if (age <24 || age >30){
                    System.out.println("nie wybrano prawidłowego wieku");
                    return;
                }
                assasin.setType(scanner.nextLine());
                System.out.println("Wbybierz swoje oporządznie (shadow boots, invis cloak, smoke grenade");
                String equipment = scanner.nextLine();
                if (!isValidEquipment(equipment)) {
                    System.out.println("Nieprawidłowe oporządzenie");
                    return;
                }
                assasin.setEquipment(equipment);
                System.out.println("czy twoja postać potrafi sie wspinać (tak / nie");
                String canClimb = scanner.nextLine();
                if (!isValidClimb(canClimb)) {
                    System.out.println("błędna odpowiedź");
                    return;
                }
                assasin.setcanClimb(canClimb);
                System.out.println("czy chesz zakończyć proces tworzenia? (tak/nie");
                String confirmation = scanner.nextLine();
                if (confirmation.equalsIgnoreCase("tak")){
                    System.out.println(Arrays.toString(assasin.AssasinData()));
                } else {
                    System.out.println("Anulowanie zakończone");
                }
            }

            case "Warlock" -> {

                Warlock warlock = new Warlock();
                warlock.welcome(decision);
                warlock.breakLine();
                System.out.println("Twoje imie");
                warlock.setName(scanner.nextLine());
                System.out.println("Twój wiek (30-70)");
                int age = Integer.parseInt(scanner.nextLine());
                if (age <30 || age >70){
                    System.out.println("nie wybrano prawidłowego wieku");
                    return;
                }
                warlock.setType(scanner.nextLine());
                System.out.println("Wbybierz swoje oporządznie (Kostur, księga zaklęć, zaklęty miecz");
                String equipment2 = scanner.nextLine();
                if (!isValidEquipment2(equipment2)) {
                    System.out.println("Nieprawidłowe oporządzenie");
                    return;
                }
                warlock.setEquipment2(equipment2);
                System.out.println("czy twoja postać ma zdolność do nekromancji (tak / nie");
                String canNecromancy = scanner.nextLine();
                if (!isValidNecromancY(canNecromancy)) {
                    System.out.println("błędna odpowiedź");
                    return;
                }
                warlock.setcanNecromancy(canNecromancy);
                System.out.println("czy chesz zakończyć proces tworzenia? (tak/nie");
                String confirmation = scanner.nextLine();
                if (confirmation.equalsIgnoreCase("tak")){
                    System.out.println(Arrays.toString(warlock.WarlockData()));
                } else {
                    System.out.println("Anulowanie zakończone");
                }
            }

            case "Warrior" ->{

                Warrior warrior = new Warrior();
                warrior.welcome(decision);
                warrior.breakLine();
                System.out.println("Twoje imie");
                warrior.setName(scanner.nextLine());
                System.out.println("Twój wiek (22-55)");
                int age = Integer.parseInt(scanner.nextLine());
                if (age <22 || age >55){
                    System.out.println("nie wybrano prawidłowego wieku");
                    return;
                }
                warrior.setType(scanner.nextLine());
                System.out.println("Wbybierz swoje oporządznie (topór, miecz, młot");
                String equipment3 = scanner.nextLine();
                if (!isValidEquipment3(equipment3)) {
                    System.out.println("Nieprawidłowe oporządzenie");
                    return;
                }
                warrior.setEquipment3(equipment3);
                System.out.println("czy twoja postać ma zdolność by zamienić sie w Berserka? (tak / nie");
                String canBerserk = scanner.nextLine();
                if (!isValidBerserK(canBerserk)) {
                    System.out.println("błędna odpowiedź");
                    return;
                }

            }
            default -> {
                System.out.println("Błędny wybór");
                this.run();
            }





        }
        this.breakLine();
        System.out.println("tworzenie postaci zakończone");
    }

    private void breakLine() { System.out.println("____________________");
    }

    private boolean isValidBerserK(String canBerserk) {
        return canBerserk.equalsIgnoreCase("tak") || canBerserk.equalsIgnoreCase("nie");
    }

    private boolean isValidEquipment3(String equipment3) {
        String [] validEquipment3 = {"topór, miecz, młot"};
        return Arrays.asList(validEquipment3).contains(equipment3);

    }

    private boolean isValidEquipment2(String equipment2) {
        String [] validEquipment2 = {"Kostur, księga zaklęć, zaklęty miecz"};
                return Arrays.asList(validEquipment2).contains(equipment2);
    }

    private boolean isValidNecromancY(String canNecromancy) {
        return canNecromancy.equalsIgnoreCase("tak") || canNecromancy.equalsIgnoreCase("nie");
    }

    private boolean isValidClimb(String canClimb) {
        return canClimb.equalsIgnoreCase("tak") || canClimb.equalsIgnoreCase("nie");
    }

    private boolean isValidEquipment(String equipment) {
        //logika fałszu i prawdy
        String[] validEquipment = {"shadow boots, invis cloak, smoke grenade"};
        return Arrays.asList(validEquipment).contains(equipment);
    }

    public static void main(String[] args){
        RunController controller = new RunController();
        controller.run();
    }
}
