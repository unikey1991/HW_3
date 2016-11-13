public class Main {

    public static void main(String[] args)
    {
        Account a1 = new Account();
        System.out.println(a1.getAmount());
        System.out.println(a1.getId());

        Account a2 = new Account(6);
        System.out.println(a2.getAmount());
        System.out.println(a2.getId());

        Account a3 = new Account(9,7);
        System.out.println(a3.getAmount());
        System.out.println(a3.getId());

        Shark shark1 = new Shark(10);
        System.out.println("Shark ak1:");
        System.out.println(shark1.getSharkProperties());

        Eagle eagle1 = new Eagle(2000);
        System.out.println("Eagle eagle1:");
        System.out.println(eagle1.getEagleProperties());

        Cow cow1 = new Cow(true);
        System.out.println("Cow cow1:");
        System.out.println(cow1.getCowProperties());

        Fish herring = new Fish("herring",true,"seaweed");
        System.out.println(herring.isVegetarian());


    }

}
