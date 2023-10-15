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

## Maven no Linux

1-  Atualize os pacotes

`sudo apt-get update`

2 - Instale o maven com o seguinte comando

`sudo apt-get -y install maven`

O maven deverá ser instalado em um dos seguintes caminhos **/usr/share/maven**
 ou **/etc/maven**
.

Para verificar se o maven foi instalado com sucesso, acessar o terminar e digitar

`mvn -version`

Isso irá mostrar a versão do maven instalada.

## Maven no MacOS

1 - [Clique aqui para baixar o Maven](https://dlcdn.apache.org/maven/maven-3/3.9.5/binaries/apache-maven-3.9.5-bin.tar.gz) ou [acesse essa página](https://maven.apache.org/download.cgi) e realize o download da versão mais recente do `Binary tar.gz archive`.

2 - Abra o terminal, acesse a pasta de onde foi realizado o download do arquivo e execute o comando para extrair o arquivo: `tar -xvf NOME_COMPLETO_DO_ARQUIVO` (ex.: `tar -xvf apache-maven-3.9.5-bin.tar.gz`).

<aside>
⚠️ Extraindo dessa forma, a instalação do Maven ficará na pasta que você realizou o Download. Você *não pode* apagar essa pasta extraída pois se não a instalação não vai funcionar. Caso queira mudar de local, pode extrair em outra pasta ou arrastar a pasta após a extração (mas antes do próximo passo).
</aside>


3 - Agora, basta atribuir à sua variável ambiente `PATH` o local da pasta extraída do Maven. Basta abrir o seu arquivo de configuração do Shell (depende de qual você usa, se for ZSH é o `.zshrc` e se for o BASH é o `.bash_profile`) e alterar o `PATH`. Exemplo:


```tsx
export M2_HOME="~/Downloads/apache-maven-3.9.5"
export PATH="${M2_HOME}/bin:${PATH}"
```

<aside>
ℹ️ Comandos para abrir os arquivos de configuração do SHELL diretamente no VSCode: `code ~/.zshrc` para abrir o ZSH e `code ~/.bash_profile` para abrir o do BASH.
</aside>


4 - Pronto, agora feche o seu terminal, abra novamente e verifique se o comando `mvn -version` retorna a versão instalada do Maven. Exemplo:


```tsx
Apache Maven 3.9.5 (57804ffe001d7215b5e7bcb531cf83df38f93546)
Maven home: /Users/username/Downloads/apache-maven-3.9.5
Java version: 17.0.3.1, vendor: Oracle Corporation, runtime: /Library/Java/JavaVirtualMachines/jdk-17.0.3.1.jdk/Contents/Home
Default locale: pt_BR, platform encoding: UTF-8
OS name: "mac os x", version: "14.0", arch: "x86_64", family: "mac"
```

# Rest Client

Nessa documentação temos algumas opções de ferramentas para requisições REST

[API Dog](https://apidog.com/download/)

[Insomnia](https://insomnia.rest/download)

[Postman](https://www.postman.com/downloads/)


# VSCode

## Instalação

A instalação do VSCode pode ser feita através do link abaixo:

Ao acessar o site, você deverá escolher para qual sistema operacional deseja realizar o download.

Ao baixar o arquivo, clique nele e siga todo o passo a passo. 

<aside>
💡 Caso já tenha o VS Code instalado, garanta que ele está `atualizado`

</aside>

## Configuração Java no VS Code

Para utilizar o Java no VSCode, é necessário instalar as extensões abaixo

- **vscjava.vscode-java-pack**
    - vscjava.vscode-java-debug
    - vscjava.vscode-java-test
    - vscjava.vscode-java-dependency
    - vscjava.vscode-maven
    - redhat.java
- **vscjava.vscode-spring-initializr**
- **vmware.vscode-spring-boot**
- **vscjava.vscode-spring-boot-dashboard**

# Recomendação

Recomendamos que você deixe a opção `compact folders` do VS Code `desmarcada`

1. Clique na engrenagem e depois em Settings
        
2. Na barra de pesquisa, pesquise por `compact folders` e `Desmarque` essa opção, dessa forma o explorador de arquivos ficará no modelo de árvore e você terá uma melhor visualização das pastas do projeto.
