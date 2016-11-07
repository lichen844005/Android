package P1;

// final class C1 will produce "Can not inherit from final

class C1
{
   private void m1() { System.out.println("C1m1"); } 
}
public abstract class A1 extends C1
{
   int i;
   public void m1() { System.out.println("A1m1"); } 
   public abstract void m2();
}
