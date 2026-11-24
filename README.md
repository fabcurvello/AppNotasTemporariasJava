# App Notas Temporárias (Java)

> Repositório didático: exercício prático de Android nativo com **Java**, desenvolvido e aplicado em sala de aula pelo Prof. Fabricio Curvello.

## Sobre o projeto

Bloco de notas simples que guarda uma nota no **cache** do aparelho, para uso temporário.

## Contexto acadêmico

Exercício aplicado em sala de aula, usado como prática guiada com os alunos.

## Versão em Kotlin

Esta mesma aplicação também foi desenvolvida em **Kotlin**: [AppNotasTemporariasKotlin](https://github.com/fabcurvello/AppNotasTemporariasKotlin). Comparar as duas versões lado a lado ajuda a entender as diferenças de sintaxe entre Java e Kotlin no Android.

## O que o app faz

- Campo para o usuário escrever uma nota.
- Botão **Salvar**: grava a nota no arquivo `temp_note.txt`, no diretório de cache do app.
- Botão **Carregar**: lê a nota do cache e exibe na tela.

## Conceitos trabalhados em aula

- Armazenamento temporário em **cache** (`cacheDir`)
- Leitura e escrita de arquivos com `FileOutputStream` / `FileInputStream`
- Tratamento de exceções (`IOException`)

## Tecnologias

- **Java**
- **Android SDK** (Android Studio)
- **Gradle**
- `minSdk 27` / `compileSdk 34`

## Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/fabcurvello/AppNotasTemporariasJava.git
   ```
2. Abra a pasta no **Android Studio** e aguarde a sincronização do Gradle.
3. Execute em um emulador ou dispositivo físico com Android compatível com a API 27 ou superior.

## Veja também

Outros repositórios de aula com o mesmo tema:

- [AppArmazenamentoCacheAnimaUNA](https://github.com/fabcurvello/AppArmazenamentoCacheAnimaUNA)
- [AppArmazenamentoTemporarioCacheJavaAndroid](https://github.com/fabcurvello/AppArmazenamentoTemporarioCacheJavaAndroid)
- [AppArmazenamentoCacheAnima](https://github.com/fabcurvello/AppArmazenamentoCacheAnima)
- [AppNotasTemporariasKotlin](https://github.com/fabcurvello/AppNotasTemporariasKotlin)

## Autor

**Fabricio Curvello**: professor de desenvolvimento de software no SENAI-RJ (desde 1997) e em faculdades do grupo Ânima Educação (IBMR e UNA).

- GitHub: [github.com/fabcurvello](https://github.com/fabcurvello)
- LinkedIn: [linkedin.com/in/fabriciocurvello](https://www.linkedin.com/in/fabriciocurvello)
- YouTube: [@fabriciocurvello](https://www.youtube.com/@fabriciocurvello)
