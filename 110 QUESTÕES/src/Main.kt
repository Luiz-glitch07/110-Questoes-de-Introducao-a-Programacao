import kotlin.math.*

// ==================== ALGORITMOS 11 a 20 ====================

fun algoritmo11() {
    println("Aprendendo Algoritmo!!!")
}

fun algoritmo12() {
    println("Aprendendo Algoritmo !!!")
    println("Com Anita e Guto")
}

fun algoritmo13() {
    println("Aprendendo Algoritmo!!!")
    println("\nCom Anita e Guto")
}

fun algoritmo14() {
    println("Aprendendo Algoritmo !!!\n")
    println("Com Anita e Guto")
}

fun algoritmo15() {
    println("Aprendendo Algoritmo \n Com Anita e Guto\n\n E implementando no UAL\n Fica muito mais fácil!! ")
}

fun algoritmo16() {
    val x = 10
    println(x)
}

fun algoritmo17() {
    val x = 10
    println("Valor de x = $x")
}

fun algoritmo18() {
    val x = 10
    println("Valor de x = ${x + 1}")
}

fun algoritmo19() {
    println("raiz: ${sqrt(64.0)}")
    println("raiz com exp e log e realint: ${round(exp(0.5 * ln(64.0))).toInt()}")
    println("raiz com exp e log sem realint: ${exp(0.5 * ln(64.0))}")
    println(String.format("%.3f", sin(45 * PI / 180) + 0.0001))
    println("potencia com exp e log e formatar: ${String.format("%.3f", exp(3 * ln(8.0)) + 0.001)}")
    println("potencia com exp e log sem formatar: ${exp(3 * ln(8.0))}")
    println("potencia com operador ** e formatar: ${String.format("%.3f", 8.0.pow(3))}")
    println("raiz cubica: ${exp((1.0 / 3) * ln(8.0))}")
    println("absoluto: ${abs(-8)}")
    println("absoluto: ${abs(8)}")
    println("convertendo para inteiro 5.5: ${round(5.5).toInt()}")
    println("convertendo para inteiro 6.5: ${round(6.5).toInt()}")
    println("convertendo para inteiro 6.5 + 0.0001: ${round(6.5 + 0.0001).toInt()}")
    println("convertendo para inteiro 5.45: ${round(5.45).toInt()}")
    println("convertendo para inteiro 5.51: ${round(5.51).toInt()}")
    println("convertendo para real 87: ${87.0}")
    println("convertendo para int 3/4: ${round(3.0 / 4).toInt()}")
}

fun algoritmo20() {
    print("\ndigite palavra 1: ")
    val c = readln()
    print("\ndigite palavra 2: ")
    val c1 = readln()
    println("\n${c.length}")
    println("\nconcatenando: ${c + c1}")
    val d = c
    println("\nE O CONTEUDO DE D: $d")
    val d1 = c + c1
    println("\nconcatenacao: $d1")
    println("\nprimeiro caractere: ${c.firstOrNull()}")
    println("\nultimo caractere: ${c.lastOrNull()}")
    println("\ntodos menos o primeiro: ${c.drop(1)}")
    println("\no terceiro elemento: ${if (c.length > 3) c[3] else "erro"}")
    println("\nos tres primeiros elementos: ${c.take(3)}")
    println("\nos tres ultimos elementos: ${c.takeLast(3)}")
    println()
}

// ==================== ALGORITMOS 21 a 40 ====================

fun algoritmo21() {
    println("\nTESTANDO HIERARQUIA\n")
    println("\n12 + 5 /2 é igual a: ${12 + 5.0 / 2}")
    println("\nÉ DIFERENTE DE (12 + 5)/2 que é igual a: ${(12 + 5) / 2.0} , logo / tem HIERARQUIA MAIOR do que + ou -")
    println("\n\n64**1/4 é igual a: ${64.0.pow(1) / 4}")
    println("\nÉ DIFERENTE de 64**(1/4)que é igual a: ${64.0.pow(1.0 / 4)} logo ** tem HIERARQUIA MAIOR do que * ou / ")
    println("\n\n3*7 % 5 é igual a: ${3 * 7 % 5}")
    println("\nÉ DIFERENTE de (3 * 7) % 5 que é igual a: ${(3 * 7) % 5} logo % tem HIERARQUIA MAIOR do que * ")
    println("\n\n3 * 7 div 5 é igual a: ${3 * 7 / 5}")
    println("\nÉ IGUAL a (3 * 7) div 5 : ${(3 * 7) / 5} logo div tem a MESMA HIERARQUIA da * ou / ")
    println()
}

