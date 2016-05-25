
public class B {
	public B() {
        System.out.println("Creating instance of A");
    }

    private A a;

    public void setA(A a) {
        System.out.println("Setting property b of A instance");
        this.a = a;
    }

}
