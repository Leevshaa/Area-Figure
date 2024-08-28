package app;

import figure.Circle;
import figure.Square;
import figure.Triangle;

public class Main {

    public static void main(String[] args) {

        //Створюємо масив фігур
        CalcAreaFigure[] figures = new CalcAreaFigure[] {
                new Circle(14.87), //Задаємо параметри фігур
                new Square(54.27), //Задаємо параметри фігур
                new Triangle(10.54,22.94) //Задаємо параметри фігур
        };

        //Виводимо в консоль результат
        System.out.println("\nЗагальна площа фігур: " + TotalArea(figures));
    }

    //Створюємо метод для обчислення загальної площі фігур
    public static double TotalArea (CalcAreaFigure[] figures) {

        double sumAreaFigures = 0; //Створюємо змінну для обчислення загальної площі фігур

        for (CalcAreaFigure figure : figures) { //Проходимо цикл (кожну ітерацію беремо окрему фігуру з масиву)
            sumAreaFigures += figure.calcAreaFigure();
        }
        return sumAreaFigures;
    }

}