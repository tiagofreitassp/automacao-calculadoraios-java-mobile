=== Automacao de calculos no iOS ===

0.Objetivo
 .Realizar calculos basicos na calculadora do iOS.

1.Requisitos:
 .Os drivers devem estar na pasta drivers
 .Java JDK 8
 .Intellij Idea, Eclipse IDE, Visual Studio Code
 .Dependencias Maven (Ja estao inseridas no arquivo pom.xml pronto para serem baixadas ao importar na IDE
  com as versoes estaveis).

2.Configuracoes:
 .O projeto foi criado no MacOS, não e para ser executado no Windows e no Linux. Automacoes com iOS so podem ser feitas na plataforma com o MacOS.
 .Os metodos para criar o driver Mobile estao na classe EmuladorDriver e MobileDriver

3.Execucao:
 .Abrir uma das classes ***Test.java no Intellij Idea ou no Eclipse
 .Para executar num smartphone/simulador, abra a classe Mobile Driver e altere os valores das variáveis

4.Evidencias:
 .Apos a execucao as imagens de evidencias sao armazenadas na pasta screenshots.

5.Massas:
 .Nao e necessario criar massas.

6.App
 .O app da calculadora do iOS utilizado para o teste deste projeto foi desenvolvido por terceiro e não por mim, caso execute com sucesso ou não, recomendo que após entender o 
 código escrito, instale outro arquivo do formato .ipa e adapte o projeto. 
 .Mas deixei o codigo fonte (SimpleCalculator-master.zip) na pasta drivers/iOS caso tenha problemas com o BundleId, abra o codigo fonte e altere o BundleId na sua conta Apple ID.
 .Antes de executar, espero que saiba de instruções sobre o Apple ID, WebDriverAgent, Node, Appium e dependencias no MacOS, são exigências para automação nas plataformas da Apple.