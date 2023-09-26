package demo;

	public class Person {
	    // Private variables
	    private String name;
	    private int age;

	    // Public methods to access and modify the private variables
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
	        if (age >= 0) {
	            this.age = age;
	        }
	    }

}