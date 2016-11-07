import java.io.*;
import java.util.*;
import P3.*;
import P1.*;

class C1 extends P3.C1
{
   public void m3() { m2(); System.out.println("P2.C1.m3"); } 
}
public class App
{
   static void PlayI(List<P3.I1> ils) {
      for (P3.I1 i : ils)
         i.m4();
   } 
   static void PlayA(List<P1.A1> a1s) {
      for (P1.A1 i : a1s)
         i.m2();
   }
   public static void main(String[] args) {
      P1.C3 c3 = new P1.C3();
      c3.m1(); c3.m3(); c3.m4();
      C1 c1 = new C1();
      c1.m3();
      List<P3.I1> i1s = new ArrayList<P3.I1>();
      P3.I1 i1 = new P1.C3(); i1s.add(i1);
            i1 = new P1.C4(); i1s.add(i1);
      PlayI(i1s);
      List<P1.A1> a1s = new ArrayList<P1.A1>();
      P1.A1 a1 = new P1.C3(); a1s.add(a1); 
            a1 = new P1.C4(); a1s.add(a1);
      PlayA(a1s);
    }
}
