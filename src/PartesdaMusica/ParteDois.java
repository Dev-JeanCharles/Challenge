package PartesdaMusica;

public class ParteDois {

    public static void movimentarCorpo(String path){
        String[] partes_corpo_total = {
                "Braço direito",
                ", braço esquerdo",
                "\nPerna direita",
                ", perna esquerda",
                "\nBalança a cabeça",
                ", dá uma voltinha",
                "\nDá um pulinho",
                " e abraça o irmão"
        };
        StringBuilder corpo = new StringBuilder();
        for (String s : partes_corpo_total) {
            corpo.append(s);
            ParteUm.lerArquivo(path);
            System.out.println(corpo);
        }

    }
}