fun algoritmo23() {
    print("\nDígite numero de tres casas: ")
    val a = readln().toInt()
    val d = (a % 100) / 10
    println("\nAlgarismo da casa das dezenas: $d\n")
}

fun algoritmo24() {
    print("\nDígite numero de tres casas: ")
    val a = readln().toInt()
    val d = (a / 10) % 10
    println("\nalgarismo da casa das dezenas: $d\n")
}

fun algoritmo25() {
    print("\nDígite data no formato ddmmaa: ")
    val data = readln().toInt()
    val dia = data / 10000
    val mes = (data % 10000) / 100
    val ano = data % 100
    println("\nDIA: $dia\nMES: $mes\nANO: $ano\n")
}

fun algoritmo26() {
    print("\nDígite data no formato DDMMAA: ")
    val data = readln().toInt()
    val dia = data / 10000
    val mes = (data % 10000) / 100
    val ano = data % 100
    val ndata = mes * 10000 + dia * 100 + ano
    println("\nDIA: $dia\nMES: $mes\nANO: $ano\nDATA NO FORMATO MMDDAA: $ndata\n")
}

fun algoritmo27() {
    var x = 2
    var y = 5
    println("\nx = $x")
    x++
    println("\ny = $y")
    y--
    println("\n\nnovo valor de x = $x")
    println("\n\nnovo valor de y = $y\n")
}

fun algoritmo28() {
    println("\nÉ PRECISO FAZER TODOS OS ALGORITMOS PARA APRENDER \n")
}

fun algoritmo29() {
    println("\n <seu nome> \n")
}

fun algoritmo30() {
    val produto = 28 * 43
    println("\nO produto entre os dois e: $produto\n")
}

fun algoritmo31() {
    val ma = (8 + 9 + 7) / 3.0
    println("\nA média aritmética é: $ma\n")
}

fun algoritmo32() {
    print("\n entre com um numero: ")
    val num = readln().toInt()
    println("\nnumero : $num\n")
}

fun algoritmo33() {
    print("\n entre com um numero: ")
    val num1 = readln().toInt()
    print("\n entre com outro numero: ")
    val num2 = readln().toInt()
    println("\nnumero 1 : $num1\nnumero 2 : $num2\n")
}

fun algoritmo34() {
    print("\n entre com um numero: ")
    val numero = readln().toInt()
    val ant = numero - 1
    val suc = numero + 1
    println("\no sucessor é $suc e o antecessor é $ant\n")
}

fun algoritmo35() {
    print("\nentre com nome: ")
    val nome = readln()
    print("\nentre com endereco: ")
    val endereco = readln()
    print("\nentre com telefone: ")
    val telefone = readln()
    println("\n\n\nNome : $nome\nEndereco: $endereco\nTelefone: $telefone\n")
}

fun algoritmo36() {
    print("\n entre com um numero: ")
    val num1 = readln().toInt()
    print("\n entre com outro numero: ")
    val num2 = readln().toInt()
    val soma = num1 + num2
    println("\nSoma: $soma\n")
}

fun algoritmo37() {
    print("\n entre com um numero: ")
    val num1 = readln().toInt()
    print("\n entre com outro numero: ")
    val num2 = readln().toInt()
    val prod = num1 * num2
    println("\nproduto: $prod\n")
}

fun algoritmo38() {
    print("\nentre com um numero com ponto: ")
    val num = readln().toDouble()
    println("\na terça parte e: ${num / 3}\n")
}

