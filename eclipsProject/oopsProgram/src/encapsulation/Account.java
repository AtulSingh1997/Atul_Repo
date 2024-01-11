package encapsulation;

 class Account {
	String clintName;
	int clintId;
	public String getClintName() {
		return clintName;
	}
	public void setClintName(String clintName) {
		this.clintName = clintName;
	}
	public int getClintId() {
		return clintId;
	}
	public void setClintId(int clintId) {
		this.clintId = clintId;
	}
	public static void main(String[] args) {
		 Account ac= new  Account();
		 ac.setClintName("Atul");
		 ac.setClintId(101);
		 System.out.println(ac.getClintName());
		 System.out.println(ac.getClintId());
		 
		 
	}

}

