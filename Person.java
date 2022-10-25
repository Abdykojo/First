public class Person{
    private String name;
    private int age;
    private String job;
    private String zp;

    public Person() {
    }

    public Person (String name, int age, String job, String zp) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.zp = zp;
    }

    public void info(){
        System.out.println("Name: "+ name+"\n"+ "Age:" +age+"\n"+"Job: "+job+"\n"+"Salary: "+ zp);
    }

}