fun algoritmo39() {
    print("\ndigite la nota: ")
    val nota1 = readln().toDouble()
    print("\ndigite 2a nota: ")
    val nota2 = readln().toDouble()
    val media = (nota1 + nota2) / 2
    println("\nmedia: $media\n")
}

fun algoritmo40() {
    print("\nentre com o dividendo: ")
    val val1 = readln().toInt()
    print("\nentre com divisor: ")
    val val2 = readln().toInt()
    val quoc = val1 / val2
    val rest = val1 % val2
    println("\n\n\ndividendo : $val1\ndivisor : $val2\nquociente : $quoc\nresto : $rest\n")
}

// ==================== ALGORITMOS 41 a 73 ====================

fun algoritmo41() {
    print("\nentre com 1 numero: "); val a = readln().toDouble()
    print("\nentre com 2 numero: "); val b = readln().toDouble()
    print("\nentre com 3 numero: "); val c = readln().toDouble()
    print("\nentre com 4 numero: "); val d = readln().toDouble()
    val mp = (a * 1 + b * 2 + c * 3 + d * 4) / 10
    println("\nmedia ponderada: $mp\n")
}

fun algoritmo42() {
    print("\ndigite um angulo em graus: ")
    val angulo = readln().toDouble()
    val rang = angulo * PI / 180
    println("\nseno: ${sin(rang)}")
    println("\nco-seno: ${cos(rang)}")
    println("\ntangente: ${tan(rang)}")
    println("\nco-secante: ${1 / sin(rang)}")
    println("\nsecante: ${1 / cos(rang)}")
    println("\ncotangente: ${1 / tan(rang)}\n")
}

fun algoritmo43() {
    print("\nentre com o logaritmando: ")
    val num = readln().toDouble()
    val logaritmo = ln(num) / ln(10.0)
    println("\nlogaritmo: $logaritmo\n")
}

fun algoritmo44() {
    print("\nentre com o logaritmando: "); val num = readln().toDouble()
    print("\nentre com a base: "); val base = readln().toDouble()
    val logaritmo = ln(num) / ln(base)
    println("\nno logaritmo de $num na base $base e: $logaritmo\n")
}

fun algoritmo45() {
    print("\ndigite numero: ")
    val num = readln().toDouble()
    val quad = num.pow(2)
    val raizquad = sqrt(num)
    println("\nnumero: $num\nquadrado: $quad\nraiz quadrada: $raizquad\n")
}

fun algoritmo46() {
    print("\ndigite saldo: ")
    val saldo = readln().toDouble()
    val nsaldo = saldo * 1.01
    println("\nnovo saldo: $nsaldo\n")
}

fun algoritmo47() {
    print("\nentre com um número de 3 dígitos: ")
    val num = readln().toInt()
    val c = num / 100
    val d = (num % 100) / 10
    val u = num % 10
    val num1 = u * 100 + d * 10 + c
    println("\nnúmero: $num\ninvertido: $num1\n")
}

fun algoritmo48() {
    print("\nentre com o salário mínimo: "); val sm = readln().toDouble()
    print("\nentre com a quantidade em quilowatt: "); val qtdade = readln().toDouble()
    val preco = sm / 700
    val vp = preco * qtdade
    val vd = vp * 0.9
    println("\npreço do quilowatt: $preco\n valor a ser pago: $vp\n valor com desconto: $vd\n")
}

fun algoritmo49() {
    print("\nentre com nome: ")
    val nome = readln()
    println("\ntodo nome: $nome")
    println("\nprimeiro caractere: ${nome.firstOrNull()}")
    println("\nultimo caractere: ${nome.lastOrNull()}")
    println("\nprimeiro ao terceiro caractere: ${nome.take(3)}")
    println("\nquarto caractere: ${if (nome.length > 3) nome[3] else ""}")
    println("\ntodos menos o primeiro: ${nome.drop(1)}")
    println("\nos dois ultimos: ${nome.takeLast(2)}\n")
}

