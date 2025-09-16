package NIvelIntermediario.record;

public class Main {
    public static void main(String[] args) {
        Ninja cadastro = new Ninja("Naruto", "naruto@gmail.com" , 123456789);
        System.out.println(cadastro);

        NinjaRecord cadastroRecord = new NinjaRecord("Sasuke", "sasuke@gmail.com" , "987654321");
        System.out.println(cadastroRecord);
        System.out.println(cadastroRecord.emailUperCase());
    }
}
