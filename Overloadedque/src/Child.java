public class Child extends Parent{

    private int c_age;
    Child()//Intializing the values in the constructor
    {
        c_age=23;
        p_age=25;
    }
    Child(int c_age,int p_age)//Another -way of passing the arguments to intialize the constructor
    {

       this.c_age= c_age;
       this.p_age= p_age;
        System.out.println("Age of child and parent" + c_age + p_age);
        //Here the child constructor gonna invoked by default if there is no parameterised constructor.If it is invoked it gonna print c_age and p_age values.
    }


   public Child(int c_age)//parameterised constructor
    {
        this.c_age=c_age;
        System.out.println("Age of child" +  c_age );
    }
}


