public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
        public static void task1 () {
            System.out.println("Задача 1");
            int age = 19;

            System.out.println(age >= 18 ? "Всё ок" : "Нужно подождать");

        }

        public static void task2 () {
            System.out.println("Задача 2");

            int temperature = 4;

            if (temperature < 5) {
                System.out.println("На улице холодно, нужно надеть шапку");
            } else {
                System.out.println("Сегодня тепло, можно идти без шапки");
            }

        }
        public static void task3 () {
            System.out.println("Задача 3");

            int speed = 60;
            String ifSpeed = "Если скорость ";

            System.out.println(speed > 60 ? ifSpeed + speed + ", то придется заплатить штраф" : ifSpeed + speed + " км/ч можно спокойно ездить");


        }

        public static void task4() {
            System.out.println("Задача 4");
            int age = 9;
            if(age >= 2 && age <= 6) {
                System.out.print("Нужно в садик");
            } else if (age >= 7 && age <= 18) {
                System.out.println("Нужно в школу");
            } else if (age > 18 && age <= 24) {
                System.out.println("Нужно в университет");
            } else {
                System.out.println("Пора работать");
            }
        }

    public static void task5() {
        System.out.println("Задача 5");

        int kidsAge = 4;

        if(kidsAge < 5) {
            System.out.println("Нельзя пока кататься");
        } else if (kidsAge >= 5 && kidsAge <= 14) {
            System.out.println("Только в сопровождении взрослого");
        } else {
            System.out.println("Можешь делать что хочешь");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");

        int vagon = 102;
        int seat = 60;
        int stand = vagon - seat;

        int occupiedSeat = 60;
        int occupiedStand = 42;

        if (occupiedSeat < 60 && occupiedStand < stand){
            System.out.println("Есть и сидячее и стоячее место");
        } else if (occupiedSeat < seat) {
            System.out.println("Есть сидячее  место");
        } else if (occupiedStand < stand) {
            System.out.println("Есть стоячее место");
        } else {
            System.out.println("Нет мест вообще");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");

        int one = 1;
        int two = 2;
        int three = 3;

        String maxNum = "Самое большое числло это ";

        if(one > two && one > three){
            System.out.println(maxNum + one);
        } else if (two > one && two > three) {
            System.out.println(maxNum + two);
        } else {
            System.out.println(maxNum + three);
        }
    }


}