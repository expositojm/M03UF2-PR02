import java.time.LocalDate;

public class EventDate {
    private LocalDate date;

    public EventDate(int year, int month, int day) {
        this.date = LocalDate.of(year, month, day);
    }

    public EventDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDate(int year, int month, int day) {
        this.date = LocalDate.of(year, month, day);
    }

    public String showDate() {
        return "Fecha del evento: " + date;
    }


}