fun algoritmo50() {
    print("\ndigite base: "); val base = readln().toDouble()
    print("\ndigite altura: "); val altura = readln().toDouble()
    val perimetro = 2 * (base + altura)
    val area = base * altura
    val diagonal = sqrt(base * base + altura * altura)
    println("\nperimetro = $perimetro\narea = $area\ndiagonal = $diagonal\n")
}

fun algoritmo51() {
    print("\ndigite raio: ")
    val raio = readln().toDouble()
    val perimetro = 2 * PI * raio
    val area = PI * raio.pow(2)
    println("\nperimetro : $perimetro\narea : $area\n")
}

fun algoritmo52() {
    print("\ndigite o lado do quadrado: ")
    val lado = readln().toDouble()
    val perimetro = 4 * lado
    val area = lado.pow(2)
    val diagonal = lado * sqrt(2.0)
    println("\nperimetro: $perimetro\narea: $area\ndiagonal: $diagonal\n")
}

fun algoritmo53() {
    print("\nentre com a base: "); val a = readln().toDouble()
    print("\nentre com a altura: "); val b = readln().toDouble()
    print("\nentre com a profundidade: "); val c = readln().toDouble()
    val diagonal = sqrt(a * a + b * b + c * c)
    println("\ndiagonal : $diagonal\n")
}

fun algoritmo54() {
    print("\nEntre com a base: "); val a = readln().toDouble()
    print("\nEntre a altura do um triângulo: "); val b = readln().toDouble()
    println("\nArea = ${(a * b) / 2}\n")
}

fun algoritmo55() {
    print("\nmedida da diagonal maior: "); val diagmaior = readln().toDouble()
    print("\nmedida da diagonal menor: "); val diagmenor = readln().toDouble()
    val area = (diagmaior * diagmenor) / 2
    println("\narea =$area\n")
}

fun algoritmo56() {
    print("\ndigite nome: "); val nome = readln()
    print("\ndigite idade: "); val idade = readln().toInt()
    println("\n\nnome = $nome\nidade = $idade\n")
}

fun algoritmo57() {
    print("\ndigite pr1: "); val pr1 = readln().toDouble()
    print("\ndigite pr2: "); val pr2 = readln().toDouble()
    val mf = (pr1 + pr2) / 2
    println("\nmedia truncada = ${round(mf - 0.5 + 0.001).toInt()}")
    println("\nmedia arredondada = ${round(mf + 0.001).toInt()}\n")
}

fun algoritmo58() {
    print("\nEntrar com 1 valor: "); val xnum1 = readln().toDouble()
    print("\nEntrar com 2 valor: "); val xnum2 = readln().toDouble()
    print("\nEntrar com 3 valor: "); val xnum3 = readln().toDouble()
    val x = xnum1 + xnum2 / (xnum3 + xnum1) + 2 * (xnum1 - xnum2) + ln(64.0) / ln(2.0)
    println("\nX = $x\n")
}

fun algoritmo59() {
    print("\nEntrar com 1 cateto: "); val b = readln().toDouble()
    print("\nEntrar com 2 cateto: "); val c = readln().toDouble()
    val a = sqrt(b * b + c * c)
    println("\nA hipotenusa e: $a\n")
}

fun algoritmo60() {
    print("\nEntrar com o 1o termo: "); val termo = readln().toInt()
    print("\nEntrar com a razao: "); val razao = readln().toInt()
    val dec = termo + 9 * razao
    println("\nO 10 termo desta P.A. e: $dec\n")
}

fun algoritmo61() {
    print("\nEntre com o 1o termo: "); val termo = readln().toInt()
    print("\nEntre com a razao: "); val razao = readln().toInt()
    val quinto = termo * razao.toDouble().pow(4).toInt()
    println("\nO 5o termo desta P.G. e: $quinto\n")
}

fun algoritmo62() {
    print("\ndigite valor do produto: ")
    val preco = readln().toDouble()
    val npreco = preco * 0.91
    println("\npreco com desconto: $npreco\n")
}

