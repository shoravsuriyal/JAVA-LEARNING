public class Employee {

    public int basesalary;
    public int hourlyrate;
    //public int extrahours;

    public int calculateWage(int extrahours){

        return basesalary+(hourlyrate*extrahours);

    }
}
