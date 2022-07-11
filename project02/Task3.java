package group.project02;

public class Task3 {

    /*
     We have to calculate the average of marks obtained in three subjects by student A and in 4 subjects by student B.
     Create class 'Marks' with an abstract method 'getAverage' that will be returning the average of marks.
     Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks in
     three subjects as its parameters and the marks in four subjects as its parameters for student B. Test your code
     */
}
class MarksTester{
    public static void main(String[] args) {
        System.out.println("Average for A class is "+new A(76,84,92).average());
        System.out.println("Average for B class is "+new B(89,98,100,78).average());
    }
}
interface Marks{
    double average();

}
class A implements Marks{
    double math;
    double bio;
    double chemistry;


    A(double math,double bio, double chemistry){
        this.math=math;
        this.bio=bio;
        this.chemistry=chemistry;


    }
    @Override
    public double average() {
        return (math+bio+chemistry)/3;
    }
}
class B implements Marks{
    double literature;
    double geography;
    double history;
    double algebra;

    public B(double literature, double geography, double history, double algebra) {
        this.literature = literature;
        this.geography = geography;
        this.history = history;
        this.algebra = algebra;
    }

    @Override
    public double average() {
        return (literature+geography+history+algebra)/4;
    }
}
