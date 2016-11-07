package P1;

public class C3 extends C2 implements P3.I1
{
   public void m3() { super.m3(); m2(); m5(); System.out.println("C3m3 called"); }
   public void m4() { System.out.println("C3m4"); }
   private void m5() { System.out.println("C3m5"); }
}
