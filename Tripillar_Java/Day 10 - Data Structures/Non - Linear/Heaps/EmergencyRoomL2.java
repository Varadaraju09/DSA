// Comparator : Multiple Values

import java.time.LocalDateTime;
import java.util.PriorityQueue;
import java.util.Queue;

class Patient {
    String name;
    int severity; // 1 = High, 3 = Medium, 5 = low
    LocalDateTime arrivalTime;

    public Patient(String name, int severity, LocalDateTime arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return name + " (Severity = " + severity + " , arrival = " + arrivalTime + " ) ";
    }
}

public class EmergencyRoomL2 {
    public static void main(String[] args) {
        // Custom Comparator : first by severity, then by arrival time
        Queue<Patient> queue = new PriorityQueue<>(
                (p1, p2) -> {
                    if (p1.severity != p2.severity) {
                        return Integer.compare(p1.severity, p2.severity);
                    } else {
                        return p1.arrivalTime.compareTo(p2.arrivalTime);
                    }
                });
        // Simulating patient arrivals with actual timestamp
        queue.offer(new Patient("Varada", 3,
                LocalDateTime.of(2026, 4, 9, 10, 0)));
        queue.offer(new Patient("Joe", 1,
                LocalDateTime.of(2026, 4, 9, 10, 5)));
        queue.offer(new Patient("Britney", 1,
                LocalDateTime.of(2026, 4, 9, 10, 2)));

        // Let's print the patient who's trated first
        Patient treated = queue.poll();
        System.out.println("Patient that gets operated first " + treated);
        // Remaining Patient
        System.out.println("Patients queue: " + queue);
    }
}
