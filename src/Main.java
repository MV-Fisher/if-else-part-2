public class Main {
    public static void main(String[] args) {
        task1() ;
        task2() ;
        task3() ;
        task4() ;
        task5() ;
        }
        public static void task1 () {
            System.out.println("Задача № 1.") ;
            boolean clientOS = false ;
            if ( clientOS == true ) {
                System.out.println("Установите версию приложения для Android.") ;
            }else {
                System.out.println("Установите версию приложения для iOS по ссылке.") ;
            }
        }
        public static void task2 () {
            System.out.println("Задача № 2.") ;
            boolean clientOS2 = true ;
            short clientDeviceYear = 2014 ;
            if ( clientDeviceYear < 2015 ) {
                if (clientOS2) {
                    System.out.println("Установите облегчённую версию приложения для iOS по ссылке.");
                } else {
                    System.out.println("Установите облегчённую версию приложения для Android по ссылке.");
                }
            } else if (clientOS2) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
                } else {
                System.out.println("Установите версию приложения для Android.");
        }
    }
        public static void task3 () {
            System.out.println("Задача № 3.");
            short year = 2023 ;
            // Условный оператор проверяет делится ли значение переменной year на 4 без остатка и делится ли занчение
            // переменной year только с остатком или делится ли значение переменной на 400 без остатка. В этом случае
            // Год високосный иначе Год не високосный.
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
                System.out.println("Год является високосным.");
            }else {
                System.out.println("Год не является високосны.");
            }
        }
        public static void task4 () {
            System.out.println("Задача № 4.");
            byte deliveryDistance = 95 ;
            if ( deliveryDistance > 100 ) {
                System.out.println("Доставки нет.");
            } else if ( deliveryDistance < 20 ) {
                System.out.println("Доставка карты займёт сутки.");
            } else if ( deliveryDistance > 20 && deliveryDistance < 60 ) {
                System.out.println("Доставка карты займёт двое суток.");
            } else if( deliveryDistance > 60 && deliveryDistance < 100 ) {
                System.out.println("Доставка карты займёт трое суток.");
            }
        }
        public static void task5 () {
            System.out.println("Задача № 5.");
            byte monthNumber = 12 ;
                 switch (monthNumber ) {
                     case 1:
                         System.out.println("Месяц Январь. Врнемя года Зима.");
                         break;
                     case 2:
                         System.out.println("Месяц Февраль. Врнемя года Весна.");
                         break;
                     case 3:
                         System.out.println("Месяц Март. Врнемя года Весна.");
                         break;
                     case 4:
                         System.out.println("Месяц Апрель. Врнемя года Весна.");
                         break;
                     case 5:
                         System.out.println("Месяц Май. Врнемя года Весна.");
                         break;
                     case 6:
                         System.out.println("Месяц Июнь. Врнемя года Лето.");
                         break;
                     case 7:
                         System.out.println("Месяц Июль. Врнемя года Лето.");
                         break;
                     case 8:
                         System.out.println("Месяц Август. Врнемя года Лето.");
                         break;
                     case 9:
                         System.out.println("Месяц Сентябрь. Врнемя года Осень.");
                         break;
                     case 10:
                         System.out.println("Месяц Октябрь. Врнемя года Осень.");
                         break;
                     case 11:
                         System.out.println("Месяц Ноябрь. Врнемя года Осень.");
                         break;
                     case 12:
                         System.out.println("Месяц Декабрь. Врнемя года Зима.");
                         break;
                     default:
                         System.out.println("Такого времени года на существует.");
                 }
             }
        }
