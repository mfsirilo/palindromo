package palindromo;

public class Pilhas {

    public Object[] pilha;
    public int posicaodaPilha;

    public Pilhas() {
        this.posicaodaPilha = -1;
        this.pilha = new Object[40];
    }

    public boolean pilhaVazia() {
        if (this.posicaodaPilha == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaodaPilha + 1;
    }

    public Object ExibeUltimoValor() {
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaodaPilha];
    }

    public void imprimepilha() {
        for (int i = 0; i < this.tamanho(); i++) {
            System.out.println(this.pilha[i]);
        }
    }

    public Object Desempilha() {
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaodaPilha--];
    }

    public boolean pilhaCheia() {
        if (this.pilha[this.pilha.length - 1] != null) {
            System.out.println("pilhaCheia");
            return true;
        }
        return false;
    }

    public void Separador(Pilhas pilhaPar, Pilhas pilhaImpar) {
        int val;
        while (this.pilhaVazia() == false) {
            int valor = (int) this.Desempilha();
            val = (int) (valor % 2);
            if (val == 0) {
                pilhaPar.empilhar(valor);
            } else {
                pilhaImpar.empilhar(valor);
            }
        }
    }

    public boolean Palindromo(Pilhas pilhaAux0, Pilhas pilhaAux1, Pilhas pillhaAux2) {
//        public boolean Comparador(Pilhas pilhaAux0, Pilhas pilhaAux1) {
        if (pilhaAux0.tamanho() != pilhaAux1.tamanho()) {
            return false;
        }
        for(int i = pilhaAux0.tamanho()-1;i<=-1;i--){
            pillhaAux2.empilhar(pilhaAux0.Desempilha());
        }
        while (pilhaAux0.pilhaVazia() != true) {
            if (!pillhaAux2.ExibeUltimoValor().equals(pilhaAux1.ExibeUltimoValor())) {
                return false;
            }
        }
        return true;
    }
    
    

    public boolean Comparador(Pilhas pilhaAux0, Pilhas pilhaAux1) {
        if (pilhaAux0.tamanho() != pilhaAux1.tamanho()) {
            return false;
        }
        
        while (pilhaAux0.pilhaVazia() == false && pilhaAux1.pilhaVazia() == false) {
            if (!pilhaAux0.Desempilha().equals(pilhaAux1.Desempilha())) {
                return false;
            }
        }
        return true;
    }

    public void empilhar(Object valor) {
        if (this.pilhaCheia()) {
            return;
        }
        this.pilha[++posicaodaPilha] = valor;
    }

}
