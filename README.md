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

1 - Faça o download do projeto<br />
2 - Importe o projeto no eclipse<br />
3 - Execute a classe Commits

## Exemplo Utilização

Digite a URL:<br />
https://github.com/airbnb/javascript<br />
Recuperando informações dos Commits<br />
............................................................

### Resultado

Total de Usuários que realizaram Commits - 397<br />

Total de Alias com Nomes Iguais - 16<br />
Total de Alias com Emails Iguais - 3<br />
Total de Alias Encontrado - 19<br />

Relatório de Alias com Nomes Iguais<br />
#######################################<br />

Alias 1<br />
Ross Allen - Ross Allen<br />
ross@airbnb.com - reallen@gmail.com<br />

Alias 2<br />
Felix Sanz - Felix Sanz<br />
me@felixsanz.com - felixsanz@users.noreply.github.com<br />

Alias 3<br />
Jan Hořava - Jan Hořava<br />
czechinthemail@gmail.com - honzi@users.noreply.github.com<br />

Alias 4<br />
Harrison Shoff - Harrison Shoff<br />
hi@hshoff.com - harry@airbnb.com<br />

Alias 5<br />
Stephen Wyatt Bush - Stephen Wyatt Bush<br />
stephen.bush@airbnb.com - stephen.wyatt@gmail.com<br />

Alias 6<br />
Spike Brehm - Spike Brehm<br />
spike@airbnb.com - ocelot@gmail.com<br />

Alias 7<br />
Jake Teton-Landis - Jake Teton-Landis<br />
just.1.jake@gmail.com - jake.tl@airbnb.com<br />

Alias 8<br />
Alvin Sng - Alvin Sng<br />
alvinsng@users.noreply.github.com - alvin.sng@airbedandbreakfast.com<br />

Alias 9<br />
Jordan Gensler - Jordan Gensler<br />
jordan.gensler@airbnb.com - jordangens@gmail.com<br />

Alias 10<br />
Felipe Vargas - Felipe Vargas<br />
fvargasx@gmail.com - git@fvgs.ai<br />

Alias 11<br />
Randall Reed, Jr - Randall Reed, Jr<br />
rareed@xogrp.com - randallreedjr@gmail.com<br />

Alias 12<br />
Joe Lencioni - Joe Lencioni<br />
joe.lencioni@airbnb.com - joe.lencioni@gmail.com<br />

Alias 13<br />
Kevin Cooper - Kevin Cooper<br />
kcooper@yahoo-inc.com - cooperka92@gmail.com<br />

Alias 14<br />
Josh Perez - Josh Perez<br />
josh@goatslacker.com - josh.perez@airbnb.com<br />

Alias 15<br />
Mitsuru Ogawa - Mitsuru Ogawa<br />
mitsuru.ogawa.jp+github@gmail.com - mitsuru.ogawa.jp@gmail.com<br />

Alias 16<br />
Bishop Zareh - Bishop Zareh<br />
bishop@compasslearning.com - xchicago@gmail.com<br />

Relatório de Alias com Emails Iguais<br />
#######################################<br />

Alias 1<br />
Mikael Finstad - mifi<br />
finstaden@gmail.com - finstaden@gmail.com<br />

Alias 2<br />
Giang Nguyen - giang pi<br />
nguyengiangdev@gmail.com - nguyengiangdev@gmail.com<br />

Alias 3<br />
SpenUK - Spen Taylor<br />
spen_@hotmail.co.uk - spen_@hotmail.co.uk
