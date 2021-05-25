import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Cliente } from'../../model/cliente';


@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  constructor( private http: HttpClient ) {}

  public listar(cliente){
    return this.http.get<Cliente>("/api/cliente/", cliente.id);
  }
  public listarTudo(){
    return this.http.get<Cliente[]>("/api/cliente/");
  }
  public adicionar(cliente){
    return this.http.post<Cliente>("/api/cliente/", cliente);
  }
  public atualizar(cliente) {
    return this.http.put<Cliente>("/api/cliente/", cliente);
  }
  public deletar(cliente){
    return this.http.delete<Cliente>("/api/cliente/", cliente.id);
  }


}