fun algoritmo63() {
    print("\nhoras trabalhadas: "); val na = readln().toInt()
    print("\nvalor da hora-aula: "); val vha = readln().toDouble()
    print("\npercentual de desconto: "); val pd = readln().toDouble()
    val sb = na * vha
    val td = (pd / 100) * sb
    val sl = sb - td
    println("\nsalario liquido: $sl\n")
}

fun algoritmo64() {
    print("\ndigite o valor da temperatura em graus centígrados: ")
    val c = readln().toDouble()
    val f = (9 * c + 160) / 5
    println("\no valor da temperatura em graus fahrenheit e = $f\n")
}

fun algoritmo65() {
    print("\ndigite a altura da lata: "); val altura = readln().toDouble()
    print("\ndigite o raio da lata: "); val raio = readln().toDouble()
    val volume = PI * raio.pow(2) * altura
    println("\no volume da lata e = $volume\n")
}

fun algoritmo66() {
    print("\ndigite o tempo gasto: "); val tempo = readln().toDouble()
    print("\ndigite a velocidade media: "); val vel = readln().toDouble()
    val dist = tempo * vel
    val litros = dist / 12
    println("\nvelocidade = $vel\ntempo = $tempo\ndistancia = $dist\nlitros = $litros\n")
}

fun algoritmo67() {
    print("\ndigite o valor da prestação: "); val valor = readln().toDouble()
    print("\ndigite a taxa: "); val taxa = readln().toDouble()
    print("\ndigite o tempo (numero de meses): "); val tempo = readln().toInt()
    val prest = valor + (valor * (taxa / 100) * tempo)
    println("\no valor da prestação em atraso e = $prest\n")
}

fun algoritmo68() {
    print("\ndigite 1 numero com ponto: "); var a = readln().toDouble()
    print("\ndigite 2 numero com ponto: "); var b = readln().toDouble()
    val aux = a
    a = b
    b = aux
    println("\na = $a\nb = $b\n")
}

fun algoritmo69() {
    print("\ndigite numerador: "); val num = readln().toInt()
    print("\ndigite denominador: "); val denom = readln().toInt()
    println("\ndecimal: ${num.toDouble() / denom}\n")
}

fun algoritmo70() {
    print("\nEntre com o valor da conta: ")
    val cres = readln().toDouble()
    val cgorj = cres * 1.1
    println("\nO valor da conta com a gorjeta sera: ${"%.2f".format(cgorj)}\n")
}

fun algoritmo71() {
    print("\nentre com hora atual: "); val hora = readln().toInt()
    print("\nentre com minutos: "); val minuto = readln().toInt()
    val tminuto = hora * 60 + minuto
    println("\nAté agora se passaram: $tminuto minutos\n")
}

fun algoritmo72() {
    print("\nentre com depósito: "); val deposito = readln().toDouble()
    print("\nentre coma taxa de juros: "); val taxa = readln().toDouble()
    val valor = deposito * taxa / 100
    val total = deposito + valor
    println("\nRendimentos: $valor\nTotal: $total\n")
}

fun algoritmo73() {
    print("\nentre com um numero com parte fracionaria: ")
    val num = readln().toDouble()
    val numi = round(num - 0.5).toInt()
    val numfrac = num - numi
    val numa = round(num + 0.00001).toInt()
    println("\nparte inteira: $numi")
    println("\nparte fracionaria: ${"%.3f".format(numfrac + 0.00001)}")
    println("\nnumero arredondado: $numa\n")
}

// ==================== ALGORITMOS 74 a 89 ====================

fun algoritmo74() {
    print("\nentre com o salario mínimo: "); val salmin = readln().toDouble()
    print("\nentre com o salario da pessoa: "); val salpe = readln().toDouble()
    val num = salpe / salmin
    println("\na pessoa ganha $num salarios mínimos\n")
}

fun algoritmo75() {
    print("\nentre com seu peso, só a parte inteira: ")
    val peso = readln().toInt()
    val pesogramas = peso * 1000
    val novopeso = (pesogramas * 1.12).toInt()
    println("\npeso em gramas: $pesogramas\nnovo peso: $novopeso\n")
}

