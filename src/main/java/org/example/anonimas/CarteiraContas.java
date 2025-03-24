package org.example.anonimas;

public class CarteiraContas {
    Conta contaCorrene  = new Conta() {
    public void imprimiTipoConta(){
        System.out.println("Conta Correne");
    }
    };
    Conta contaPoupanca = new Conta() {
        public void imprimiTipoConta(){
            System.out.println("Conta Poupanca");
        }
    };


}
