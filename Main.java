public class Main
{
    public static void main(String[] args) 
    {
        
        Feeder f = new Feeder();
        System.out.println(f);
       //System.out.println(f.currentFood);
       System.out.println(f.getCurrentFood());
       Feeder g = new Feeder(500);
       System.out.println(g.getCurrentFood());
       //int random = (int) (Math.random() * 50 + 1);
       //System.out.println(random);
       System.out.println();
       System.out.println(Math.random() < 0.05);
    }

}
