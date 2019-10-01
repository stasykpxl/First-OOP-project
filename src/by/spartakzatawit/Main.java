package by.spartakzatawit;

import by.spartakzatawit.box.Box;
import by.spartakzatawit.comparators.ComparatorFigure;
import by.spartakzatawit.figure.Figure;
import by.spartakzatawit.film.FilmCircle;
import by.spartakzatawit.film.FilmRectangle;
import by.spartakzatawit.film.FilmTriangle;
import by.spartakzatawit.paper.Paper;
import by.spartakzatawit.paper.PaperCircle;
import by.spartakzatawit.paper.PaperRectangle;
import by.spartakzatawit.paper.PaperTriangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Создание коробки
        Box box = new Box();


        //Создание объектов фигур
        FilmCircle q1 = new FilmCircle(6);
        FilmRectangle q2 = new FilmRectangle(5,5);
        FilmTriangle q3 = new FilmTriangle(5);
        PaperCircle q4 = new PaperCircle(7);
        PaperRectangle q5 = new PaperRectangle(4,6);
        PaperTriangle q6 = new PaperTriangle(4);

        PaperCircle q7 = new PaperCircle(q4);
        FilmCircle q8 = new FilmCircle(q3);
        FilmRectangle q9 = new FilmRectangle(q1);

        FilmTriangle q10 = new FilmTriangle(3.8);
        q4.setColor(Paper.Color.RED);
        q6.setColor(Paper.Color.BLACK);

        //Добавление объектов фигур в коробку
        box.addFigure(q1);
        box.addFigure(q1);// фигура котороая есть в коробке нельзя добавить
        box.addFigure(q2);
        box.addFigure(q3);
        box.addFigure(q4);
        box.addFigure(q5);
        box.addFigure(q6);
        box.addFigure(q7);
        box.addFigure(q8);
        box.addFigure(q9);
        box.addFigure(q10);

        //Вывод эл-ов коробки
        System.out.println(box.toString());

        //Вывод площади и периметра всех фигур
        System.out.printf("\nПлощадь всех фигур: %.3f\n", box.getSumArea());
        System.out.printf("Периметр всех фигур: %.3f\n", box.getSumPerimetr());

        //Замена объекта в коробке
        PaperTriangle q11 = new PaperTriangle(2);
        box.setFigure(2, q11);
        System.out.println("\nФигура 3 - заменена");

        //Поиск эквивалентной фигуры
        System.out.println("\nПоиск эквивалентной фигуры");
        System.out.println(box.patternMatching(q6));

        //Удаление фигуры из коробки
        box.removeFigure(4);
        System.out.println("\nФигура 4 - удалена");

        //Вывод площади и периметра всех фигур
        System.out.printf("Площадь всех фигур: %.3f\n", box.getSumArea());
        System.out.printf("Периметр всех фигур: %.3f\n", box.getSumPerimetr());
        System.out.println("\n" + box.toString());

        System.out.println("Сортировка по форме:");
        Collections.sort(box.getList(), new ComparatorFigure());
        System.out.println(box.toString());

        System.out.println("Сортировка по площади:");
        Collections.sort(box.getList(), new ComparatorFigure.InnerComparator());
        System.out.println(box.toString());

        //Добавление фигур
        PaperCircle qw = new PaperCircle(2);
        qw.setColor(Paper.Color.WHITE);
        PaperRectangle qw2 = new PaperRectangle(3,2);
        qw2.setColor(Paper.Color.RED);
        PaperTriangle qw3 = new PaperTriangle(8);
        qw3.setColor(Paper.Color.YELLOW);
        box.addFigure(new PaperRectangle(qw));
        box.addFigure(new PaperRectangle(qw2));
        box.addFigure(new PaperRectangle(qw3));

        System.out.println("Сортировка по цвету:");
        box.sortByColor();
        System.out.println(box.toString());

        System.out.println("Все круги:");
        System.out.println(box.getAllCircle());

        System.out.println("Все красные круги:");
        System.out.println(box.getAllRedCircle());

        System.out.println("Получение группы фигур:");
        System.out.println(box.getFigureGroup(3, 6));

        System.out.println("Добавление группы фигур:");
        List<Figure> setList = new ArrayList<>();
        setList.add(new FilmCircle(3));
        setList.add(new PaperRectangle(3,5));
        setList.add(new PaperTriangle(9));
        box.setFigureGroup(setList);
        System.out.println(box.toString());

    }
}
