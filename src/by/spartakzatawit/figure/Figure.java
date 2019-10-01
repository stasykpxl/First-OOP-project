package by.spartakzatawit.figure;

import by.spartakzatawit.paper.Paper;

/**
 * @author  Стас Мохов
 * Абстрактный класс родитель, для абстрактных классов фигур(круг, треугольник,
 * прямоугольник)
 */
public abstract class Figure {
    /** Поле площадь */
    public abstract double getArea();

    /** Поле периметр */
    public abstract double getPerimetr();

    /** Поле минимальный размер */
    public abstract double getMinSize();

    /** Метод для возрата значение полей объекта
     * @return возвращет строку содержащую имя класса
     */
    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }

    /** Метод для сравнения объектов
     * @param obj - существующий объект
     * @return возвращет  результат сравнения классов
     */
    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        return getClass() == obj.getClass();
    }

    public abstract int getOrdinal();
}
