# automacao-calculadoraios-java-mobile
Script de automacao de calculos basicos na calculadora do iOS usando Java, Selenium, Appium e jUnit.

### Cobertura dos testes:  ###
*Descricao: 

Realizar calculos basicos na calculadora do iOS no emulador.

Realizar calculos basicos na calculadora do iOS no smartphone.

## Tecnologias:
* [Java Jdk 8](https://www.oracle.com/br/java/technologies/javase-downloads.html)
* [Maven](https://maven.apache.org)
* [Maven dependencias](https://mvnrepository.com)
* [Appium](http://appium.io)
* [Selenium](https://www.selenium.dev/projects/)
* [Intellij Idea](https://www.jetbrains.com/pt-br/idea/)
* [jUnit](https://junit.org/junit5/)
* [MacOS X](https://www.apple.com/br/macos/what-is/)
* [Xcode](https://apps.apple.com/br/app/xcode/id497799835?mt=12)
* [Node](https://nodejs.org/en/)
* [WebDriverAgent](https://github.com/facebookarchive/WebDriverAgent)
* [iOS](https://www.apple.com/br/iphone/)
* [Android Studio](https://developer.android.com/studio)

## Dependências:
* Selenium-java
* jUnit 4
* Commons-io
* Cucumber-junit
* Cucumber-java
* Jxl
* Poi-ooxml
* Appium

## Instruções de execução:

###  - App
*Importante: 

O app da calculadora do iOS utilizado para o teste deste projeto foi desenvolvido por terceiro e não por mim, caso execute com sucesso ou não, recomendo que após entender o código escrito, 
instale outro arquivo do formato .ipa e adapte o projeto. 

Mas deixei o codigo fonte (SimpleCalculator-master.zip) na pasta drivers/iOS caso tenha problemas com o BundleId, abra o codigo fonte e altere o BundleId na sua conta Apple ID.

E obrigatorio voce ter conhecimento sobre o Apple ID, WebDriverAgent, Node, Appium e dependencias no MacOS, são exigências para automação nas plataformas da Apple.

Se o seu Apple ID nao tiver perfil de desenvolvedor da Apple, voce tera problemas ao gerar um arquivo .ipa, e instala-lo no aparelho, recomendo abrir o projeto do codigo fonte da calculadora no Xcode e abri-lo 
no Simulator para instala-lo sem precisar gerar aquivo .ipa. O driver do Simulator na classe MobileDriver ja esta configurado para executar.

###  - Plataforma
*Importante:

O projeto foi criado no MacOS, não e para ser executado no Windows e no Linux. Automacoes com iOS so podem ser feitas na plataforma com o MacOS.

Os metodos para criar o driver Mobile estao na classe EmuladorDriver e MobileDriver.

Recomendado utilizar o Intellij Idea, mas pode usar o Eclipse IDE, Visual Studio Code ou Spring Tools Suite.

###  - Fluxo
*Descricao: Este script ira executar calculos simples como Soma, Subtracao, Multiplicacao e Divisao.

###  - Massas
*Descricao: 
Nao e necessario criar massas.

###  - Evidencias
*Descricao:
Apos a execucao as imagens de evidencias sao armazenadas na pasta screenshots..

Para visualizar as evidencias no documento pode usar o MS Office Word ou o LibreOffice

###  - Inicializar a automação
*Descricao:

Execute o Appium.

Abrir uma das classes ***Test.java no Intellij Idea ou no Eclipse.

No caso para executar num smartphone, abra a classe Mobile Driver e altere o valor no campo "DeviceId".