package agendatel;

public class Agendatel {

    public static void main(String[] args) {
        agenda inicio = new agenda();
        inicio.setTitle("agenda telefonica");
        inicio.setBounds(450, 300, 700, 250);
        inicio.setResizable(false);
        inicio.insertarPanel();
        inicio.insertarEtiquetas();
        inicio.insertarTexto();
        inicio.insertarBotones();
    }
}
