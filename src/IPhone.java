
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação da interface ReprodutorMusical

    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }

    // Implementação dos métodos da interface AparelhoTelefonico

    public void ligar() {
        System.out.println("Ligando o telefone...");
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementação dos métodos da interface NavegadorInternet

    public void exibirPagina() {
        System.out.println("Exibindo página da web...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba ao navegador...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página da web...");
    }

    // Outros métodos específicos do iPhone

    public void iniciarReprodutorMusical() {
        System.out.println("Iniciando reprodutor musical...");
    }

    public void iniciarAparelhoTelefonico() {
        System.out.println("Iniciando telefone...");
    }

    public void iniciarNavegadorInternet() {
        System.out.println("Iniciando navegador de internet...");
    }

    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        // Exemplos de utilização
        iphone.iniciarReprodutorMusical();
        iphone.tocar();
        iphone.pausar();

        iphone.iniciarAparelhoTelefonico();
        iphone.ligar();
        iphone.atender();

        iphone.iniciarNavegadorInternet();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
