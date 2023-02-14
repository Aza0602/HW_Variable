public class Main {
    public static void main(String[] args) {

        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();

    }

    public static void task1 () {

        var dog = 8.0;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2 () {

        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
    }

    public static void task3 () {

        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
    }

    public static void task4 () {

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5 () {
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6 () {

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;

        var totalWeightOfBoxers = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух бойцов " + totalWeightOfBoxers + " кг!");

        var differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между весами бойцов состовляет " + differenceWeight + " кг!");
    }

    public static void task7 () {

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;

        var firstOption = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между весами бойцов состовляет " + firstOption + " кг!");

        var secondOption = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница между весами бойцов состовляет " + secondOption + " кг!");
    }
}