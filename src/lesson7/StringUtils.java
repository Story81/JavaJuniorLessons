package lesson7;

public class StringUtils {
    //метод, принимающий входящим параметром email
    //делает проверку на валидацию
    //пишет на консоль корректный этот email или нет

    public static void checkValidMail(String email) {
        /** 1) проверяем содержание собачки. Если ее нет - НЕ ВАЛИДНЫЙ.
         *  2) Проверяем, что @ только одна. Если нет - НЕ ВАЛИДЫНЙ.
         *  3) Собачка должна стоять не в начале и не в конце. Если нет- НЕ ВАЛИДНЫЙ.
         *  4) Точка должна быть хотя бы одна точка после @
         *  5) Точка после @ не может быть в начале или в конце
         *  6) Превышено максимальное количество доменных уровней. Их должно быть не больше 3х
         *  7) Длина доменного уровня должна быть от 2 до 63
         *  8) Email не может начинаться или заканчиваться точкой
         *  9) Проверка на превышение длины email (>256 символов)
         *  10) Запрещено использовать следующие знаки: пробел, # и многоточие, например (список знаков можно расширить)
         */
        if (!email.contains("@")) {
            System.out.println("Не содержит собачку!");
            return; //останавливаем выполнение метода
        }
        //если email kd@fh.k@jdj будет стринговый массив [kd, fh.k, jdj]
        String[] partsOfEmail = email.split("@"); //split - разрезает строку по маске,т.е. до @
        if (partsOfEmail.length > 2) {
            System.out.println("Собачек больше одной!");
            return;
        }
        if (email.startsWith("@") || email.endsWith("@")) {
            System.out.println("Email не может начинаться или заканчиваться с собачки!");
            return;
        }
        String lastPart = partsOfEmail[1]; //берём вторую часть после собачки
        if (!lastPart.contains(".")) {
            System.out.println("Email не содержит точку во второй части после собачки!");
            return;
        }


        String domain = partsOfEmail[1];
        String[] levels = domain.split("\\.");
        if (levels.length > 3) {
            // Превышено максимальное количество доменных уровней. Их должно быть не больше 3х
            System.out.println("Превышено максимальное количество доменных уровней!");
            return;
        }
        for (String level : levels) {
            if (level.length() < 2 || level.length() > 63) {
                // Длина доменного уровня не соответствует требованиям
                System.out.println("Длина доменного уровня должна быть не меньше 2 и не больше 63!");
                return;
            }
        }

        if (email.startsWith(".") || email.endsWith(".")) {
            System.out.println("Email не может начинаться или заканчиваться точкой!");
            return;
        }

        if (email.length() > 256) {
            System.out.println("Превышение длины email (>256 символов)");
            return;
        }
        String localPart = partsOfEmail[0]; //берём вторую часть после собачки
        if (localPart.endsWith(".")) {
            System.out.println("Имя пользователя не может заканчиваться на точку");
            return;
        }

        if (email.contains("&") || email.contains(" ") || email.contains("..") || email.contains("#")
        ) {
            System.out.println("Запрещено использовать следующие знаки:\n" +
                    "пробел\n" +
                    "решетка #\n" +
                    "более одной точки подряд");
            return;
        }

        System.out.println("Email подходит ");
    }
}

