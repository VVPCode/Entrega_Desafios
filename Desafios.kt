import kotlin.random.Random

fun main(){

}

fun tempoVida(){
    println("Quantos cigarros são consumidos por dia:")
    val qtd = readln().toInt()
    println("Há quantos anos a pessoa fuma:")
    val anos = readln().toInt()
    val minutos = qtd * 10
    val horas = minutos / 60
    val dias = horas / 24

    println("O fumante perdeu ${dias * anos} de vida")
}

fun triangulo(){
    println("Digite o valor dos três segmentos:")
    val lado1 = readln().toDouble()
    val lado2 = readln().toDouble()
    val lado3 = readln().toDouble()

    if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
        println("É possível formar um triângulo com esses segmentos de reta.")
    } else {
        println("Não é possível formar um triângulo com esses segmentos de reta.")
    }
}

fun tipoTriangulo() {
    println("Digite o valor dos três segmentos:")
    val lado1 = readln().toDouble()
    val lado2 = readln().toDouble()
    val lado3 = readln().toDouble()

    if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
        println("É possível formar um triângulo com esses segmentos de reta.")

        when {
            lado1 == lado2 && lado2 == lado3 -> println("O triângulo é EQUILÁTERO.")
            lado1 == lado2 || lado2 == lado3 || lado1 == lado3 -> println("O triângulo é ISÓSCELES.")
            else -> println("O triângulo é ESCALENO.")
        }
    } else {
        println("Não é possível formar um triângulo com esses segmentos de reta.")
    }
}

fun jooKenPo() {
    val opcoes = arrayOf("Pedra", "Papel", "Tesoura")
    println("Bem-vindo ao jogo de JoKenPo!\nEscolha sua jogada:")
    println("1. Pedra")
    println("2. Papel")
    println("3. Tesoura")
    val escolhaJogador = readln().toInt()
    // Verifica se a jogada é válida
    if (escolhaJogador !in 1..3) {
        println("Opção inválida. Tente novamente.")
        return
    }
    //Jogada do PC
    val jogadaComputador = Random.nextInt(3) + 1
    println("\nVocê escolheu: ${opcoes[escolhaJogador - 1]}")
    println("O computador escolheu: ${opcoes[jogadaComputador - 1]}")
    // Verifica o vencedor
    when {
        escolhaJogador == jogadaComputador -> println("Empate!")
        (escolhaJogador == 1 && jogadaComputador == 3) ||
                (escolhaJogador == 2 && jogadaComputador == 1) ||
                (escolhaJogador == 3 && jogadaComputador == 2) -> println("Você ganhou!")
        else -> println("Você perdeu!")
    }
}

fun adivinhaNumero() {
    println("Tente adivinhar o número sorteado entre 1 e 5.")
    val numeroSorteado = Random.nextInt(1, 6)
    var tentativas = 0
    var numeroJogador: Int
    do {
        print("Digite seu palpite (1 a 5): ")
        numeroJogador = readln().toInt()
        if (numeroJogador !in 1..5) {
            println("Número inválido! Por favor, digite um número entre 1 e 5.")
            continue
        }
        tentativas++

        if (numeroJogador < numeroSorteado) {
            println("O número sorteado é maior. Tente novamente!")
        } else if (numeroJogador > numeroSorteado) {
            println("O número sorteado é menor. Tente novamente!")
        }

    } while (numeroJogador != numeroSorteado)
    println("Parabéns! Você acertou o número sorteado $numeroSorteado em $tentativas tentativas.")
}

fun adivinhaNumeroLimitado() {
    println("Tente adivinhar o número sorteado entre 1 e 10.\nVocê tem 4 tentativas.")

    val numeroSorteado = Random.nextInt(1, 11)
    var tentativas = 0
    var numeroJogador: Int
    val maxTentativas = 4

    while (tentativas < maxTentativas) {
        print("Tentativa ${tentativas + 1} de $maxTentativas. Digite seu palpite (1 a 10): ")
        numeroJogador = readln().toInt()
        if (numeroJogador !in 1..10) {
            println("Número inválido! Por favor, digite um número entre 1 e 10.")
            continue
        }
        tentativas++
        if (numeroJogador == numeroSorteado) {
            println("Parabéns! Você acertou o número sorteado ($numeroSorteado) em $tentativas tentativa(s).")
            return
        } else if (numeroJogador < numeroSorteado) {
            println("O número sorteado é maior. Tente novamente!")
        } else {
            println("O número sorteado é menor. Tente novamente!")
        }
    }

    // Se o jogador não acertou após 4 tentativas
    println("Você não acertou o número. O número sorteado era $numeroSorteado.")
}

fun ProgessaoAritmetica() {
    print("Digite o primeiro termo da PA: ")
    val primeiroTermo = readln().toInt()
    print("Digite a razão da PA: ")
    val razao = readln().toInt()
    var termoAtual = primeiroTermo
    var soma = 0

    // Exibindo os 10 primeiros termos da PA
    println("\nOs 10 primeiros termos da PA são:")
    for (i in 1..10) {
        println(termoAtual)
        soma += termoAtual
        termoAtual += razao  // Calcula o próximo termo da PA
    }

    // Exibindo a soma dos 10 primeiros termos
    println("\nA soma dos 10 primeiros termos da PA é: $soma")
}

fun fibonacci() {
    println("Os 10 primeiros elementos da sequência de Fibonacci são:")
    var a = 1
    var b = 1
    print("$a $b ")
    // Calcula e exibe os próximos números da sequência
    for (i in 3..10) {
        val c = a + b
        print("$c ")
        // Atualiza os valores de a e b
        a = b
        b = c
    }
}

fun vetorOrdenado() {
    val vetor = IntArray(20)
    // Preenchendo o vetor com números aleatórios entre 0 e 99
    for (i in vetor.indices) {
        vetor[i] = Random.nextInt(0, 100)
    }
    println("Números gerados aleatoriamente:")
    for (numero in vetor) {
        print("$numero ")
    }
    // Ordenando o vetor em ordem crescente
    vetor.sort()
    println("\n\nNúmeros ordenados em ordem crescente:")
    for (numero in vetor) {
        print("$numero ")
    }
}

fun fibonacciLimitado() {
    println("Digite a quantidade de termos da sequência de Fibonacci que deseja ver:")
    val termos = readln().toInt()

    // Chama o procedimento FibonacciParaLimitado passando o número de termos
    fibonacciParaLimitado(termos)
}

// Procedimento Fibonacci que recebe um número inteiro indicando quantos termos mostrar
fun fibonacciParaLimitado(qtd: Int) {
    var a = 1
    var b = 1
    if (qtd >= 1) print("$a >> ")
    if (qtd >= 2) print("$b >> ")
    // Exibe os termos seguintes, se necessário
    for (i in 3..qtd) {
        val c = a + b
        print("$c >> ")
        a = b
        b = c
    }

    // Exibe "FIM" após os termos
    println("FIM")
}
