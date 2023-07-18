public class Iphone implements MusicPlayer, Phone, Browser {

    private MusicPlayer reprodutor;
    private Phone telefone;
    private Browser navegador;

    public Iphone() {
        reprodutor = new MusicImpl();
        telefone = new PhoneImpl();
        navegador = new BrowserImpl();
    }

    @Override
    public void exibirPagina() {
        System.out.println("Página exibida");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausou");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada.");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz iniciado.");
    }
}