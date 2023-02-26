public class condiacionais2 {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 15;
        int quantidadeDePessoas = 2;
        boolean acompanhado = quantidadeDePessoas > 1;

        if (idade >= 18 || acompanhado) {
        System.out.println("Seja bem vindo(a)");
        }else{
             System.out.println("Você é menor de idade e não está acompanhado(a)");
        }
    }
} 
