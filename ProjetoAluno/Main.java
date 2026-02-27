import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Aluno[] alunos = new Aluno[5];
        String name;
        int age;
        String registration;
        

        for(int i = 0; i < alunos.length; i++){
        System.out.print("Nome: ");
        name = sc.nextLine();
        System.out.print("Idade: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Matricula: ");
        registration = sc.nextLine();
        System.out.println();

        alunos[i] = new Aluno(name, age, registration);
        }

        for(int i = 0; i < alunos.length; i++){
            System.out.println("Nome: "+ alunos[i].getName());
            System.out.println("Idade: "+ alunos[i].getAge());
            System.out.println("Matricula: "+ alunos[i].getRegistration());
            System.out.println();
        }
        
        sc.close();
    }
}
