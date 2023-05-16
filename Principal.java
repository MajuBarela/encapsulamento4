public class Principal {
    
    public static void main (String [] args) {

        Perfil perfil = new Perfil();

        perfil.setNome("Maria Julia Barela Netto");
        perfil.setIdade(17);
        perfil.setUsername("MajuBarela");
        perfil.setSenha(1906);

        System.out.println("O nome é: " + perfil.getNome());
        System.out.println("A idade é: " + perfil.getIdade());
        System.out.println("O username é: " + perfil.getUsername());
        System.out.println("A senha é: " + perfil.getSenha());

    }
}
