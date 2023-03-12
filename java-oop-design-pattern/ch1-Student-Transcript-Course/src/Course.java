import java.util.Iterator;
import java.util.Vector;


public class Course {
	private Vector<Transcript> transcripts;
	private String name;

	public Course(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>();
	}
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	public String getName() {
		return name;
	}
	
	public Vector<Student> getStudents() {
		Vector<Student> students = new Vector<Student>();
		Iterator<Transcript> itor = transcripts.iterator();
		
		while (itor.hasNext()) {
			Transcript tr = itor.next();
			students.add(tr.getStudent());
		}
		return students;
	}
}
