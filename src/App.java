import javax.swing.JOptionPane;

public class App {
    static int[][] transicao = { { 0, 1 }, { 0, 1 } };
    static int estadoInicial = 0;
    static int[] aceitacao = { 1 };

    public static void main(String[] args) throws Exception {
        String cadeia = JOptionPane.showInputDialog("Digite a Cadeia: ");
        int estadoAtual = estadoInicial;
        int posicao = 0;

        while (posicao < cadeia.length()) {
            char elemento = cadeia.charAt(posicao);
            int elementoInt = Integer.parseInt(elemento + "");
            estadoAtual = transicao[estadoAtual][elementoInt];
            posicao++;
        }
        boolean resultado = false;
        for (int i : aceitacao) {
            if (estadoAtual == i) {
                resultado = true;
            }
        }

        if (resultado == true) {
            System.out.println("Cadeia Valida");
        } else {
            System.out.println("Cadeia Invalida");
        }
    }
}
