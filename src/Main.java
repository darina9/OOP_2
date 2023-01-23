public class Main {
    public static void main(String[] args) {
        Persona papa = new Persona("Иван", "мужской",38, "№1","собака");
        Persona son = new Persona("Николай", "мужской", 18, "№2","кошка");

        papa.PersLibr.AddBook("Антон Павлович Чехов", "Дама с собачкой", "RU");
        son.PersLibr.AddBook("Шарль Перро", "Кот в сапогах", "RU");

        papa.LPet.AddAnimal("Кузя", "мопс", 8);
        son.LPet.AddAnimal("Степа", "сфинкс", 2);


        System.out.println("-".repeat(10));
        View.personView(papa);
        View.bookView(papa);
        View.animalView(papa);
        System.out.println("-".repeat(10));
        View.personView(son);
        View.bookView(son);
        View.animalView(son);
    }
}