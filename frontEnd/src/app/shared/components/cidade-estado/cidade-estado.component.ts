import {Component, NgModule, OnInit} from '@angular/core';
import {CommonModule} from '@angular/common';
import {DxFormModule} from 'devextreme-angular/ui/form';
import {DxSelectBoxModule} from 'devextreme-angular';
import {DxButtonModule} from 'devextreme-angular/ui/button';
import {Uf} from '../../../model/uf';
import {Municipio} from '../../../model/municipio';
import {HttpClient, HttpClientModule} from '@angular/common/http';

@Component({
  selector: 'app-cidade-estado',
  templateUrl: './cidade-estado.component.html',
  styleUrls: ['./cidade-estado.component.scss']
})
export class CidadeEstadoComponent implements OnInit {

  listaUfs: Uf[] = [];
  listaMunicipios: Municipio[] = [];

  urlEstados = 'https://servicodados.ibge.gov.br/api/v1/localidades/estados';
  urlCidades = 'https://servicodados.ibge.gov.br/api/v1/localidades/estados';

  constructor(private httpClient: HttpClient ) { }

  ngOnInit(): void {
    this.buscaUfs();
  }

  public buscaUfs(): void{
    this.httpClient.get(this.urlEstados)
       .subscribe((ufs: Uf[]) => {
      ufs.forEach(uf => {
        this.listaUfs.push (uf);
      });
    });
    console.log(this.listaUfs);
  }

  public buscaMunicipios(uf: Uf): void{
    const url: string = this.urlCidades + '/' + uf.id + '/municipios';
    this.httpClient.get(url)
      .subscribe((cidades: Municipio[]) => {
        cidades.forEach(municipio => {
          this.listaMunicipios.push(municipio);

        });
      });
    console.log(this.listaMunicipios);
  }

  getEstado(uf: Uf): void {
    this.listaMunicipios = [];
    if (uf){
      this.buscaMunicipios(uf);
    }
  }
}
@NgModule({
  imports: [
    CommonModule,
    DxSelectBoxModule,
    DxButtonModule,
    DxFormModule,
    HttpClientModule
  ],
  declarations: [ CidadeEstadoComponent ],
  exports: [ CidadeEstadoComponent ]
})
export class CidadeEstadoModule { }
