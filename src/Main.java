public class Main {
    public static void main(String[] args) {
        // задача 1
        int age = 20;
        if (age >= 18) {
            System.out.println("если возраст человека равен 18, он совершенолетний");
        }
        if (age < 18) {
            System.out.println("возраст совершенолетия не наступил, нужно подождать");
        }


        //задача2
        int temperature = 4;
        int normalTemperature = 5;
        if (temperature < normalTemperature) {
            System.out.println("на улице -5 градусов, нужно надеть шапку");
        } else {
            System.out.println(" на улице тепло +5 можно идти без шапки");
        }
        //задача 3
        int speed = 60;
        int ghostSpeed = 70;
        if (ghostSpeed > speed) {
            System.out.println("если скорость 70, то придется заплптить штраф");
        } else {
            System.out.println("можно ехать спокойно");
        }

        // задача 4
        int years = 6;
        if (years >= 2 && years <= 6) {
            System.out.println("достаточно взрослый чтобы ходить в детский сад " + years+ " но не можешь ходить в школу");
        } else if (years >6 && years<=18) {
            System.out.println("Если возраст человека равен " +years+ " то ему нужно ходить в школу");
        }else if (years >18 && years <= 21) {
            System.out.println("Если возраст человека равен " +years+ " то ему нужно ходить в универ ");
        } else if (years > 21 && years < 65){
            System.out.println("Если возраст человека равен " +years+  " то ему нужно ходить на работу ");
        }



        //задача5
        if (years <=5 ){
            System.out.println("Если возраст ребенка равен " + years + " то он не может кататься на аттракционе.");
        }else if (years >5 && years < 14){
            System.out.println("Если возраст ребенка равен " + years+ " то он может кататься только в сопровождении взрослого");
        }else if (years >14){
            System.out.println("Если возраст ребенка равен " + years + " то он может кататься без сопровождения взрослого.");
        }

        //задача6
        int wagonCapacity = 102;
        int seatPlace = 60;
        if (wagonCapacity > seatPlace ){
            System.out.println("нет мест вагоне не сидячик и стоячих" );
        }else {
            System.out.println("ваглне есть сидячие и стоячие места");
        }
        //задача 7
        int one =4;
        int two = -5;
        int three = 101;
        if (one >= two){
            if(one < two){
                System.out.println(+one+ "большше чем "+ two);
            }else if(three>one){
                System.out.println("большее число"+three);
            }else {
                System.out.println("чило " + one + "и" + three + " равны");
            }
        }
    }
}














