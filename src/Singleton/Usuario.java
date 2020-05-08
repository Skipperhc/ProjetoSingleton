package Singleton;

import java.util.List;

public class Usuario {
    private static Usuario instanciaUnica = null;
    private Usuario() { frase = "ESTA FRASE VAI SER a mesma pra todo mundo";}
    public static Usuario getInstanciaunica() {//dupla verificação para caso, em outras trheads, esteja instanciada esta classe
        if(instanciaUnica == null) {
            synchronized(Usuario.class) {
                if(instanciaUnica == null) {
                    instanciaUnica = new Usuario();
                }
            }
        }
        return instanciaUnica;
    }

    private static List<String> listaUsuarios;
    private String frase;
    public List<String> getListaUsuarios() {
        return listaUsuarios;
    }
    public String getFrase() {
        return frase;
    }
    public void setFrase(String novaFrase) {
        frase = novaFrase;
    }
}
