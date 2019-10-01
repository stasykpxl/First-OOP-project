package by.spartakzatawit.film;

import by.spartakzatawit.figure.Figure;
import by.spartakzatawit.figure.Rectangle;
import by.spartakzatawit.paper.Paper;

/**
 * @author  Стас Мохов
 * Класс для описания объектов прямоугольник
 */
public class FilmRectangle extends Rectangle implements Film {
    /** Конструктор - создание нового объекта с определенными значениями
     * @param sideA - сторона А
     * @param sideB - сторона В
     */
    public FilmRectangle(double sideA, double sideB){
        super(sideA, sideB);
    }

    /** Конструктор - создание нового объекта из созданного объекта
     * @param filmFigure - существующий объект
     */
    public FilmRectangle(Film filmFigure){
        super((Figure) filmFigure);
    }

    @Override
    public int getOrdinal() {
        return 10;
    }
}
