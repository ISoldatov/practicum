package sprint07.lyamda.Circle;

import java.util.Arrays;
import java.util.List;


    public class Practicum {
        public static void main(String[] args) {
            List<Circle> circles = Arrays.asList(
                    new Circle(3, 5, 12),
                    new Circle(1, -2, 4),
                    new Circle(8, 8, 8),
                    new Circle(5, 1, 8)
            );

            circles.sort((Circle circle1, Circle circle2) -> {
                //вставьте код лямбды здесь
                if (circle1.getRadius() > circle2.getRadius()) {
                    return 1;
                }
                if (circle1.getRadius() < circle2.getRadius()) {
                    return -1;
                }
                return circle1.getCenterX() + circle1.getCenterY() > circle2.getCenterX() + circle2.getCenterY()
                        ? 1 : -1;
            });

            for (Circle circle : circles) {
                System.out.println(circle);
            }
        }
    }

     class Circle {
        private int centerX;
        private int centerY;
        private int radius;

        public Circle(int centerX, int centerY, int radius) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
        }

        public int getRadius() {
            return radius;
        }

        public int getCenterX() {
            return centerX;
        }

        public int getCenterY() {
            return centerY;
        }

        @Override
        public String toString() {
            return "Радиус окружности: " + radius
                    + ", координаты: "
                    + centerX
                    + ", "
                    + centerY;
        }

        //добавьте геттеры для координат центра
    }


