public class Example {

    public static void main(String[] args) {
        // оператор IF
        int n = 2790;
        if (n % 1000 == 0) {
            System.out.println("Вы - наш тысячный покупатель, получите подарок!");
        }
        // вложеный IF и замена комбинацией условий
        int age1 = 12;
        int weight = 70;
        boolean isHealthy = true;
        if (age1 > 18) {
            if (weight > 50) {
                if (isHealthy) {
                    System.out.println("Можно стать донором крови");
                }
            }
        }

        if (age1 > 18 && weight > 50 && isHealthy) {
            System.out.println("Можно стать донором крови");
        }
        // оператор IF-ELSE и вариант с тернарным оператором
        if (age1 < 5) {
            System.out.println("Вам необходимо приобрести детский билет");
        } else {
            System.out.println("Вам необходимо приобрести полный билет");
        }

        String access = age1 < 5 ? "Вам необходимо приобрести детский билет" : "Вам необходимо приобрести полный билет";
        System.out.println(access);
        // вложенный IF_ELSE, конструкция ELSE IF
        if (age1 < 5) {
            System.out.println("Кататься на аттракционе запрещено!");
        } else if (age1 > 14) {
            System.out.println("Можно кататься на аттракционе без сопровождения родителей");
        } else {
            System.out.println("Кататься на аттракционе можно только в сопровождении родителей");
        }
        // оператор SWITH
        String dayOfWeek = "АRI";
        switch (dayOfWeek) {
            case "MON":
            case "TUE":
            case "WED":
            case "THU":
            case "FRI":
                System.out.println("Будний день");
                break;
            case "SAT":
            case "SUN":
                System.out.println("Выходной день");
                break;
            default:
                System.out.println("Вы ошиблись, день недели введен неправильно");
        }

    }
}