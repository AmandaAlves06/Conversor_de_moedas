# 💱 Conversor de Moedas | Currency Converter

Um projeto simples em Java que utiliza uma API para converter valores entre diferentes moedas.  
A simple Java project that uses an API to convert values between different currencies.

---

## 📌 Descrição | Description

**PT-BR:**  
Este é um conversor de moedas feito em Java que consome a [ExchangeRate API](https://www.exchangerate-api.com/).  
O usuário escolhe duas moedas (origem e destino), insere o valor desejado e recebe a conversão atualizada em tempo real.

**EN:**  
This is a Java-based currency converter that consumes the [ExchangeRate API](https://www.exchangerate-api.com/).  
The user selects two currencies (from/to), enters the amount, and receives a real-time conversion.

---

## 🛠️ Funcionalidades | Features

- Menu interativo com Scanner
- Conversão entre 6 moedas pré-definidas
- Cotação atualizada em tempo real
- API consumida via `HttpClient` + `Gson`
- Comentários no código em dois idiomas (PT-BR/EN)

---

## 🔧 Tecnologias utilizadas | Technologies used

- Java 17
- IntelliJ IDEA
- Gson (para leitura de JSON)
- HTTPClient (para requisições)
- ExchangeRate API

---

## ▶️ Como executar | How to run

1. Clone este repositório:  
   `git clone https://github.com/seu-usuario/conversor-moedas.git`

2. Abra o projeto no IntelliJ IDEA

3. Certifique-se de que a biblioteca Gson esteja adicionada nas dependências.

4. Execute a classe `Main.java`  
   (`Run > Run Main` ou `Ctrl + Shift + F10`)

---

##💻 Veja o funcionamento do projeto neste vídeo demonstrativo:  

Watch the project in action in this demo video: https://drive.google.com/file/d/1E7Tol3_pNnlOVFrJvoZkH9EBQMcBUdyp/view?usp=drive_link

## 💡 Exemplo de uso | Example of use 

```bash
*******************************************
 Bem-vindo(a) ao Conversor de Moedas!
*******************************************

Escolha a conversão:

1) Dólar (USD) =>> Peso argentino (ARS)
2) Peso argentino (ARS) =>> Dólar (USD)
3) Dólar (USD) =>> Real brasileiro (BRL)
4) Real brasileiro (BRL) =>> Dólar (USD)
5) Dólar (USD) =>> Peso colombiano (COP)
6) Peso colombiano (COP) =>> Dólar (USD)

Digite a opção desejada:
> 3

Digite o valor que deseja converter:
> 100

➡ 100.00 USD = 549.04 BRL

