
public class Student {
	
	//���������
	private String name;
	private String id;
	
	public Student() {
		name = "not defined yet";
		id = "not defined yet";
	}
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	//�������
	public void printInfo() {
		System.out.println("My name is: " + name);
		System.out.println("My id is: " + id);
	}
	
	

}
