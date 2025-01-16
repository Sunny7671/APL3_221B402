public class LE0
{
	public static void main(String[] args) {
		JUET t = new JUET();
		t.setAge(21);
		t.setName("SUNNY");
		int a = t.getAge();
		String n = t.getName();
		System.out.println(a);
		System.out.println(n);
		
	}
}
class JUET{
    protected int age;
    protected String name;
    protected void setAge(int age) {
        this.age = age;
    }
    protected int getAge() {
        return age;
    }
    protected void setName(String name) {
        this.name = name;
    }
    protected String getName() {
        return name;
    }
}
