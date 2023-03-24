package task;

public class Objectandclass {
	
	
		private String name;
		private String college;
		
		public Objectandclass(String name, String college) 
		{
			name = name;
			college = college; 
			System.out.println(name+" "+college);
		}
		
		
		public String getName() 
		{
			return name;
		}
		
		public void setName(String name)
		{
			this.name = name;
	
		}
		
		public String getCollege() 
		{
			return college;
		}
		
		public void setCollege(String college) 
		{
			this.college = college;
		}
		
		public static void main(String[] args) 
		{
			Objectandclass student = new Objectandclass("Ramesh", "BVB");
			Objectandclass student2 = new Objectandclass("Prakash", "GEC");
			Objectandclass student3 = new Objectandclass("Pramod", "IIT");
			
		}
}
