public class Principal {
    
    public static void main (String [] args) {

        Perfil perfil = new Perfil("Maria Julia", 16, "MajuBarela", "1906");

        System.out.println("Nome: " + perfil.getNome());
        System.out.println("Idade: " + perfil.getIdade());
        System.out.println("Username: " + perfil.getUsername());
        perfil.setSenha("mj0606");

        if(perfil.verificarSenha("MJ1906")) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida!");
        }
    }
}
