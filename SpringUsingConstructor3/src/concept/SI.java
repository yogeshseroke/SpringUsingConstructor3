package concept;

public class SI {
	private float p,r,t;
	public SI(float p, float r, float t)
	{
		this.p=p;
		this.r=r;
		this.t=t;
	}
	public void calcSi()
	{
		System.out.println("Result is "+(p*r*t)/100);
	}

}
