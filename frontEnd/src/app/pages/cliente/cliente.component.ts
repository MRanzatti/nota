import { Component, OnInit } from '@angular/core';
import {ClienteService} from "../../shared/services/cliente.service";
import {Cliente} from "../../model/cliente";

@Component({
  selector: 'app-cliente',
  templateUrl: './cliente.component.html',
  styleUrls: ['./cliente.component.scss']
})
export class ClienteComponent implements OnInit {

  cliente: Cliente = new Cliente();
  clientes: Cliente[] = [];

  constructor( private service: ClienteService) {
    this.onSalvarClick = this.onSalvarClick.bind(this);
    this.onNovoClick = this.onNovoClick.bind(this);
    this.onDeletarClick = this.onDeletarClick.bind(this);
  }

  ngOnInit(): void {
    this.populaGrid();
  }

  onSalvarClick(){
    if (this.cliente) {
      this.service.adicionar(this.cliente)
        .subscribe(c => {
          this.cliente = c;
          alert("Adicionado com Sucesso");
        });

    }
  }

  onNovoClick() {
    this.cliente = new Cliente();
  }

  /*onAlterarClick() {
    if (this.cliente)
      this.service.atualizar(this.cliente)
        .subscribe(c => {
          this.cliente = c
    alert("Atualizado com Sucesso");
  });
  }
*/

  onDeletarClick() {
    if (this.cliente)
      this.service.deletar(this.cliente)
        .subscribe(c => {
          this.populaGrid();
          this.cliente = null;
        });
  }

  populaGrid() {
    this.service.listarTudo()
      .subscribe(c =>
        this.clientes = c);
  }


}
