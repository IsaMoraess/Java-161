package ATVD_A;

import java.io.File;
import java.text.DateFormat;
import java.util.Scanner;

public class LeituraArquivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura do nome do arquivo
        System.out.println("Digite o nome do arquivo (com caminho completo se necessário): ");
        String caminhoArquivo = scanner.nextLine();
        
        // Criando objeto File para representar o arquivo
        File arquivo = new File(caminhoArquivo);
        
        // Verificando se o arquivo existe
        if (arquivo.exists()) {
            // Obtendo informações do arquivo
            long tamanho = arquivo.length(); // Tamanho do arquivo em bytes
            String caminhoCompleto = arquivo.getAbsolutePath(); // Caminho completo até o arquivo
            long ultimaModificacao = arquivo.lastModified(); // Data da última modificação

            // Formatando a data da última modificação
            DateFormat dateFormat = DateFormat.getDateTimeInstance();
            String dataFormatada = dateFormat.format(ultimaModificacao);

            // Exibindo as informações do arquivo
            System.out.println("Tamanho do arquivo: " + tamanho + " bytes");
            System.out.println("Caminho completo: " + caminhoCompleto);
            System.out.println("Última modificação: " + dataFormatada);
        } else {
            System.out.println("Erro: O arquivo não existe.");
        }
        
        // Fechando o scanner
        scanner.close();
    }
}

