package comp;

public class Computer
{
    private double price;
    private String model;
    RAM RAM;
    HDD HDD;

    Computer(double price,String model)
    {
        this.price=price;
        this.model=model;
        RAM = new RAM();
        HDD = new HDD();
    }

    Computer(double price,String model, int capH, String nameH, String type, int capR, String nameR)
    {
        this.price=price;
        this.model=model;
        RAM = new RAM(nameR, capR);
        HDD = new HDD(capH , nameH, type);
    }

    public class RAM
    {
        private String nameRam;
        private int capacityRam;
         RAM()
        {

        }
         RAM(String name, int cap)
        {
            this.nameRam=name;
            this.capacityRam=cap;
        }
        public void displayInfo()
        {
            System.out.println("Объем RAM: "+this.capacityRam+"\nНазвание модели: "+this.nameRam);
        }
    }

   public class HDD
    {
        private int capacityHdd;
        private String nameHdd;
        private String type;
         HDD()
        {

        }
         HDD(int cap, String name, String type)
        {
            this.capacityHdd=cap;
            this.nameHdd=name;
            this.type=type;
        }
        public void displayInfo()
        {
            System.out.println("Объем диска HDD: "+this.capacityHdd+"\nНазвание модели: "+this.nameHdd+"\nТип диска: "+this.type);
        }
    }
    public void displayInfo()
    {
        System.out.println("Информация о компьютере:\nМодель компьютера: "+this.model+"\nСтоимость: "+this.price);
        RAM.displayInfo();
        HDD.displayInfo();
    }
}
