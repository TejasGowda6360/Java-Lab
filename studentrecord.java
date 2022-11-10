package advt;

public class studentrecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student[] arr;
		 
	        // Allocating memory for 2 objects
	        // of type student
	        arr = new Student[2];
	 
	        // Initializing the first element
	        // of the array
	        arr[0] = new Student(1911939, "Tejas R", 1);
	 
	        // Initializing the second element
	        // of the array
	        arr[1] = new Student(1911870, "Anil", 10);
	 
	        // Displaying the student data
	        System.out.println(
	            "Student data in student array 0: ");
	        arr[0].display();
	 
	        System.out.println(
	            "Student data in student array 1: ");
	        arr[1].display();
	    }
	}
	 
	// Creating a student class with
	// id and name as a attributes
	class Student {
	 
	    public int id,rank;
	    public String name;
	 
	    // Student class constructor
	    Student(int id, String name,int rank)
	    {
	        this.id = id;
	        this.name = name;
	        this.rank = rank;
	    }
	    // display() method to display
	    // the student data
	    public void display()
	    {
	        System.out.println("Student id is: " + id + " "
	                           + "Student name is: "
	                           + name+" Rank is :"+rank);
	        System.out.println();
	    }
	}


