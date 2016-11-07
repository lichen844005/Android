package P1;

public class C2 extends A1
{
   //private void m2() will not work as derived access modifier can not be more restrictive
   public void m2() { System.out.println("C2m2"); }
   public void m3() { System.out.println("C2m3"); }
}
