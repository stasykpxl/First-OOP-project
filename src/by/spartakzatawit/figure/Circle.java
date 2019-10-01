package by.spartakzatawit.figure;

import java.util.Objects;

/**
 *@author Стас Мохов
 *Абстрактный класс для создания классов фигур Круг
 */
public abstract class Circle extends Figure {
    /** Поле радиус */
    private double radius;

    /** Конструктор - создание нового объекта с определенными значениями
     * @param radius - радиус круга
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /** Конструктор - создание нового объекта из созданного объекта
     * @param figure - существующий объект
     */
    public  Circle(Figure figure){
        this.radius = figure.getMinSize()/2;
    }

    /** Метод получения значения поля
     * @return возвращает значение радиуса
     */
    public double getRadius(){
        return radius;
    }

    /** Метод определения радиуса
     * @param  radius - радиус
     */
    public void setRadius(double radius){
        this.radius = radius;
    }

    /** Метод расчета площади
     * @return возвращает площадь
     */
    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    /** Метод расчета периметра
     * @return возвращает периметр
     */
    @Override
    public double getPerimetr(){
        return Math.PI * radius;
    }

    /** Метод получения строки
     * @return возвращает строку, содержащую имя класса и радиус
     */
    @Override
    public String toString(){
        return super.toString() + ": radius= " + radius;
    }

    /** Метод расчета минимального размера
     * @return возвращает минимальный размер
     */
    @Override
    public double getMinSize(){
        return radius;
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
        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, radius) == 0;
    }

    /** Метод генерации хеш-кода
     * @return возвращает хеш-код
     */
    @Override
    public int hashCode(){
        return Objects.hash(radius);
    }

}
