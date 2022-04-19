package day36_inheritance;

public class Child extends Parent{

    Child(){
        super();
        System.out.println("Child cons calıstı");
    }

    //tum classlarda biz gormesek de ilk satirinda default cons vardir
    //tüm cons ilk satirinda biz gormesek de super(parent) cons call vardir
    //yani parent clasin parametresiz cons call


    public static void main(String[] args) {

        Child child = new Child();

    }
}
