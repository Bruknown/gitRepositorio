public class Main 
{
    public static void main(String... args)
    {
        String nome = args.length > 0 ? args[0] : "world";
        System.out.println(nome + "!");
        if (nome.equals("Bruno") == true)
        {
            System.out.println("Matricula: 192072006");
        }
    }
}
