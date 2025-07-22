package dev.nobregasylvio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente sylvio = new Cliente("Sylvio");

        ContaCorrente cc = new ContaCorrente(sylvio);
        ContaPoupanca poupanca = new ContaPoupanca(sylvio);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        System.out.println();
        poupanca.imprimirExtrato();
    }
}