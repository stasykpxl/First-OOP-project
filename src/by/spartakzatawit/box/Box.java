package by.spartakzatawit.box;


import by.spartakzatawit.figure.Circle;
import by.spartakzatawit.figure.Figure;
import by.spartakzatawit.figure.Rectangle;
import by.spartakzatawit.film.Film;

import java.util.*;
/**
 * Класс для хранения фигур
 * @author Стас Мохов
 */
public class Box {
    private List<Figure> list;

    /** Конструктор - создание нового объекта */
    public Box(){
        list = new ArrayList<>();
    }

    /** Метод добавления фигуры в коробку
     * @param figure  существующий объект, который будем добавлять
     * @return true, если объект добавлен
     */
    public boolean addFigure(Figure figure){
        return list.add(figure);
    }

    /** Метод получения фигуры по номеру
     * @param index - номер позиции в коробке
     * @return - возвращает фигуру
     */
    public Figure getFigure(int index) {
        return list.get(index);
    }

    /** Метод получения всех фигур
     * @return List<Figure>
     */
    public List<Figure> getList(){
        return list;
    }

    /** Метод извлечения фигуры по номеру
     * @param index - номер позиции в коробке
     * @return - возвращает извлеченную фигуру из коробки
     */
    public Figure removeFigure(int index){
        return list.remove(index);
    }

    /** Метод замены фигуры по номеру
     * @param index номер позиции в коробке
     * @param figure объект, который хотим поместить в коробку
     * @return возвращает объект, который был заменен в коробке
     **/
    public Figure setFigure(int index, Figure figure){
        return list.set(index, figure);
    }

    /** Метод поиска эквивалентной фигуры в коробке по образцу
     * @param figure объект, который будем искать в коробке
     * @return возвращает истину если объект найден
     */
    public int patternMatching(Figure figure){
        return list.indexOf(figure);
    }

    /** Метод подсчета количества фигур в коробке
     * @return - возвращает число фигур
     * */
    public int getCountFigures(){
        return list.size();
    }

    /** Метод подсчета площади фигур в коробке
     * @return возвращает площадь всех фигур
     */
    public double getSumArea(){
        double sumArea = 0;
        for (Figure lis: list) {
            sumArea += lis.getArea();
        }
        return sumArea;
    }

    /** Метод подсчета периметра фигур в коробке
     * @return возвращает периметр всех фигур
     **/
    public double getSumPerimetr(){
        double sumPerimetr = 0;
        for (Figure lis: list) {
            sumPerimetr += lis.getPerimetr();
        }
        return sumPerimetr;
    }

    /** Метод подсчета количества фигур круг в коробке
     * @return возвращает число кругов
     */
    private int getCountCircle(){
        List<Figure> newList = getAllCircle();
        return newList.size();
    }

    /** Метод получения всех кругов из кробки
     * @return возвращает массив кругов из коробки
     */
    public List<Figure> getAllCircle(){
        List<Figure> newList = new ArrayList<>();
        for (Figure lis: list) {
            if (lis instanceof Circle){
                newList.add(lis);
            }
        }
        return newList;
    }

    /** Метод получения всех красных кругов из кробки
     * @return возвращает массив кругов из коробки
     */
    public List<Figure> getAllRedCircle(){
        List<Figure> newList = new ArrayList<>();
        for (Figure lis: list) {
            if (lis.getOrdinal() == 2 && lis instanceof Circle){
                newList.add(lis);
            }
        }
        return newList;
    }

    /** Метод подсчета количества пленочных фигур в коробке
     * @return возращает число пленочных фигур
     */
    private int getCountFilm(){
        List<Figure> newList = getAllFilm();
        return newList.size();
    }

    /** Метод получения всех пленочных фигур из коробки
     * @return возвращает массив пленочных фигур из коробки
     */
    public List<Figure> getAllFilm(){
        List<Figure> newList = new ArrayList<>();
        for (Figure lis: list) {
            if (lis instanceof Film){
                newList.add(lis);
            }
        }
        return newList;
    }

    /** Метод добавления группы фигур
     * @return возвращает лист всех фигур
     */
    public List<Figure> setFigureGroup(List<Figure> setFigure){
        list.addAll(setFigure);
        return list;
    }

    /** Метод получения группы фигур
     * @param index1 начало получения
     * @param index2 конец получения
     * @return возвращает лист фигур
     */
    public List<Figure> getFigureGroup(int index1, int index2){
        List<Figure> newList = new ArrayList<>();
        while (index1 <= index2){
            newList.add(getFigure(index1));
            index1++;
        }
        return newList;
    }

    /** Метод получения всех треугольников
     * @return возвращает лист фигур
     */
    public List<Figure> getAllRectangle(){
        List<Figure> newList = new ArrayList<>();
        for (Figure lis: list) {
            if (lis instanceof Rectangle){
                newList.add(lis);
            }
        }
        return newList;
    }

    /** Метод сортировки фигур по цвету*/
    public void sortByColor(){
        Collections.sort(list, new Comparator<Figure>() {
            @Override
            public int compare(Figure o1, Figure o2) {
                return o1.getOrdinal() - o2.getOrdinal();
            }
        });
    }

    /** Метод получения строки
     * @return - возвращает строку, содержащую имя класса, значения полей и цвет
     * всех фигур коробки
     */
    @Override
    public String toString()
    {
        String result = "Box:";
        for (int i = 0; i < list.size(); i++)
        {
            result += "\n" + (i + 1) + ") " + getFigure(i);
        }
        return result;
    }
}