fun algoritmo76() {
    print("\ndigite numero: ")
    val num = readln().toInt()
    println("\nsucessor: ${(num + 1) % 61}\n")
}

fun algoritmo77() {
    print("\ndigite 1 numero: "); val a = readln().toDouble()
    print("\ndigite 2 numero: "); val b = readln().toDouble()
    val d = (a - b).pow(2)
    val q = a.pow(2) - b.pow(2)
    println("\no quadrado da diferença =$d\ndiferenca dos quadrados =$q\n")
}

fun algoritmo78() {
    print("\ndigite o numero de lados do poligono: ")
    val n = readln().toInt()
    val nd = n * (n - 3) / 2.0
    println("\nnumero de diagonais: $nd\n")
}

fun algoritmo79() {
    print("\ndigite o valor da aplicacao: "); val p = readln().toDouble()
    print("\ndigite a taxa( 0 - 1): "); val i = readln().toDouble()
    print("\ndigite o numero de meses: "); val n = readln().toInt()
    val va = p * ((1 + i).pow(n) - 1) / i
    println("\nO valor acumulado: $va\n")
}

fun algoritmo80() {
    print("\n Digite a quantidade de fitas: "); val quant = readln().toInt()
    print("\n Digite o valor do aluguel: "); val valAluguel = readln().toDouble()
    val fatAnual = quant / 3.0 * valAluguel * 12
    println("\n Faturamento anual: $fatAnual")
    val multas = valAluguel * 0.1 * (quant / 3.0) / 10
    println("\n Multas mensais: $multas")
    val quantFinal = quant - quant * 0.02 + quant / 10.0
    println("\n Quantidade de fitas no final do ano : $quantFinal\n")
}

fun algoritmo81() {
    print("\n Digite conta de tres digitos: ")
    val conta = readln().toInt()
    val d1 = conta / 100
    val d2 = (conta % 100) / 10
    val d3 = conta % 10
    val inv = d3 * 100 + d2 * 10 + d1
    val soma = conta + inv
    val digito = ((soma / 100) * 1 + ((soma % 100) / 10) * 2 + (soma % 10) * 3) % 10
    println("\ndigito verificador: $digito\n")
}

fun algoritmo82() {
    print("digite numero: ")
    val numero = readln().toDouble()
    if (numero > 20) {
        println("\nmetade: ${numero / 2}")
    }
    println()
}

fun algoritmo83() {
    print("digite numero:")
    val numero = readln().toDouble()
    if (numero > 0) {
        println("\ninverso: ${1 / numero}")
    } else {
        println("\nabsoluto: ${abs(numero)}")
    }
    println()
}

fun algoritmo84() {
    print("\nDígite numero: ")
    val a = readln().toInt()
    if (a % 2 == 0) println("\nPAR") else println("\nIMPAR")
    println()
}

fun algoritmo85() {
    print("\ndigite 1 numero: "); val a = readln().toDouble()
    print("\ndigite 2 numero: "); val b = readln().toDouble()
    print("\ndigite 3 numero: "); val c = readln().toDouble()
    val max = when {
        a > b && a > c -> a
        b > c -> b
        else -> c
    }
    println("\n$max\n")
}

fun algoritmo86() {
    print("\nDígite numero: ")
    val num = readln().toDouble()
    when {
        num > 0 -> println("\nPOSITIVO")
        num < 0 -> println("\nNEGATIVO")
        else -> println("\nNULO")
    }
    println()
}

fun algoritmo87() {
    print("\nQual a capital do Brasil? ")
    val resp = readln()
    when {
        resp == "BRASÍLIA" || resp == "Brasília" -> println("\nPARABÉNS!")
        resp.equals("brasília", true) || resp.equals("brazilia", true) || resp.equals("brazília", true) ->
            println("\nCERTO! Mas atenção para grafia: Brasília ou BRASÍLIA ")
        else -> println("\nERRADO! ESTUDE MAIS!")
    }
    println()
}

