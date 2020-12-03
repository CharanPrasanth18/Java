import java.util.Scanner;

public class teacher {
    teacher(){
        System.out.println("this is base class");
    }
}
class phy extends teacher{
    phy(){
        System.out.println("Physics teacher");
        System.out.println("this is derived class 1");
    }
}
class chem extends phy{
    chem(){
        System.out.println("Chemistry teacher");
        System.out.println("this is derived class 2 ");
    }
}
class teach {
    public static void main(String[] args) {
      chem c=new chem();
    }
}