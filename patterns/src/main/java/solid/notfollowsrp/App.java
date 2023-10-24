package solid.notfollowsrp;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Reminder reminder = new Reminder();
        Reminder doCoding = new Reminder(101, "Coding", LocalDateTime.of(2023, 1, 16, 10, 15, 4));
        Reminder watchingCricket = new Reminder(102, "Watching Cricket match", LocalDateTime.of(2023, 1, 16, 10, 15, 4));
        Reminder workout = new Reminder(104, "I hava to go for the workout", LocalDateTime.of(2023, 1, 16, 10, 15, 4));

        reminder.addReminder(doCoding);
        reminder.addReminder(watchingCricket);
        reminder.addReminder(workout);
        reminder.printReminder();

        reminder.saveReminders("Monday Reminder");

//        System.out.println("*********************");
//        reminder.removeReminder(3);
//        reminder.printReminder();
    }
}
