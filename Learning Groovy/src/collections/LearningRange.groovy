package collections

Range num = 1..10  // -> COnversão explícita, semelhante ao casting
Range letter = 'a'..'z'
println num.from
println num.to
println letter.from
println letter.to

// Um Range é um estrutura de dados semelhante à lista, porém ela é preenchida em sequencia do primeiro
// ao último, por exemplo, se o Range for 1..10 ela começa preenchendo do 1 e preenche 1 a 1 até o 10.

assert num.contains(10)
assert letter.contains("j")

// Para criar um Range que é exclusivo (não inclui o último elemento)

Range num2 = 1..<10

println num2.from
println num2.to