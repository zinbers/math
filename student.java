package mycode;

public class student {
	String name;
	int id;
	int age;
	String gender;
	int weight;
	computer com;
	
	//动态行为
	public void study()
	{
		System.out.println(name + "在学习");
	}
    public void sayhello(String sname)
    {
    	System.out.println(name + "向" + sname + "说你好");
    }
}
