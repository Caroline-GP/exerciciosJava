import java.util.Scanner;

class exercicio04 {
    public static void main(String[] args) {
        String[]arrayAlunos = {"Emilio", "Fabio", "Anna", "Tatiana", "Claudia"};
        float notaA;
        float notaB;
        float media;
        int contador = 0;
        while (contador < arrayAlunos.length){
            System.out.println("");
            System.out.println("Aluno: " + arrayAlunos[contador]);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a primeira nota: ");
            notaA = scanner.nextFloat();

            while (notaA > 10){
                System.out.println("Nota invalida!");
                System.out.println("Digite a primeira nota: ");
                notaA = scanner.nextFloat();
            }

            System.out.println("Digite a segunda nota: ");
            notaB = scanner.nextFloat();
            while (notaA > 10){
                System.out.println("Nota invalida!");
                System.out.println("Digite a segunda nota: ");
                notaA = scanner.nextFloat();
            }
            media = (notaA + notaB) / 2;
            System.out.println("Media do aluno " + arrayAlunos[contador] + ": " + media);
            System.out.println("");
            contador++;
        }





    }

}
