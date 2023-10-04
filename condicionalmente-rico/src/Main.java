import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Entrada de dados
    Scanner scanner = new Scanner(System.in);
    int saldoTotal = scanner.nextInt();
    int valorSaque = scanner.nextInt();

    //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
    boolean autorizado = verificarSolicitacao(saldoTotal, valorSaque);

    if (autorizado){
      saldoTotal = saldoTotal-valorSaque;
      System.out.println("Saque realizado com sucesso. Novo saldo: "+saldoTotal);
    }

    else{
      System.out.println("Saldo insuficiente. Saque nao realizado!");
    }

    scanner.close();
  }

  /**
   * Verifica se o cliente possue saldo para realizar o saque
   * @param saldoTotal
   * @param valorSaque
   * @return boolean (altorizando ou desaltorizando o saque)
   */
  static boolean verificarSolicitacao(int saldoTotal, int valorSaque){
    if (valorSaque<=saldoTotal)
      return true;
    else
      return false;
  }
}
