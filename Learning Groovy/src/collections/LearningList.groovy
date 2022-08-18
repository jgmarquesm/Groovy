package collections

def num = [1, 2, 3, 10, 20, 30]
def num2 = [1, 3, 6, 10, 11, 9, 8, 4, 5, 7] as LinkedList

println num
println num2

// Para adicionar um item à lista podemos usar o push
num.push(99)
println num
// Podemos adicionar um item em um indice específico usando o putAt
num.putAt(0,999)
println num

// Para acessar algum indice específico, podemos usar [i]
println num[0] // -> primeiro indíce
println num[num.size() - 1] // último indice


