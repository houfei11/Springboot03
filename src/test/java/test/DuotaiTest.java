package test;

/**
 * 多态练习
 */
public class DuotaiTest {
    public static void main(String[] args) {
        GrandFather grandFather1 = new GrandFather();
        GrandFather grandFather2 = new Father();
//        grandFather2.setName("haha");
//
//        System.out.println("name--" + grandFather2.name);
        Father father = new Father();
        Daughter daughter = new Daughter();
        Son son = new Son();
        System.out.println("1--" + grandFather1.show(father));
        System.out.println("2--" + grandFather1.show(daughter));
        System.out.println("3--" + grandFather1.show(son));
        System.out.println("4--" + grandFather2.show(father));
        System.out.println("5--" + grandFather2.show(daughter));
        System.out.println("6--" + grandFather2.show(son));
        System.out.println("7--" + father.show(father));
        System.out.println("8--" + father.show(daughter));
        System.out.println("9--" + father.show(son));
    }
}
class GrandFather {
     public String name = "GrandFather";

     public void setName(String s){
         this.name = s;
     }
    public String show(Son obj) {return ("GrandFather show Son");}
    public String show(GrandFather obj) {return ("GrandGather show GrandFather");}
}

class Father extends GrandFather{
    public String name = "Father";
    @Override
    public void setName(String s){ this.name = s;}
    public String show(Father obj){return ("Father show Father");}
    @Override
    public String show(GrandFather obj){return ("Father show GrandFather");}
}

class Daughter extends Father{}

class Son extends Father{}