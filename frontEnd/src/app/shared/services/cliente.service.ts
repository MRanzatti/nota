import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Cliente } from'../../model/cliente';


@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  constructor( private http: HttpClient ) {}

  public listar(id){
    return this.http.get<Cliente>("/api/cliente/", id);
  }
  public listartudo(cliente){
    return this.http.get<Cliente>("/api/cliente/", cliente);
  }
  public novo(cliente){
    return this.http.post<Cliente>("/api/cliente/", cliente);
  }
  public update(cliente) {
    return this.http.put<Cliente>("/api/cliente/", cliente);
  }
  public deletar(cliente){
    return this.http.delete<Cliente>("/api/cliente/", cliente);
  }


}
