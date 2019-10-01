package by.spartakzatawit.paper;

import by.spartakzatawit.figure.Circle;
import by.spartakzatawit.figure.Figure;

import java.util.Objects;

/**
 * @author  Стас Мохов
 * Класс для описания объектов круг
 */
public class PaperCircle extends Circle implements Paper {
    /** Поле для хранения цвета */
    private Painted painted = new Painted();

    /** Конструктор - создание нового объекта с определенным значением
     * @param radius - радиус
     */
    public PaperCircle(double radius){
        super(radius);
    }

    /** Конструктор - создание нового объекта из созданного объекта
     * @param paperFigure - существующий объект
     */
    public PaperCircle(Paper paperFigure){
        super((Figure)paperFigure);
        painted = paperFigure.getPainted();
    }

    /** Метод получения цвета
     * @return возвращает цвет
     */
    @Override
    public Color getColor(){
        return painted.getColor();
    }

    /** Метод определения цвета
     * @param color - цвет
     */
    @Override
    public void setColor(Color color){
        painted.setColor(color);
    }

    /** Метод получения цвета
     * @return - возвращает цвет пакраски
     */
    @Override
    public Painted getPainted(){
        return painted;
    }

    /** Метод получения строки
     * @return возвращает строку, содержащую имя класса, радиус и цвет
     */
    @Override
    public String toString(){
        return super.toString() + ", painted= " + painted.getColor();
    }

    /** Метод сравнения объектов
     * @param obj - существующий объект
     * @return возвращает результат сравнения полей покраска
     */
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (!super.equals(obj)){
            return false;
        }
        PaperCircle paperCircle = (PaperCircle) obj;
        return Objects.equals(paperCircle.painted, painted);
    }

    /** Метод генерации хеш-кода
     * @return возвращает хеш-код
     */
    @Override
    public int hashCode(){
        return Objects.hash(getRadius(), painted);
    }

    @Override
    public int getOrdinal() {
        if (this.painted.getColor() == null){
            return 10;
        }else{
            return  this.painted.getColor().ordinal();
        }
    }
}
