## Configuração de ambiente

<aside>⚠️ Recomendação: Ao criar o seu projeto no [Spring Initializr](https://start.spring.io/), adicione a dependência `Spring Boot DevTools`, para habilitar o live reload da aplicação.</aside>

# Java 17

Nesse guia iremos aprender como configurar o Java 17

# Windows

### Passo a passo

1 - Fazer o download do Java no link abaixo

 https://download.oracle.com/java/17/archive/jdk-17.0.6_windows-x64_bin.msi

2 -  Clicar no arquivo baixado

3 - Clicar em *next*

4 - Clicar em *next* para inserir o Java na pasta default

5 - Clicar em *yes*  e depois em *close*

6 - Acessar o diretório C:\Arquivo de Programas\Java\jdk-17.0.3.1 e verificar se a pasta está instalada corretamente 

7 - Clicar com o botão direito em *Meu computador > Propriedades*

8 - Acessar *Configurações avançadas de sistema*

9 - Acessar *Variáveis de ambiente*

10 - Clicar em *para adicionar a variável de ambiente e colocar a seguinte instrução*

Nome da variável: JAVA_HOME

Valor da variável: C:\Arquivo De Programas\jdk-17.0.3.1 

![Screenshot 2023-10-15 at 15 23 24](https://github.com/mtsfreitas/to-do-list/assets/21324690/2556a484-95d9-49b1-8995-b5bf52de1dc7)

Obs: O valor da variável deverá ser exatamente o caminho onde o Java foi instalado

11- Clicar em OK

12 - Acessar a variável *Path* e clicar em editar e depois em new

13 - Adicionar a variável do Java com a seguinte instrução e clicar em ok

%JAVA_HOME%\bin

![Screenshot 2023-10-15 at 15 23 39](https://github.com/mtsfreitas/to-do-list/assets/21324690/af2b7852-c712-4b21-aa86-e155fd441cd5)

14 - Acessar o terminal e digitar o comando *java -version* e verificar se a seguinte mensagem aparece.

*PRONTINHO! Java configurado com sucesso no Windows.*

# Linux (Ubuntu)

### Passo a passo

1 - Abrir um terminal (CTRL + ALT + T)

2 - Digitar o seguinte comando 

`sudo add-apt-repository ppa:linuxuprising/java`

Aceitar os termos, apertando ENTER

3 - Atualizar o gerenciador de pacotes

`sudo apt-get update`

4 - Instalar o Java 17

`sudo apt-get install oracle-java17-installer --install-recommends`

5 - Pra ter certeza se o Java está instalado, digite `java -version`

### Observação.

Se por acaso o Java não estiver sendo reconhecido no terminal, adicione o JAVA_HOME nas variáveis do seu bashrc 

`export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64`

# MacOS

### Passo a passo

1 - Instalar utilizar  o [link para dowload](https://download.oracle.com/java/17/archive/jdk-17.0.3.1_macos-x64_bin.dmg)

2 - Clique em JDK17.pkg

3 -  Na tela de boas vindas, clicar em **Continue**

4 - Clicar em Install

5 - O Sistema pedirá sua senha, inserir e clicar em **Install Software,** depois em **Install**

6- Clicar em **Close**

7 - Abra o terminal e digite **java -version**


Reference: https://efficient-sloth-d85.notion.site/Curso-de-Java-2408d11bfc3447e980fe9460b6293976

# Maven

Nessa documentação você terá o passo a passo para instalar o maven

## Maven no Windows

1 - Baixar o arquivo do maven na seguinte url [clicando aqui](https://dlcdn.apache.org/maven/maven-3/3.9.5/binaries/apache-maven-3.9.5-bin.zip)

2 - Descompactar o arquivo baixado. 

*Atenção: No momento de descompactar o arquivo, é importante colocar em um local de fácil acesso. Uma dica é descompactar no C: , e renomear  a pasta para maven*

3 - Após descompactar, acessar as variáveis de ambiente, clicando em **********Este Compuador > Propriedades**********

4 - Clicar em *Configurações avançadas do sistema*

5 - Na aba *avançado* clicar em *Variáveis de ambiente*

6 - Selecione a variável *Path* e clique em *Editar*

7 - Clique no botão ****novo e**** adicione o caminho da pasta bin do maven****: `C:\maven\bin`**  e clique em ****ok****

8 - Acesse o *terminal* e digite o comando *mvn .* O resultado esperado deverá ser o seguinte
