package by.spartakzatawit.figure;

import java.util.Objects;

/**
 *@author Стас Мохов
 *Абстрактный класс для создания классов фигур прямоугольник
 */
public abstract class Rectangle extends Figure {
    /** Поле сторана А */
    private double sideA;

    /** Поле сторона В */
    private double sideB;

    /** Конструктор - создание нового объекта с определенными значениями
     * @param sideA - сторона А
     * @param sideB - сторона В
     */
    public Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    /** Конструктор - создание нового объекта из созданного объекта
     * @param figure - существующий объект
     */
    public  Rectangle(Figure figure){
        this.sideA = figure.getMinSize()/2;
        this.sideB = sideA;
    }

    /** Метод определения стороны А
     * @param  sideA - сторона А
     */
    public void setSideA(double sideA){
        this.sideA = sideA;
    }

    /** Метод получения значения поля
     * @return возвращает значение стороны А
     */
    public double getSideA(){
        return  sideA;
    }

    /** Метод определения стороны В
     * @param  sideB - сторона В
     */
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    /** Метод получения значения поля
     * @return возвращает значение стороны B
     */
    public double getSideB() {
        return sideB;
    }

    /** Метод расчета площади
     * @return возвращает площадь
     */
    @Override
    public double getArea(){
        return sideA * sideB;
    }

    /** Метод расчета периметра
     * @return возвращает периметр
     */
    @Override
    public double getPerimetr(){
        return (sideA + sideB) * 2;
    }

    /** Метод получения строки
     * @return возвращает строку, содержащую имя класса и значения полей
     */
    @Override
    public String toString(){
        return super.toString() + ": sideA= " + sideA + ", sideB= " + sideB;
    }

    /** Метод расчета минимального размера
     * @return возвращает минимальный размер
     */
    @Override
    public double getMinSize(){
        return Math.min(sideA, sideB);
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
        Rectangle rectangle = (Rectangle) obj;
        return Double.compare(rectangle.sideA, sideA) == 0
                && Double.compare(rectangle.sideB, sideB)== 0;
    }

    /** Метод генерации хеш-кода
     * @return возвращает хеш-код
     */
    @Override
    public int hashCode(){
        return Objects.hash(sideA, sideB);
    }
}

