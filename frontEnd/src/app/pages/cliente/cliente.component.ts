import { Component, OnInit } from '@angular/core';
import {ClienteService} from "../../shared/services/cliente.service";
import {Cliente} from "../../model/cliente";

@Component({
  selector: 'app-cliente',
  templateUrl: './cliente.component.html',
  styleUrls: ['./cliente.component.scss']
})
export class ClienteComponent implements OnInit {

  cliente:Cliente = new Cliente();

  constructor( private service: ClienteService) {
    this.onSalvarClick = this.onSalvarClick.bind(this);
  }

  ngOnInit(): void {
  }

  onSalvarClick(){
    if (this.cliente)
      this.service.novo(this.cliente).subscribe(c => this.cliente = c);
  }
}
