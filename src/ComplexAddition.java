import java.util.Scanner;

class Complex{
   int real;
   int imag;

   Complex(int r, int i)
   {
      real = r;
      imag = i;
   }

   Complex add(Complex c)
   {
      Complex temp = new Complex(0, 0);
      temp.real = this.real + c.real;
      temp.imag = this.imag + c.imag;
      return temp;
   }

   void display()
   {
      System.out.println( real + " + " + imag + "i");
   }
}


public class ComplexAddition {
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
   
      int r1, i1, r2, i2;

      r1 = input.nextInt();
      i1 = input.nextInt();
      r2 = input.nextInt();
      i2 = input.nextInt();

      Complex c1 = new Complex(r1, i1);
      Complex c2 = new Complex(r2, i2);

      Complex c3 = c1.add(c2);
      c3.display();

      input.close();
   }  
}