# 🔐 Verificador de Senha em Java  

Este projeto é um programa simples em **Java** que verifica a força de uma senha com base em critérios específicos. Ele avalia se a senha atende a determinados requisitos de segurança e classifica sua força como **fraca, média, segura ou muito forte**.  

---

## 📌 Funcionalidades  

✅ **Entrada de senha pelo usuário**: O programa solicita que o usuário digite uma senha para análise.  

✅ **Critérios de avaliação**:  
- ✔️ Comprimento mínimo de **8 caracteres**  
- ✔️ Pelo menos **uma letra maiúscula**  
- ✔️ Pelo menos **uma letra minúscula**  
- ✔️ Pelo menos **um número**  
- ✔️ Pelo menos **um caractere especial** (`!@#$%^&*`)  

✅ **Classificação da senha**:  
- 🔴 **Fraca**: Atende a 2 ou menos critérios  
- 🟡 **Média**: Atende a 3 critérios  
- 🟢 **Segura**: Atende a 4 critérios  
- 🔵 **Muito Forte**: Atende a todos os critérios  

✅ **Interface simples via console**: O programa exibe mensagens diretas e fáceis de entender.  

---

## ⚙️ Tecnologias Utilizadas  

🔹 **Java (JDK 8 ou superior)**  

🔹 **Scanner (java.util.Scanner)** para entrada de dados.  

---

## 🚀 Como Executar o Projeto  

1️⃣ **Clone o repositório:**  
```bash
git clone https://github.com/seu-usuario/verificador-senha-java.git
cd verificador-senha-java

2️⃣ Abra o projeto em uma IDE (IntelliJ IDEA, Eclipse, VS Code).

3️⃣ Compile e execute o código:


javac VerificadorDeSenha.java
java VerificadorDeSenha

4️⃣ Interaja com o programa: Digite sua senha e veja a classificação de sua força.

📷 Exemplo de Execução

Digite sua senha: MinhaSenha123!  

Saída:   Sua senha é muito forte!  

📌 Melhorias Futuras

🔹 Personalização dos critérios: Permitir que o usuário defina os requisitos da senha.


🔹 Interface Gráfica: Criar uma versão com Java Swing ou JavaFX para uma melhor experiência.


🔹 Integração com banco de dados: Salvar senhas criptografadas para validação futura.


🔹 Geração de senhas seguras: Adicionar uma funcionalidade para sugerir senhas fortes automaticamente.



🔗 Autor:  📌 João Santos
