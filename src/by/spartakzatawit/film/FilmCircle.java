package by.spartakzatawit.film;

import by.spartakzatawit.figure.Circle;
import by.spartakzatawit.figure.Figure;
import by.spartakzatawit.paper.Paper;

/**
 * @author  Стас Мохов
 * Класс для описания объектов круг
 */
public class FilmCircle extends Circle implements Film {
    /** Конструктор - создание нового объекта с определенным значением
     * @param radius - радиус
     */
    public FilmCircle(double radius){
        super(radius);
    }

    /** Конструктор - создание нового объекта из созданного объекта
     * @param filmFigure - существующий объект
     */
    public FilmCircle(Film filmFigure){
        super((Figure) filmFigure);
    }

    @Override
    public int getOrdinal() {
        return 10;
    }
}
