public class Main {
    public static void main(String[] args) {

        //Task 1
        int age = 13;
        if (age >= 18) {
            System.out.println("Если ваш возраст " + age + " вы - совершеннолетний!");
        } else {
            System.out.println("Если ваш возраст " + age + " вы пока несовершеннолетний, нужно немного подождать.");
        }

        //Task 2
        int temperature = 5;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }

        //Task 3
        int speed = 61;
        if (speed > 0 && speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        }

        //Task 4
        int age2 = 1;
        if (age2 >= 1 && age2 <= 2) {
            System.out.println("Если возраст человека равен " + age2 + " ,то он младенец и должен быть с мамой.");
        } else if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + " ,то ему нужно ходить в детский сад.");
        } else if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + " ,то ему нужно ходить в школу.");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + " ,то его место в университете.");
        } else {
            System.out.println("Если возраст человека равен " + age2 + " ,то ему пора ходить на работу");
        }

        //Task 5
        int age3 = 15;
        if (age3 >= 1 && age3 <= 5) {
            System.out.println("Если возраст ребенка равен " + age3 + " ,то ему нельзя кататься на аттракционе.");
        } else if (age3 > 5 && age3 <= 14) {
            System.out.println("Если возраст ребенка равен " + age3 + " ,то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Если возраст ребенка равен " + age3 + " ,то он может кататься  на аттракционе без сопровождения взрослого.");
        }

        //Task 6
        int people = 59;
        int trainCapacity = 102;
        int seatingPlaces = 60;
        if (people < seatingPlaces && people < trainCapacity) {
            System.out.println("Вагон свободен, есть сидячие места.");
        } else if (people >= seatingPlaces && people < trainCapacity) {
            System.out.println("Вагон свободен, но остались только стоячие места.");
        } else {
            System.out.println("Вагон забит, мест нет.");
        }

        //Task 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Большее число " + one);
        } else if (two > one && two > three) {
            System.out.println("Большее число " + two);
        } else {
            System.out.println("Большее число " + three);
        }
    }
}