package collection;

import java.io.*;
import java.util.*;
class Patient {
    private final String name;
    private final int severity;

    public Patient (String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }
}
public class HospitalTriageSystem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Patient> pq = new PriorityQueue<>((a, b) -> b.getSeverity() - a.getSeverity());

        System.out.print("\nEnter total number of patients : ");
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter patient name : ");
            String name = br.readLine();
            System.out.print("Enter Severity of " + name + " : ");
            int severity = Integer.parseInt(br.readLine());

            pq.add(new Patient(name,severity));
        }

        System.out.println();
        int i = 1;
        for (Patient p : pq) {
            System.out.println(i++ + ") " + p.getName() + " : " + p.getSeverity());
        }
    }
}