
public class studentclass {
   
    public static class Student{
        String name;
        int rno;
        double percent;
        public Student(String naam, int roll,double percentage){
            name= naam;
            rno = roll;
            percent= percentage;
        }
    }
    public static void main (String[] args){
        Student s1 = new Student("raghav", 76,92.1);
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);
    }
}
    

