package by.spartakzatawit.paper;

/**
 * @author  Стас Мохов
 * Интерфейс для создания бумажных фигур и их покраске
 */
public interface Paper {
    /** Перечесления цветов покраски */
    enum Color{
        WHITE, YELLOW, RED, GREEN, BLACK;
    }

    /**
     * @author  Стас Мохов
     * Внутренний класс - для работы с покраской элементов
     */
    class Painted {
        private Color color;

        /** Метод получения цвета
         * @return - возвращает цвет
         */
        public Color getColor(){
            return color;
        }
        /** Метод определяющий цвет
         * @param color - перечисление цветов
         */
        public void setColor(Color color){
            if (this.color == null){
                this.color = color;
            }
        }
    }

    /** Абстрактый метод */
    Color getColor();

    /** Абстрактый метод
     * @param color - перечисление цветов
     */
    void setColor(Color color);

    /** Абстрактый метод */
    Painted getPainted();
}
