import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Aluno[] aluno = new Aluno[5];
        String name;
        int age;
        String registration;
        

        for(int i = 0; i < aluno.length; i++){
        System.out.print("Nome: ");
        name = sc.nextLine();
        System.out.print("Idade: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Matricula: ");
        registration = sc.nextLine();
        System.out.println();

        aluno[i] = new Aluno(name, age, registration);
        }

        for(int i = 0; i < aluno.length; i++){
            System.out.println("Nome: "+ aluno[i].getName());
            System.out.println("Idade: "+ aluno[i].getAge());
            System.out.println("Matricula: "+ aluno[i].getRegistration());
            System.out.println();
        }
        
        sc.close();
    }
}
