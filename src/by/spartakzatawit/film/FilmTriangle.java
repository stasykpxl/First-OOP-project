package by.spartakzatawit.film;

import by.spartakzatawit.figure.Figure;
import by.spartakzatawit.figure.Triangle;
import by.spartakzatawit.paper.Paper;

/**
 * @author  Стас Мохов
 * Класс для описания объектов треугольник
 */
public class FilmTriangle extends Triangle implements Film {
    /** Конструктор - создание нового объекта с определенным значением
     * @param side - сторона
     */
    public FilmTriangle(double side){
        super(side);
    }

    /** Конструктор - создание нового объекта из созданного объекта
     * @param filmFigure - существующий объект
     */
    public FilmTriangle(Film filmFigure){
        super((Figure)filmFigure);
    }

    @Override
    public int getOrdinal() {
        return 10;
    }
}
