### Camel Case Splitter
This relatively simple project was done as an assignment from the course "TDD – Desenvolvimento de Software Guiado por Testes", effectively translated as "TDD - Test Driven Development", from Brasil's Technological Institute of Aviation, ITA.

This challenge aims on training TDD basic skills and its main cyclic process and it's simply a CamelCase splitter, which correctly separates each section into a list of strings. The following test cases were given in its statement:

- **name:** “name” 
- **Name:** “Name” 
- **compositeName:** “composite”, “name” 
- **CompositeName:** “composite”, “composite” 
- **ID:** “ID” 
- **numberID:** “number”, “ID” 
- **numberIDEmployee:** “number”, “ID”, “employee” 
- **get10firsts:** “get”, “10”, “firsts” 
- **10firsts:** *Invalid* → Not allowed to start with numbers