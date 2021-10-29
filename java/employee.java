class Employee
{
     String name;
     int salary;
     Employee()
     {
          name = null;
          salary = 0;
     }
     Employee (String name, int salary)
     {
          this.name = name;
          this.salary = salary;
     }
     int getSalary()
     {
          return salary;
     }
}
class Manager extends Employee
{
     int inc ;
     Manager()
     {
          super();
          inc = 0;
     }
     Manager(String n, int sal, int h)
     {
          super(n, sal);
          inc = h;
         
     }
     int getSalary()
     {
          return (super.getSalary()+inc);
     }
}
class Labour extends Employee
{
     int ovr;
     Labour()
     {
          super();
          ovr = 0;
     }
     Labour(String n, int sal, int a)
     {
          super(n, sal);
          ovr =a;
     }
     int getSalary()
     {
          return (super.getSalary()+ovr);
     }
}
class Main
{
     public static void main(String[] args)
     {
          Manager m1 = new Manager("Nikhil",20000,1500);
          System.out.println("Salary of Manager alonfg with incentive= "+m1.getSalary());
          
          Labour l1 = new Labour("Nimit",5000,570);
          System.out.println("Salary of Labour along with overtime= "+l1.getSalary());
     }
}