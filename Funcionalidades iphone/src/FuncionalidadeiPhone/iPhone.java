package FuncionalidadeiPhone;

public class iPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;
    
    public iPhone() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
    }

    // Métodos do Reprodutor Musical
    public void tocar() {
        reprodutorMusical.tocar();
    }
    
    public void pausar() {
        reprodutorMusical.pausar();
    }
    
    public void selecionarMusica(String musica) {
        reprodutorMusical.selecionarMusica(musica);
    }
    
    // Métodos do Aparelho Telefônico
    public void ligar(String numero) {
        aparelhoTelefonico.ligar(numero);
    }
    
    public void atender() {
        aparelhoTelefonico.atender();
    }
    
    public void iniciarCorreioVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
    }
    
    // Métodos do Navegador na Internet
    public void exibirPagina(String url) {
        navegadorInternet.exibirPagina(url);
    }
    
    public void adicionarNovaAba() {
        navegadorInternet.adicionarNovaAba();
    }
    
    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }
    
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();
        
        // Testando Reprodutor Musical
        meuIPhone.tocar();
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.pausar();
        
        // Testando Aparelho Telefônico
        meuIPhone.ligar("123-4567");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();
        
        // Testando Navegador na Internet
        meuIPhone.exibirPagina("https://www.example.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}


