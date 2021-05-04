select * from cliente ;
select * from produto ;
select * from nota ;

insert into produto (descricao, valorunitario) value('sabao', 3.5);
insert into produto (descricao, valorunitario) value('arroz', 13);
insert into produto (descricao, valorunitario) value('oleo cozinha', 1.75);
insert into produto (descricao, valorunitario) value('ASS', 2.5);
insert into produto (descricao, valorunitario) value('Sonrrizal', 7);
insert into produto (descricao, valorunitario) value('Alicate', 23);
insert into produto (descricao, valorunitario) value('Parafuso', 0.5);
insert into produto (descricao, valorunitario) value('Porca', 0.3);

insert into cliente (nome, idade) value('Matheus', 20);
insert into cliente (nome, idade) value('Eliseu', 50);
insert into cliente (nome, idade) value('Ricardo', 49);

insert into nota (descricao, data, id_cliente) value('Supermercado', '2021-01-01', 1);
insert into notaitem (id_nota, id_produto, quantidade, valorunitario) value(1, 1, 5, 2);
insert into notaitem (id_nota, id_produto, quantidade, valorunitario) value(1, 2, 1, 10);
insert into notaitem (id_nota, id_produto, quantidade, valorunitario) value(1, 3, 3, 2);

insert into nota (descricao, data, id_cliente) value('Farmacia', '2021-01-01', 2);
insert into notaitem (id_nota, id_produto, quantidade, valorunitario) value(2, 4, 1, 4);
insert into notaitem (id_nota, id_produto, quantidade, valorunitario) value(2, 5, 2, 10);

insert into nota (descricao, data, id_cliente) value('Ferragista', '2021-01-01', 3);
insert into notaitem (id_nota, id_produto, quantidade, valorunitario) value(3, 6, 1, 20);
insert into notaitem (id_nota, id_produto, quantidade, valorunitario) value(3, 7, 30, .7);
insert into notaitem (id_nota, id_produto, quantidade, valorunitario) value(3, 8, 30, .2);



select A.id, A.data, B.nome
from nota A
join cliente B
on A.id_cliente = B.id
where 1=1
#and A.id = 1
;

select B.id, B.descricao, C.nome, D.descricao, A.quantidade, A.valorunitario, A.quantidade*A.valorunitario as total
#B.*, C.*, A.*, D.*
from notaitem A
join nota B
on A.id_nota = B.id
join cliente C
on B.id_cliente = C.id
join produto D
on A.id_produto = D.id
where 1=1
and id_nota = 1
;
