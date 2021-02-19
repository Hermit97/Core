public class Person{
	private	String firstName;
	private String lastName;

	public Person(){
		firstName = "";
		lastName = "";

	}

	public Person(String firstName, String lastName){
		setName(lastName, firstName);
	}

	public void setName(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}

	public String printLastFirst(){
		return lastName + ", " + firstName;
	}

	public void print(){
		System.out.print(lastName + " " + firstName);
	}

	public String toString(){
		return printLastFirst(); 
	}

	public boolean equals(Object obj) {
      if (obj instanceof Person) {
          Person otherPerson = (Person) obj;
          return lastName.equals(otherPerson.lastName) && firstName.equals(otherPerson.firstName);
      }
      else   // not a Person object
          return false;
	  }

	//Copy constructor
	public Person(Person original){
		if(original == null){
			System.out.println("Fatal error for this person. ");
			System.exit(0);
	}
	firstName = original.firstName;
	lastName = original.lastName;
	}
}
