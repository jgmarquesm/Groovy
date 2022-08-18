// Se precisarmos usar um package 3rd party que não vem no download de Java ou Groovy, podemos usar o Annotation Grape
// Aqui queremos baixar a versão '3.4' do artefato 'commons-lang3' do package 'org.apache.commons'
@Grapes(
    @Grab(group='org.apache.commons',module='commons-lang3',version='3.12')
)
// Agora é só usar. Simples e rápido, sem precisar ficar baixando e descompactando .jars

package iniciandonogroovy

import groovy.grape.Grape

// O uso de ; é opcional!
// O uso dos () para passar os argumentos do método também é opcional (isso me parece meio desorganizado)
println("1 - Hello, world! - It's made using Groovy.");
println("2 - Hello, world! - It's made using Groovy.")
println "3 - Hello, world! - It's made using Groovy.";
println "4 - Hello, world! - It's made using Groovy."

