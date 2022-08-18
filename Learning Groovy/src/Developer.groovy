// Por padrão, toda classe criada, que não modificada manualmente, é pública, logo nao precisamos do modificador public
class Developer {

    String first
    String last
    // a 'keyword' def faz um papel semelhante a 'var' do Java
    def languages = []

    void work(){
        println "$first $last is working..."
    }

    void languages(){
        println "$first $last is working with $languages"
    }

    static void main(String[] args) {
        Developer dev = new Developer(first: "João", last: "Gabriel")
        dev.work()
        dev.languages()
        // O operador '<<' indica que estamos inserindo os dados à direita na estrutura à esquerda
        dev.languages << "Java"
        dev.languages << "Python"
        dev.languages << "Groovy"
        dev.languages()
    }
}
