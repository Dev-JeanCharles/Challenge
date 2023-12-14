import PartesdaMusica.ParteDois;
import PartesdaMusica.ParteUm;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        String path_solo = "src/arquivo/solo.txt";
        String path_repeticao = "src/arquivo/repeticao.txt";
        String path_noe = "src/arquivo/noe.txt";
        String path_senhor = "src/arquivo/senhor.txt";

        ParteUm.lerArquivo(path_solo);
        ParteUm.buscarAnimal(path_repeticao);
        ParteUm.lerArquivo(path_noe);
        ParteUm.triplicarSolo(path_solo);
        ParteDois.movimentarCorpo(path_senhor);
    }
}