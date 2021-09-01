package java8Task1;

class Employee {
   
   private int id;
   private String name;
   
   public Employee(int id, String name){
       this.id = id;
	   this.name = name;
   }
    
   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   }
   public int getID() {
       return id;
   }
   public void setID(int salary) {
       this.id = salary;
   }
   public String toString(){
       return this.name +" "+ this.id;
   }
}
