package Ex1;

public class Calculadora {
    float n1;
    float n2;
    float result;

    Calculadora () {
        
    }

    Calculadora(float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    void Som() {
        result = n1 + n2;
    }

    void Sub() {
        result = n1 - n2;
    }

    void Mul() {
        result = n1 * n2;
    }

    void Div() {
        result = n1 / n2;
    }
}