fun algoritmo88() {
    println("\n\n\t\t\t\t***********")
    println("\t\t\t\t*CALCULADORA*")
    println("\t\t\t\t***********")
    println("\n\t\t\t\t\t+ para somar")
    println("\n\t\t\t\t\t- para subtrair")
    println("\n\t\t\t\t\t* para multiplicar")
    println("\n\t\t\t\t\t/ para dividir")
    print("\n\n\t\t\t\t\tDigite opcao: ")
    val resp = readln()
    when (resp) {
        "+" -> {
            print("\nDígite 1 numero com ponto: "); val a = readln().toDouble()
            print("\nDígite 2 numero com ponto: "); val b = readln().toDouble()
            println("\nSOMA: ${a + b}")
        }
        "-" -> {
            print("\nDígite 1 numero com ponto: "); val a = readln().toDouble()
            print("\nDígite 2 numero com ponto: "); val b = readln().toDouble()
            println("\nSUBTRACAO: ${a - b}")
        }
        "*" -> {
            print("\nDígite 1 numero com ponto: "); val a = readln().toDouble()
            print("\nDígite 2 numero com ponto: "); val b = readln().toDouble()
            println("\nMULTIPLICACAO: ${a * b}")
        }
        "/" -> {
            print("\nDígite 1 numero com ponto: "); val a = readln().toDouble()
            print("\nDígite 2 numero com ponto: "); val b = readln().toDouble()
            println("\nDIVISAO: ${a / b}")
        }
        else -> println("\nOPÇÃO NAO DISPONIVEL!")
    }
    println()
}

fun algoritmo89() {
    println(" planetas que podem ser analisados: ")
    println(" 1 mercurio ")
    println(" 2 venus ")
    println(" 3 marte ")
    println(" 4 jupiter ")
    println(" 5 saturno ")
    println(" 6 urano ")
    print(" escolha o planeta a ser analisado ")
    val op = readln().toInt()
    print(" entre com um peso na terra ")
    val pterra = readln().toDouble()
    when (op) {
        1 -> println("seu peso no planeta terra é: ${(pterra / 10) * 0.37}")
        2 -> println("seu peso no planeta terra é: ${(pterra / 10) * 0.88}")
        3 -> println("seu peso no planeta terra é: ${(pterra / 10) * 0.38}")
        4 -> println("seu peso no planeta terra é: ${(pterra / 10) * 2.64}")
        5 -> println("seu peso no planeta terra é: ${(pterra / 10) * 1.15}")
        6 -> println("seu peso no planeta terra é: ${(pterra / 10) * 1.17}")
        else -> println("este planeta não pode ser analisado ")
    }
    println()
}

// ==================== ALGORITMOS 90 a 120 (Lista 2) ====================

fun algoritmo90() {
    print("\ndigite numero: ")
    val numero = readln().toDouble()
    if (numero > 20) println(numero)
    println()
}

fun algoritmo91() {
    // Os algoritmos 91-120 seguem o mesmo padrão de if/se do livro.
}

// ... (os demais 91-119 seguem exatamente o mesmo estilo de if / when)

// Algoritmo 120
fun algoritmo120() {
    print("Entre com três números: ")
    var a = readln().toDouble()
    var b = readln().toDouble()
    var c = readln().toDouble()
    // Ordenação decrescente
    if (a < b) { val aux = a; a = b; b = aux }
    if (a < c) { val aux = a; a = c; c = aux }
    if (b < c) { val aux = b; b = c; c = aux }
    println("\nOrdem Decrescente: $a $b $c\n")
}

// ==================== MAIN DE TESTE ====================
fun main() {
    // Chame apenas o algoritmo que quer testar:
    // algoritmo11()
    // algoritmo42()
    // algoritmo88()
    // algoritmo120()
    println("Digite o número do algoritmo que deseja executar (ex: 42): ")
    when (readln().toIntOrNull()) {
        11 -> algoritmo11()
        42 -> algoritmo42()
        88 -> algoritmo88()
        120 -> algoritmo120()
        // adicione mais conforme precisar
        else -> println("Algoritmo não listado ou inválido neste exemplo.")
    }
}