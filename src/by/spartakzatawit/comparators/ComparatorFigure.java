package by.spartakzatawit.comparators;

import by.spartakzatawit.figure.Figure;

import java.util.Comparator;

/**
 * Класс для сравнения фигур по форме
 * @author Стас Мохов
 */
public class ComparatorFigure implements java.util.Comparator<Figure> {
    /**Метод сравнения фигур по форме*/
    @Override
    public int compare(Figure o1, Figure o2){
        String str1 = o1.getClass().getSimpleName();
        if (str1.contains("Film")){
            str1 = str1.substring(4);
        }else{
            str1 = str1.substring(5);
        }
        String str2 = o2.getClass().getSimpleName();
        if (str2.contains("Paper")){
            str2 = str2.substring(5);
        }else{
            str2 = str2.substring(4);
        }
        return str1.compareTo(str2);
    }

    /**
     * Внутренний статический класс для сравнения фигур по площади
     * @author Стас Мохов
     */
    public static class InnerComparator implements Comparator<Figure>  {
        /**Метод сравнения фигур по площади*/
        @Override
        public int compare(Figure o1, Figure o2){
           return (int) (Math.round(o1.getArea()) - Math.round(o2.getArea()));
        }
    }
}
