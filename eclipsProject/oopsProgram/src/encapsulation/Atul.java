package encapsulation;

public class Atul {
	public static void main(String[] args) {
	Student s = new Student();
	s.setName("shohan");
	s.setEmail("atulsingh@3333gmail.com");
	s.setAdd("hyadrabad");
	s.setId(105);
	System.out.println(s.getName());
	System.out.println(s.getEmail());
	System.out.println(s.getAdd());
	System.out.println(s.getId());
	}
}
