# salary-calculator

Exercício 3 - Aplicando a técnica de Test Driven Development (TDD), desenvolva as classes necessárias para resolver o problema descrito abaixo:

O participante deve implementar uma calculadora de salário de funcionários. Um funcionário contem nome, email, salário-base e cargo. De acordo com seu cargo, a regra para cálculo do salário líquido é diferente:

- Caso o cargo seja DESENVOLVEDOR, o funcionário terá desconto de 20% caso o salário seja maior ou igual que 3.000,00, ou apenas 10% caso o salário seja menor que isso;
- Caso o cargo seja DBA, o funcionário terá desconto de 25% caso o salário seja maior ou igual que 2.000,00, ou apenas 15% caso o salário seja menor que isso;
- Caso o cargo seja TESTADOR, o funcionário terá desconto de 25% caso o salário seja maior ou igual que 2.000,00, ou apenas 15% caso o salário seja menor que isso; e
- Caso o cargo seja GERENTE, o funcionário terá desconto de 30% caso o salário seja maior ou igual que 5.000,00, ou apenas 20% caso o salário seja menor que isso.