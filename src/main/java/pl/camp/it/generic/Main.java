package pl.camp.it.generic;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Queue<String> queue = new Queue();
        queue.push("ABC");
        String elementFromQueue = queue.pop();

        Response<Integer> response1 = new Response();
        Response<String> response2 = new Response();
        Integer integer = response1.getObject();
        String string = response2.getObject();

        Pair<String, Integer> para = new Pair<>();
        String element1 = para.getElement1();
        Integer element2 = para.getElement2();

        //FigureBox<Figure> fb = new FigureBox<Circle>();

        //ArrayList<Number> list = new ArrayList<Integer>();


        Figure f = new Circle();

        Pair<String, Figure> p2 = wrapToPair("ABC", f);


        WildcardGenericClass<Figure, Number> wgc1 = new WildcardGenericClass<>(new Figure(), new Long(2344444L));
        System.out.println(wgc1.figure);
        System.out.println(wgc1.number);

        WildcardGenericClass<Circle, Integer> wgc2 = new WildcardGenericClass<>(new Circle(), new Integer(6));
        System.out.println(wgc2.figure);
        System.out.println(wgc2.number);


    }

    public static <T, T2> Pair <T, T2> wrapToPair(T element1, T2 element2) {
        Pair<T, T2> para = new Pair<>();
        para.setElement1(element1);
        para.setElement2(element2);
        return para;
    }

    public static <T extends Figure> void metoda(T a) {


    }
}
