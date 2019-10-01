package by.spartakzatawit.figure;

import java.util.Objects;

/**
 *@author Стас Мохов
 *Абстрактный класс для создания классов фигур треугольник
 */
public abstract class Triangle extends Figure {
    /** Поле сторана */
    private double side;

    /** Конструктор - создание нового объекта с определеннымизначенем
     * @param side - сторона
     */
    public Triangle(double side){
        this.side = side;
    }

    /** Конструктор - создание нового объекта из созданного объекта
     * @param figure - существующий объект
     */
    public Triangle(Figure figure){
        this.side = figure.getMinSize()/2;
    }

    /** Метод определения стороны
     * @param  side - сторона
     */
    public void setSide(double side) {
        this.side = side;
    }

    /** Метод получения значения поля
     * @return возвращает значение стороны
     */
    public double getSide() {
        return side;
    }

    /** Метод расчета площади
     * @return возвращает площадь
     */
    @Override
    public double getArea(){
        return (Math.sqrt(3)/4) * Math.pow(side, 2);
    }

    /** Метод расчета периметра
     * @return возвращает периметр
     */
    @Override
    public double getPerimetr(){
        return side * 3;
    }

    /** Метод получения строки
     * @return возвращает строку, содержащую имя класса и значение поля
     */
    @Override
    public String toString(){
        return super.toString() + ": side= " + side;
    }

    /** Метод расчета минимального размера
     * @return возвращает минимальный размер
     */
    @Override
    public  double getMinSize(){
        return side;
    }

    /** Метод сравнения объектов
     * @param obj - существующий объект
     * @return возвращает результат сравнения полей объектов
     */
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (!super.equals(obj)){
            return false;
        }
        Triangle triangle = (Triangle) obj;
        return Double.compare(triangle.side, side) == 0;
    }

    /** Метод генерации хеш-кода
     * @return возвращает хеш-код
     */
    @Override
    public int hashCode(){
        return Objects.hash(side);
    }
}
