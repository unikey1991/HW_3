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

        Shark ak1 = new Shark(10,"White","hoomans",false);
        System.out.println("Shark ak1:");
        System.out.println(ak1.getSharkProperties());

        Eagle eagle1 = new Eagle(2000,false,"rats",2,"Aquila rapax");
        System.out.println("Eagle eagle1:");
        System.out.println(eagle1.getEagleProperties());

        Cow cow1 = new Cow(4,"grass",true,true);
        System.out.println("Cow cow1:");
        System.out.println(cow1.getCowProperties());


    }

}
