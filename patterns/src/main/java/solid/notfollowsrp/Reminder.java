package solid.notfollowsrp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Reminder {

    private int reminderId;
    private String note;
    private LocalDateTime time;
    private List<Reminder> reminderList = new ArrayList<>();

    public Reminder() {
    }

    public Reminder(int reminderId, String note, LocalDateTime time) {
        this.reminderId = reminderId;
        this.note = note;
        this.time = time;
    }

    public void addReminder(Reminder reminder) {
        boolean isValid = validateReminder(reminder);
        if (!isValid) {
            throw new RuntimeException("Reminder entered is not valid, please check it once again: " + reminder);
        }
        reminderList.add(reminder);
    }

    public void printReminder() {
        reminderList.forEach(System.out::println);
    }

    public void removeReminder(int reminderId) {
        if (reminderId >= 0 && reminderId < reminderList.size()) {
            reminderList.remove(reminderId);
        } else {
            throw new IllegalArgumentException("Invalid reminder ID: " + reminderId);
        }
    }

    public int getReminderId() {
        return reminderId;
    }

    public void setReminderId(int reminderId) {
        this.reminderId = reminderId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reminder reminder1 = (Reminder) o;
        return reminderId == reminder1.reminderId && Objects.equals(note, reminder1.note) && Objects.equals(time, reminder1.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reminderId, note, time);
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "reminderId=" + reminderId +
                ", note='" + note + '\'' +
                ", time=" + time +
                '}';
    }

    public void saveReminders(String fileName) {
        File directory = new File("C:\\Users\\HP\\OneDrive\\Desktop\\Reminders");
        if (!directory.exists()) {
            if (!directory.mkdirs()) {
                throw new RuntimeException("Failed to create directory: " + directory);
            }
        }

        File outputFile = new File(directory, fileName);

        try (PrintStream writer = new PrintStream(outputFile)) {
            for (Reminder reminder : reminderList) {
                writer.println(reminder);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Failed to save reminders to file: " + e.getMessage(), e);
        }
    }

    private boolean validateReminder(Reminder reminder) {
        return reminder.getReminderId() > 0 && !reminder.getNote().isBlank();
    }
}
