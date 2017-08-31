# AliasMES2017
Projeto Disciplina Manutenção e Evolução de Software

Este projeto apresenta a implementação de 03 heuristicas para indentificação de Alias em projetos GitHub.

A heuristica1(), permite identificar Alias a partir dos commits realizados em um projeto GitHub onde que possuam o mesmo nome mas que  apresentam email's diferentes.

A heuristica2(), permite identificar Alias a partir dos commits realizados em um projeto GitHub onde que possuam o mesmo email mas que  apresentam nomes diferentes.

A heuristica3(), permite identificar Alias a partir dos commits realizados em um projeto GitHub onde que possuam nomes similares (utilizando a similaridade de Levensthein para identificar) e que  apresentam email's diferentes.

Ele permite a utilização de apenas 02 heuristicas simultâneas, onde a heuristica default é a heuristica2() por referenciar como chave principal o email, podendo escolher entre a heuristica1() e heuristica3() para identificar Alias com chave principal sendo o nome.

Por default() as heuristicas que são utilizadas são heuristica1() e heuristica2().

Caso seja necessário utilizar a heuristica3(), deverá ser realizada auteração no código fonte ( Partes Comentadas do Código ).

## Execução

1 - Faça o download do projeto *
2 - Importe o projeto no eclipse \n
3 - Execute a classe Commits /n

## Exemplo Utilização

Digite a URL:|
https://github.com/airbnb/javascript |
Recuperando informações dos Commits |
............................................................|

### Resultado

Total de Usuários que realizaram Commits - 397

Total de Alias com Nomes Iguais - 16
Total de Alias com Emails Iguais - 3
Total de Alias Encontrado - 19

Relatório de Alias com Nomes Iguais
#######################################

Alias 1
Ross Allen - Ross Allen
ross@airbnb.com - reallen@gmail.com

Alias 2
Felix Sanz - Felix Sanz
me@felixsanz.com - felixsanz@users.noreply.github.com

Alias 3
Jan Hořava - Jan Hořava
czechinthemail@gmail.com - honzi@users.noreply.github.com

Alias 4
Harrison Shoff - Harrison Shoff
hi@hshoff.com - harry@airbnb.com

Alias 5
Stephen Wyatt Bush - Stephen Wyatt Bush
stephen.bush@airbnb.com - stephen.wyatt@gmail.com

Alias 6
Spike Brehm - Spike Brehm
spike@airbnb.com - ocelot@gmail.com

Alias 7
Jake Teton-Landis - Jake Teton-Landis
just.1.jake@gmail.com - jake.tl@airbnb.com

Alias 8
Alvin Sng - Alvin Sng
alvinsng@users.noreply.github.com - alvin.sng@airbedandbreakfast.com

Alias 9
Jordan Gensler - Jordan Gensler
jordan.gensler@airbnb.com - jordangens@gmail.com

Alias 10
Felipe Vargas - Felipe Vargas
fvargasx@gmail.com - git@fvgs.ai

Alias 11
Randall Reed, Jr - Randall Reed, Jr
rareed@xogrp.com - randallreedjr@gmail.com

Alias 12
Joe Lencioni - Joe Lencioni
joe.lencioni@airbnb.com - joe.lencioni@gmail.com

Alias 13
Kevin Cooper - Kevin Cooper
kcooper@yahoo-inc.com - cooperka92@gmail.com

Alias 14
Josh Perez - Josh Perez
josh@goatslacker.com - josh.perez@airbnb.com

Alias 15
Mitsuru Ogawa - Mitsuru Ogawa
mitsuru.ogawa.jp+github@gmail.com - mitsuru.ogawa.jp@gmail.com

Alias 16
Bishop Zareh - Bishop Zareh
bishop@compasslearning.com - xchicago@gmail.com

Relatório de Alias com Emails Iguais
#######################################

Alias 1
Mikael Finstad - mifi
finstaden@gmail.com - finstaden@gmail.com

Alias 2
Giang Nguyen - giang pi
nguyengiangdev@gmail.com - nguyengiangdev@gmail.com

Alias 3
SpenUK - Spen Taylor
spen_@hotmail.co.uk - spen_@hotmail.co.uk
