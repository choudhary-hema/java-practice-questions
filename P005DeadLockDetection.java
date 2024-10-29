// Problem 5: Deadlock Detection
// Task: Create a scenario that demonstrates a deadlock situation with two threads and two resources.

class Reader {
    private int id;
    private String name;
    private Marks marks;

    public Reader(int id, String name, Marks marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public synchronized void setResult(Marks result) {
        System.out.println(Thread.currentThread().getName() + ": Locked Student object and trying to lock Result");
        synchronized (marks) {
            System.out.println(Thread.currentThread().getName() + ": Locked Result object");
        }
    }

    public synchronized void displayStudent() {
        System.out.println("Student ID: " + id + ", Name: " + name);
    }
}

class Marks {
    private int totalMarks;
    private int scoredMarks;

    public Marks(int totalMarks, int scoredMarks) {
        this.totalMarks = totalMarks;
        this.scoredMarks = scoredMarks;
    }

    public synchronized void setStudent(Reader reader) {
        System.out.println(Thread.currentThread().getName() + ": Locked Result object and trying to lock Student");
        synchronized (reader) {
            reader.displayStudent();
            System.out.println(Thread.currentThread().getName() + ": Locked Student object");
        }
    }
}

public class P005DeadLockDetection {
    public static void main(String args[]) {
        Marks marks = new Marks(100, 59);
        Reader reader = new Reader(1, "John",marks);

        Thread t1 = new Thread(() -> {
            reader.setResult(marks);
        }, "Thread1");

        Thread t2 = new Thread(() -> {
            marks.setStudent(reader);
        }, "Thread2");

        t1.start();
        t2.start();
    }
}
