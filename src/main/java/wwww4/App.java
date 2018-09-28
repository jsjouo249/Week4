package wwww4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User h1 = new User();
        h1.setName("이승환");
        h1.setAge(24);
        h1.setNumber(201413328);

        User h2 = new User();
        h2.setName("이현수");
        h2.setAge(24);
        h2.setNumber(201413339);

        System.out.println("이름 : " + h1.getName());
        System.out.println("나이 : " + h1.getAge());
        System.out.println("학번 : " + h1.getNumber());

        System.out.println("이름 : " + h2.getName());
        System.out.println("나이 : " + h2.getAge());
        System.out.println("학번 : " + h2.getNumber());
    }
}
