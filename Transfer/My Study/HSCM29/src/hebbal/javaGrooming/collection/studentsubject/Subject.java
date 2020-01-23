package hebbal.javaGrooming.collection.studentsubject;

public class Subject {
	private int subId;
	private String subName;
	private int subMarks;
	private int studId;
	private String studName;
	private int sem;
	private String key;
	private char status;

	public Subject(int subId, String subName, int subMarks, int studId, String studName, int sem, char status) {
		this.subId = subId;
		this.subName = subName;
		this.subMarks = subMarks;
		this.studId = studId;
		this.studName = studName;
		this.sem = sem;
		this.status = status;
	}

	public Subject(String key) {
		this.key = key;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getSubMarks() {
		return subMarks;
	}

	public void setSubMarks(int subMarks) {
		this.subMarks = subMarks;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	@Override
	public String toString() {
		return getStudId() + "\t\t" + getStudName() + "\t\t" + getSem() + "\t\t" + getSubId() + "\t\t" + getSubName()
				+ "\t\t" + getSubMarks()+ "\t\t" + getStatus();
	}

}
