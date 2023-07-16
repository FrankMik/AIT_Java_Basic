package hw.voter;

public class VoterAppl {
    public static void main(String[] args) {
        VoterHw voter1 = new VoterHw("Antonina ", 47, "russian", "Hauptstr", 25, "Hennef");
        VoterHw voter2 = new VoterHw("Alexander ", 15, "german", "Hauptstr", 240, "Hennef");
        VoterHw voter3 = new VoterHw("John ", 13, "english", "Akazienweg", 6, "Hennef");

        VoterHw[] voters = new VoterHw[3];

        printArray(voters);

    }

    public static void  printArray(Object[]arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

}
