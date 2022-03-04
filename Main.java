package comp;

import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String model, nameR, nameH, type;
        System.out.println("Введите модель Компьютера");
         model=sc.next();
        System.out.println("Введите стоимость Компьютера");
        int price =sc.nextInt();
        System.out.println("Введите модель оперативной памяти");
         nameR=sc.next();
        System.out.println("Введите объем оперативной памяти");
        int capR=sc.nextInt();
        System.out.println("Введите модель жесткого диска");
         nameH=sc.next();
        System.out.println("Введите объем жесткого диска");
        int capH=sc.nextInt();
        System.out.println("Введите тип жесткого диска(внутренний/внешний)");
         type=sc.next();
        Computer computer1 = new Computer(price,model);
        Computer computer2 = new Computer(price,model,capH,nameH,type,capR,nameR);
        computer1.displayInfo();
        computer2.displayInfo();
    }
}
