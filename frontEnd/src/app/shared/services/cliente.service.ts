import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Cliente } from'../../model/cliente';


@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  constructor( private http: HttpClient ) {


    listar(){
      return this.http.get<Cliente[]>('/api/cliente/');
    }

  }
}
