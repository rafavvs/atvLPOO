public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Gato g = new Gato();
        Cachorro c = new Cachorro();

        a.setNome("piupiu");
        g.setNome("garfield");
        c.setNome("esnupe");

        System.out.println(a);
        System.out.println(g);
        System.out.println(c);
    }
}