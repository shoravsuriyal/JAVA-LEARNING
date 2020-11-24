public class Main {

    public static void main(String[] args){

        TextBox textBox1=new TextBox();
        TextBox textBox2=new TextBox();
        textBox1.setText("Box 1");
        textBox2.setText("Box 2");
        //textBox1.clear();
        System.out.println(textBox2.text);
        System.out.println(textBox1.text);

        Employee employee=new Employee();

        employee.basesalary=5000;
        employee.hourlyrate=20;
        int wage=employee.calculateWage(40);
        System.out.println(wage);
    }
}
