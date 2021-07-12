package Telusco;


// Inheritance :- "Is a" Relation and "Has a" Relation
// CalcAdv is a Calculato
//while 
// OopsInheritance has a Calculato/ CalcAdv
//Dog is a Animal  means Dog extends Animal
//Bathroom has a Tub means Bathroom has Object Tub
class Calculato  //Parent, Super, Base
{
    public int add(int i,int j)
    {
        return i+j;
    }
}


//to lessen the redudency and duplicacy we use Inheritance

class CalcAdv extends Calculato{  //Sub , Child, Derived
    public int sub(int i,int j)
    {
        return i-j;
    }
}

class CalcVeryAdv extends CalcAdv{
    public int multi(int i, int j)
    {
        return i*j;
    }
}
public class OopsInheritance {
    public static void main(String[] args)
    {
        Calculato c1=new Calculato();
        int result=c1.add(5,4);
        System.out.println(result);
        CalcAdv c2=new CalcAdv();
        int result2=c2.sub(5,4);
        System.out.println(result2);//Inheritance, Single level Inheritance
        CalcVeryAdv c3=new CalcVeryAdv();
        int result3= c3.multi(5,4);
        System.out.println(result3);//Multilevel Inheritance
    }
}
