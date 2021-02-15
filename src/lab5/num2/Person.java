public class Person{
	protected	String firstName;
	protected String lastName;

	public Person(){
		firstName = "";
		lastName = "";

	}

	public Person(String firstName, String lastName){
		setName(firstName, lastName);
	}

	public void setName(String first, String last){
		firstName = first;
		lastName = last;
	}

	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}

	public void printLastFirst(){
		System.out.print(lastName + "," + firstName);
	}

	public void print(){
		System.out.print(firstName + lastName);
	}

	public String toString(){
		return firstName + lastName;
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
