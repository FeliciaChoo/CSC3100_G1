package FINAL;
public class LockerPuzzle {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[101]; // Index 0 is not used, so we use an array of size 101

        // Simulate students opening and closing lockers
        for (int student = 1; student <= 100; student++) {
            for (int locker = student; locker <= 100; locker += student) {
                lockers[locker] = !lockers[locker];
            }
        }

        // Display open lockers
        System.out.println("Open lockers: ");
        for (int locker = 1; locker <= 100; locker++) {
            if (lockers[locker]) {
                System.out.print(locker + " ");
            }
        }
    }
}

