public class Main {
    public static void main(String[] args) {
        // Применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        {
            int a = 15;
            int b = 4;

            System.out.println("---------------------------------");
            System.out.println("a = " + a + ", b = " + b);
            System.out.println("a + b = " + (a + b));
            System.out.println("b - a = " + (b - a));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("---------------------------------");
        }
        // Применить несколько арифметических операций над int и double в одном выражении
        {
            int a = 15;
            double b = 4.0;

            System.out.println("---------------------------------");
            System.out.println("a = " + a + ", b = " + b);
            System.out.println("a + b = " + (a + b));
            System.out.println("b - a = " + (b - a));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("---------------------------------");
        }
        // применить несколько логических операций ( < , >, >=, <= )
        {
            int a = 15;
            int b = 15;
            int c = 4;

            System.out.println("---------------------------------");
            System.out.println("a = " + a + ", b = " + b + ", c = " + c);

            if (a > b)
                System.out.println("а больше b");
            else
                System.out.println("а меньше или равно b");

            System.out.println("с меньше b?: " + (c < b));

            System.out.println(a >= b && a >= c ? "а больше или равно b и c" : "а меньше b или c" );

            if (b != c)
                System.out.println("b не равно с");

            if (a <= b)
                System.out.println("а меньше или равно b");

            System.out.println("---------------------------------");
        }
        // Прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой
        // (какие максимальные и минимальные значения есть, как их получить)
        {
            byte minByte = Byte.MIN_VALUE;
            byte maxByte = Byte.MAX_VALUE;

            short minShort = Short.MIN_VALUE;
            short maxShort = Short.MAX_VALUE;

            int minInt = Integer.MIN_VALUE;
            int maxInt = Integer.MAX_VALUE;

            long minLong = Long.MIN_VALUE;
            long maxLong = Long.MAX_VALUE;

            float minFloat = Float.MIN_VALUE;
            float maxFloat = Float.MAX_VALUE;

            double minDouble = Double.MIN_VALUE;
            double maxDouble = Double.MAX_VALUE;

            System.out.println("---------------------------------");
            System.out.println("Минимальное значение byte: " + minByte);
            System.out.println("Максимальное значение byte: " + maxByte);
            System.out.println("Минимальное значение short: " + minShort);
            System.out.println("Максимальное значение short: " + maxShort);
            System.out.println("Минимальное значение int: " + minInt);
            System.out.println("Максимальное значение int: " + maxInt);
            System.out.println("Минимальное значение long: " + minLong);
            System.out.println("Максимальное значение long: " + maxLong);
            System.out.println("Минимальное значение float: " + minFloat);
            System.out.println("Максимальное значение float: " + maxFloat);
            System.out.println("Минимальное значение double: " + minDouble);
            System.out.println("Максимальное значение double: " + maxDouble);
            System.out.println("---------------------------------");
        }
        // Получить переполнение при арифметической операции
        {
            int a;

            System.out.println("---------------------------------");

            a = Integer.MAX_VALUE;
            a = a + 1;
            System.out.println(Integer.MAX_VALUE + " + 1 = " + a);

            a = Integer.MIN_VALUE;
            a = a - 1;
            System.out.println(Integer.MIN_VALUE + " - 1 = " + a);

            System.out.println("---------------------------------");
        }
    }
}