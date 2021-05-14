import { Component, OnInit } from '@angular/core';
import {ClienteService} from "../../shared/services/cliente.service";
import {Cliente} from "../../model/cliente";

@Component({
  selector: 'app-cliente',
  templateUrl: './cliente.component.html',
  styleUrls: ['./cliente.component.scss']
})
export class ClienteComponent implements OnInit {

  cliente:Cliente[] =[];

  constructor( private service: ClienteService) {

  }

  ngOnInit(): void {
    this.buscaCliente();
  }

  public buscaCliente(): void{
    this.cliente = [];
    this.service.listar()
      .subscribe(cliente: Cliente)
  }

}
