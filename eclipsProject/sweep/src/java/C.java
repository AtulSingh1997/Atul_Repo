package java;

class C {
	private String name ;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
   class B{
	public static void main(String [] args) {
		C a = new C();
		a. setName("Atul");
		a.setAge(45);
		System.out.println("Name: "+a.getName());
		System.out.println("Age:"+a.getAge());
		
	}
	
}
