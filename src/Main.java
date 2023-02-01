import br.com.americanas.polotech.eventnotifier.controller.Notifier;
import br.com.americanas.polotech.eventnotifier.models.Pessoa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Notifier nt = new Notifier();
        Integer numPessoas;


        loopPrincipal:
        while(true){
            System.out.print("Digite o número de pessoas que irá receber a notificação: ");
            numPessoas = Integer.parseInt(sc.nextLine());
            System.out.println();
            if(numPessoas == 0){
                break loopPrincipal;
            }
            nt.limparMensagem();
            for(int i=0; i< numPessoas; i++) {
                System.out.println("Digite os nomes");
                nt.adicionarPessoa(new Pessoa(sc.nextLine()));
            }
            System.out.println("Digite a mensagem da notificação: ");
            nt.setMensagem(sc.nextLine());
            nt.enviarMensagem();
        }
    }
}