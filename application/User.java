package application;

public class User {
	 private final String name;
	 private final int code;
	 private final String slot;
	
	
	 User(String name,int code,String slot) {
		this.name=name;
		this.code=code;
		this.slot=slot;
		
	}
	public String getName() {
		return name;
	}
	public int getcode() {
		return code;
	}
	public String getslot() {
		return slot;
	}


}
