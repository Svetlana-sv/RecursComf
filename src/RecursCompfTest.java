import java.util.Scanner;

//Тест для рекурсивного компилятора формул
public class RecursCompfTest{
    public static void main(String[] args) throws Exception{
        RecursCompf c = new RecursCompf();

        Scanner in = new Scanner(System.in);

        while(true){
            System.out.print("Введите формулу -> ");
            c.compile(in.next().toCharArray());// сделать для многозначных чисел тоже

        }
    }
}