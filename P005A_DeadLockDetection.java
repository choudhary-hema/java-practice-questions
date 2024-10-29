//Problem 5.1: Deadlock Detection
class Student {
	
	private int id;
	private String name; 
	private Result result;
	
	public Student() {
		
	}
	public Student(int id, String name, Result result) {
		this.id = id;
		this.name = name;
		this.result = result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
	
}
class Result {
	
	private int totalMarks;
	private int scoredMarks;
	
	public Result() {
		
	}
	public Result(int totalMarks, int scroedMarks) {
		this.totalMarks = totalMarks;
		this.scoredMarks = scroedMarks;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public int getScoredMarks() {
		return scoredMarks;
	}

	public void setScoredMarks(int scoredMarks) {
		this.scoredMarks = scoredMarks;
	}
	
}
public class P005A_DeadLockDetection {

	public static void main(String args[]) {
		Student s1 = new Student();
		Result r1 = new Result();
		
		Thread t1 = new Thread(() -> {
			s1.setId(1);
			s1.setName("John");
			s1.setResult(r1);
		});
		Thread t2 = new Thread(() -> {
			r1.setScoredMarks(59);
			r1.setTotalMarks(100);
		});
		t1.start();
		t2.start();
		
	}
}
