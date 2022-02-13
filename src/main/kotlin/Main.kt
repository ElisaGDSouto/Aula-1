 fun main () {
     var nome:String = "Eduarda"
     var idade:Byte = 18
     var teste = 14

     nome = "marco"
     idade = 20
     teste = 19

     // constante
     val nomeCompleto = "eduarda rodrigues"
 //   nomeCompleto = "eduarda rodrigues silva"

     val bob:Compositor = Compositor()
     bob.nome = "Bob Singler"
     bob.idade = 45
 //   ptint(bob.toString())
     println("0 ${bob.nome} tem ${bob.idade} anos")

      print(bob.nome!!.uppercase())
 }