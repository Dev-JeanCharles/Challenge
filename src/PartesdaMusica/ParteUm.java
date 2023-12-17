package PartesdaMusica;

import java.io.BufferedReader;
import java.io.FileReader;

public class ParteUm {
    public static void lerArquivo(String path) {
        String line = "";
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(path));
            while ((line = buffer.readLine()) != null) {
                Thread.sleep(1000);
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void buscarAnimal(String path) {
        String[] animal = {"O Elefante", "E os Passarinhos", "A Minhoquinha", "E os Pinguins", "O Canguru", "E o Sapinho"};

        try {
            for (int a = 0; a < animal.length; a++) {
                ParteUm.lerArquivo(path);
                String[] verso = {animal[a],animal[a + 1] + ", como os filhos do Senhor"};
                a = a + 1;
                for (String s : verso) {
                    Thread.sleep(1000);
                    System.out.println(s);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    public static void triplicarSolo(String path){
        for (int x = 0; x < 3; x++){
            ParteUm.lerArquivo(path);
        }
    }
}